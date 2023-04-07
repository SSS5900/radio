package ru.netology.projecting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setRadioStationNumber() {
        Radio rdo = new Radio();
        rdo.setCurrentRadioStationNumber(2);

        int expected = 2;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setRadioStationNumberAboveNine() {
        Radio rdo = new Radio();
        rdo.setCurrentRadioStationNumber(10);

        int expected = 0;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationNumber() {
        Radio rdo = new Radio();
        rdo.setCurrentRadioStationNumber(2);

        rdo.nextRadioStationNumber();

        int expected = 3;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationAfterNine() {
        Radio rdo = new Radio();
        rdo.setCurrentRadioStationNumber(9);

        rdo.nextRadioStationNumber();

        int expected = 0;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStationNumber() {
        Radio rdo = new Radio();
        rdo.setCurrentRadioStationNumber(7);

        rdo.prevRadioStationNumber();

        int expected = 6;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevRadioStationNumberBeforeZero() {
        Radio rdo = new Radio();
        rdo.setCurrentRadioStationNumber(0);

        rdo.prevRadioStationNumber();

        int expected = 9;
        int actual = rdo.getCurrentRadioStationNumber();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void increaseCurrentVolume() {
        Radio rdn = new Radio();
        rdn.setCurrentVolume(85);

        rdn.volumeUp();

        int expected = 86;
        int actual = rdn.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMaximum() {
        Radio rdn = new Radio();
        rdn.setCurrentVolume(100);

        rdn.volumeUp();

        int expected = 100;
        int actual = rdn.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseCurrentVolume() {
        Radio rdn = new Radio();
        rdn.setCurrentVolume(48);

        rdn.volumeDown();

        int expected = 47;
        int actual = rdn.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeBelowMinimum() {
        Radio rdn = new Radio();
        rdn.setCurrentVolume(0);

        rdn.volumeDown();

        int expected = 0;
        int actual = rdn.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
