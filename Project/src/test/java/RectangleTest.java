import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class RectangleTest {
    @Test
    public void calculateAreaOnPositiveWidthAndHeight() {

        int width = 5;
        int height = 10;

        Rectangle rectangle = new Rectangle(width, height);

        int realArea = width * height;
        int calculatedArea = rectangle.computeArea();

        assertEquals(realArea, calculatedArea);
    }

    @Test
    public void calculateAreaOnZeroWidthAndNotZeroHeight() {

        int width = 0;
        int height = 10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void calculateAreaOnNotZeroWidthAndZeroHeight() {

        int width = 10;
        int height = 0;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Height should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }


    @Test
    public void calculateAreaOnNegativeWidthAndPositiveHeight() {

        int width = -3;
        int height = 10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }

    @Test
    public void calculateAreaOnPositiveWidthAndNegativeHeight() {

        int width = 10;
        int height = -4;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Height should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);
    }

    @Test
    public void calculateAreaOnNegativeWidthAndNegativeHeight() {

        int width = -3;
        int height = -10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle(width, height);
        });

        String realMessage = "Width should be positive!";
        String gotMessage = exception.getMessage();
        assertEquals(realMessage, gotMessage);

    }




}
