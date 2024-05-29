import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void a4Increment1Returns5(){
        //Arrange
        int a = 4;
        //Act
        a++;
        Assertions.assertEquals(5, a);
    }
    @Test
    public void a16Increment1Returns17(){
        //Arrange
        int a = 16;
        //Act
        a++;
        Assertions.assertEquals(17, a);
    }
    @Test
    public void sum8Plus16Returns24(){
        //Arrange
        int a = 16;
        int b = 8;
        //Act
        int sum = b + a;
        //Assert
        Assertions.assertEquals(24, sum);
    }
    @Test
    public void sumMinus8PlusMinus16Returns24(){
        //Arrange
        int a = -16;
        int b = -8;
        //Act
        int sum = b + a;
        //Assert
        Assertions.assertEquals(-24, sum);
    }
    @Test
    public void subtract6From18Return12(){
        //Arrange
        int a = 6;
        int b = 18;
        //Act
        int minus = b - a;
        //Assert
        Assertions.assertEquals(12, minus);
    }
    @Test
    public void subtractminus6From18Return12(){
        //Arrange
        int a = -6;
        int b = 18;
        //Act
        int minus = b - a;
        //Assert
        Assertions.assertEquals(24, minus);
    }
    @Test
    public void multiply6By10Returns60(){
        //Arrange
        int a = 6;
        int b = 10;
        //Act
        int multiply = 6 * 10;
        //Assert
        Assertions.assertEquals(60, multiply);
    }
    @Test
    public void multiplyMinus6ByMinus10Returns60(){
        //Arrange
        int a = -6;
        int b = -10;
        //Act
        int multiply = 6 * 10;
        //Assert
        Assertions.assertEquals(60, multiply);
    }
    @Test
    public void divide18by3Returns6(){
        //Arrange
        int a = 18;
        int b = 3;
        //Act
        int division = a / b;
        //Assert
        Assertions.assertEquals(6, division);
    }
    @Test
    public void checkIfBNotEquals0() {
        //Arrange
        int b = 6;
        //Act&Assert
        Assertions.assertNotEquals(0, b);
    }
}
