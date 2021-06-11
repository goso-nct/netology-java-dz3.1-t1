package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();
    int actual;

    @Test
    void shouldInitFieldToZeroValues() {
        assertEquals(0, radio.getStation());
        assertEquals(0, radio.getVolume());
    }

    @Test
    void setStationTo5() {
        radio.setStation(5);
        actual = radio.getStation();
        assertEquals(5, actual);
    }

    @Test
    void setVolumeTo5() {
        radio.setVolume(5);
        actual =radio.getVolume();
        assertEquals(5, actual);
    }

    @ParameterizedTest
    @CsvSource(
        value={ "0, 1", "1, 2", "5, 6", "8, 9", "9, 0" }
    )
    void nextStation(int current, int expected) {
        radio.setStation(current);
        radio.nextStation();
        actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value={ "9, 8", "8, 7", "5, 4", "1, 0", "0, 9" }
    )
    void prevStation(int current, int expected) {
        radio.setStation(current);
        radio.prevStation();
        actual = radio.getStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value={ "0, 1", "1, 2", "5, 6", "9, 10", "10, 10" }
    )
    void increaseVolume(int current, int expected) {
        radio.setVolume(current);
        radio.increaseVolume();
        actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value={ "10, 9", "9, 8", "6, 5", "1, 0", "0, 0" }
    )
    void decreaseVolume(int current, int expected) {
        radio.setVolume(current);
        radio.decreaseVolume();
        actual = radio.getVolume();
        assertEquals(expected, actual);
    }
}