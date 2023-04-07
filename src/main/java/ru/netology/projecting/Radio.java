package ru.netology.projecting;

public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber > 9) {
            return;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void nextRadioStationNumber() {
        if (currentRadioStationNumber == 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber + 1;
        }
    }

    public void prevRadioStationNumber() {
        if (currentRadioStationNumber == 0) {
            currentRadioStationNumber = 9;
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
        if (currentVolume == 100) {
            return;
        } else {
            currentVolume = currentVolume + 1;
        }

    }

    public void volumeDown() {
        if (currentVolume == 0) {
            return;
        } else {
            currentVolume = currentVolume - 1;
        }
    }


}


