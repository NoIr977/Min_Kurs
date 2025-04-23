package excercise15UserMail;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class UserTest {

   @Test
   public void testNewEmail(){
       User mail = new User("mister.noll@gmail.com");

       mail.addEmail("firstg@gmail.com");
       mail.addEmail("second@gmail.com");
       mail.addEmail("third@gmail.com");

       assertEquals("mister.noll@gmail.com", mail.getEmail(0));
       assertEquals("firstg@gmail.com", mail.getEmail(1));
       assertEquals("second@gmail.com", mail.getEmail(2));
       assertEquals("third@gmail.com", mail.getEmail(3));

   }

   @Test
    public void tooManyAdded(){
       User mail = new User ("mister.noll@gmail.com");

       mail.addEmail("firstg@gmail.com");
       mail.addEmail("second@gmail.com");
       mail.addEmail("third@gmail.com");

       boolean added = mail.addEmail("NoPlace@gmail.com");
       assertFalse(added);

   }
}
