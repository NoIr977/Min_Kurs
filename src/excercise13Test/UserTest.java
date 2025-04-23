package excercise13Test;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {
    @Test
    public void testCorrectUser (){


         String userName = "Hello";
         String password = "Username ";

        User user = new User(userName, password);

        assertEquals(userName, user.getUserName());
        assertEquals(password, user.getPassword());

    }
    @Test
    public void checkTheNewUserName() {

        User name = new User("Hello", "User Name", true);
        assertTrue(name.isUserNameCheck());

    }
    @Test

    public void testSetUserName() {
        User name = new User("Hello", "User Name", true);

        name.setUserName("Carina Cross");

        assertEquals("Carina Cross",name.getUserName());
    }
    @Test
     public void testUserNameLength(){
        User name = new User("Irisa", "Hello");
        name.setUserName("abc");
        assertEquals("Irisa", name.getUserName());

    }
@Test
    public void testPasswordUpd(){
        User pass = new User( "Irisa", "SUUUUPERLOOORD");
        String newPassword = "ParolDlaMenya1";

        pass.setPassword(newPassword);
        assertEquals(newPassword, pass.getPassword());

    // Проверка: длина нового пароля от 7 до 20 символов
    int length = pass.getPassword().length();
    assertTrue(length >= 7 && length <= 20);
}
@Test
    public void testGetTypeOfUser(){
        User name = new User("Irisa", "Hello");
        assertEquals("normal",name.getTypeOfUser());

}
@Test
    public void testChangeTypeOfUser(){
        User name = new User ("Irisa","Hello");
        //String newUser = "admin";

        name.setTypeOfUser("normal");
        assertEquals("normal",name.getTypeOfUser());
}
@Test
    public void testPassDigits(){
        User name = new User("Irisa", "Hello!");
        name.setPassDigit("%3742ghsgd!G");

        assertEquals("%3742ghsgd!G", name.getPassDigit());
}

@Test
    public void testGoldMember(){
        User name = new User ("Irisa", "%3742ghsgd!G");
        for(int i = 0; i < 20; i++){
            name.login();
        }
        assertEquals("gold",name.getTypeOfUser());
}
}









