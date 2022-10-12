import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.net.Radio;

public class NewTest {

    @Test
    public void testStation1() {
        Radio radio = new Radio(30);

        radio.setStation(15);

        int actual = radio.getStation();
        int expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation2() {
        Radio radio = new Radio(30);

        radio.setStation(29);

        radio.next();

        int actual = radio.getStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation3() {
        Radio radio = new Radio(30);

        radio.setStation(28);

        radio.next();

        int actual = radio.getStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testStation4() {
        Radio radio = new Radio(30);
        radio.setStation(0);

        radio.prev();

        int actual = radio.getStation();
        int expected = 29;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testStation5() {
        Radio radio = new Radio(30);
        radio.setStation(1);

        radio.prev();

        int actual = radio.getStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume1() {
        Radio radio = new Radio(0,100);

        radio.setVolume(99);

        radio.up();

        int actual = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume2() {
        Radio radio = new Radio(0,100);

        radio.setVolume(100);

        radio.up();

        int actual = radio.getVolume();
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume3() {
        Radio radio = new Radio();
        radio.setVolume(100);

        radio.down();

        int actual = radio.getVolume();
        int expected = 99;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVolume4() {
        Radio radio = new Radio(0,100);
        radio.setVolume(0);

        radio.down();

        int actual = radio.getVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}