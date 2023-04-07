package ru.netology.projecting;

public class Radio {
    private int RadioStationNumber = 10;
    private int maxRadioStationNumber = RadioStationNumber - 1;
    private int currentRadioStationNumber;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radio(int RadioStationNumber) {
        this.RadioStationNumber = RadioStationNumber;
        this.maxRadioStationNumber = RadioStationNumber - 1;
        this.currentRadioStationNumber = currentRadioStationNumber;


    }

    public Radio() {
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > maxRadioStationNumber) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber == maxRadioStationNumber) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = maxRadioStationNumber;
        } else {
            currentRadioStationNumber = currentRadioStationNumber - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }

    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }


}


