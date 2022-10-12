import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.net.Radio;

public class RadioTest {

    @Test
    public void testStation1() {
        Radio radio = new Radio();
        radio.setStation(8);

        radio.next();

        int actual = radio.getStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation2() {
        Radio radio = new Radio();
        radio.setStation(9);

        radio.next();

        int actual = radio.getStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation3() {
        Radio radio = new Radio();
        radio.setStation(0);

        radio.prev();

        int actual = radio.getStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation4() {
        Radio radio = new Radio();
        radio.setStation(1);

        radio.prev();

        int actual = radio.getStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume1() {
        Radio radio = new Radio();
        radio.setVolume(9);

        radio.up();

        int actual = radio.getVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume2() {
        Radio radio = new Radio();
        radio.setVolume(10);

        radio.up();

        int actual = radio.getVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume3() {
        Radio radio = new Radio();
        radio.setVolume(1);

        radio.down();

        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume4() {
        Radio radio = new Radio();
        radio.setVolume(0);

        radio.down();

        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
