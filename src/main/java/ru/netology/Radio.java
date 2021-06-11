package ru.netology;

public class Radio {

    static final int MIN_STATION = 0;
    static final int MAX_STATION = 9;
    static final int MIN_VOLUME  = 0;
    static final int MAX_VOLUME  = 10;

    private int station;
    private int volume;

    public void nextStation() {
        station = (station != MAX_STATION) ? station + 1 : MIN_STATION ;
    }

    public void prevStation() {
        station = station != MIN_STATION ? station - 1 : MAX_STATION ;
    }

    public void increaseVolume() {
        volume = volume != MAX_VOLUME ? volume + 1 : MAX_VOLUME ;
    }

    public void decreaseVolume() {
        volume = volume != MIN_VOLUME ? volume - 1 : MIN_VOLUME ;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        this.station = station;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
