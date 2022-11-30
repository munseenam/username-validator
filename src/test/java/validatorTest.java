import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class validatorTest {

    @Test
    public void testValidateUserName() {
        validator word=new validator();
        boolean output=true;
        boolean val;
        String myword="world";
        val=word.validateUserName(myword);
        assertEquals(output,val);
    }
}