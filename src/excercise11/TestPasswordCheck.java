package excercise11;

import excercise10.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {
    @Test
    public void testCorrectPassword(){

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("pass#word1");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLessThen8Characters(){

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass1");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLessThen8CharactersAndNoDigits(){

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass1");

        //Assert
        assertEquals(expected, actual);
    }
    @Test

    public void testNoDigits(){

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("password");

        //Assert
        assertEquals(expected, actual);
    }
    @Test

    public void testNoSpecialCharacters(){

        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass4word");

        //Assert
        assertEquals(expected, actual);
    }
}
