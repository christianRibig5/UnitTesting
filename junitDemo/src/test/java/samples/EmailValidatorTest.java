package samples;


import static org.junit.Assert.assertTrue;

import org.junit.Test;
import samples.EmailValidator;

public class EmailValidatorTest {

    @Test
    public void validate(){
        assertTrue(EmailValidator.validate("info@chrisonyeukwu.com"));
    }

}