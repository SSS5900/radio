package ru.netology.projecting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    Radio rdo = new Radio(20);

    @Test
    public void setRadioStationNumber() {
        rdo.setCurrentRadioStationNumber(18);

        int expected = 18;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioStationNumberAboveMax() {
        rdo.setCurrentRadioStationNumber(20);

        int expected = 0;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationNumber() {

        rdo.setCurrentRadioStationNumber(14);

        rdo.nextRadioStationNumber();

        int expected = 15;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationAfterMax() {
        rdo.setCurrentRadioStationNumber(19);

        rdo.nextRadioStationNumber();

        int expected = 0;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStationNumber() {
        rdo.setCurrentRadioStationNumber(11);

        rdo.prevRadioStationNumber();

        int expected = 10;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStationNumberBeforeZero() {
        rdo.setCurrentRadioStationNumber(0);

        rdo.prevRadioStationNumber();

        int expected = 19;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    // Тесты уровня звука

    @Test
    public void increaseCurrentVolume() {
        rdo.setCurrentVolume(85);

        rdo.volumeUp();

        int expected = 86;
        int actual = rdo.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMaximum() {
        rdo.setCurrentVolume(100);

        rdo.volumeUp();

        int expected = 100;
        int actual = rdo.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolume() {
        rdo.setCurrentVolume(48);

        rdo.volumeDown();

        int expected = 47;
        int actual = rdo.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowMinimum() {
        rdo.setCurrentVolume(0);

        rdo.volumeDown();

        int expected = 0;
        int actual = rdo.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
