package ru.netology;

public class Radio {

    private int MIN_STATION = 0;
    private int MAX_STATION = 9;
    private int MIN_VOLUME  = 0;
    private int MAX_VOLUME  = 10;

    private int station;
    private int volume;

    public void nextStation() {
        station = (station != MAX_STATION) ? ++station : MIN_STATION ;
    }

    public void prevStation() {
        station = station != MIN_STATION ? --station : MAX_STATION ;
    }

    public void increaseVolume() {
        volume = volume != MAX_VOLUME ? ++volume : MAX_VOLUME ;
    }

    public void decreaseVolume() {
        volume = volume != MIN_VOLUME ? --volume : MIN_VOLUME ;
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
