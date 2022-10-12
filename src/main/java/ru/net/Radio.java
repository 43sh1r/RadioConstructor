package ru.net;

public class Radio {
    private int station;
    private int volume;
    private int maxStation;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;
    }

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > maxStation) {
            return;
        }
        station = newStation;

    }

    public Radio(int minVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume) {
            return;
        }
        volume = newVolume;
    }


    public void next() {
        if (station < maxStation) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station > 0) {
            station--;
        } else {
            station = maxStation;
        }
    }

    public void up() {
        if (volume < maxVolume) {
            volume++;
        } else {
            return;
        }
    }

    public void down() {
        if (volume > minVolume) {
            volume--;
        } else {
            return;
        }
    }

}
