package practice.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GroupTests {

//	@Test
//	void nullURL() {
//		assertThrows(NullPointerException.class, () -> {GroupWork.getQueryParameterValue(null, "any String");});
//	}
	
	@Test
    void testMinorWords() {
        assertEquals("The Lord of the Rings", GroupWork.titleCase("the lord of the rings"));
    }
    @Test
    void testTitleComma() {
        assertEquals("O Brother, Where Art Thou?", GroupWork.titleCase("o brother, where art thou?"));
    }
    @Test
    void testHyphenatedMajorWords() {
        assertEquals("Spider-Man 2", GroupWork.titleCase("spider-man 2"));
    }
    @Test
    void testAllCaps(){
        assertEquals("Vertigo", GroupWork.titleCase("VERTIGO"));
    }    
    @Test
    void testFirstWordConjunction() {
        assertEquals("For Whom the Bell Tolls", GroupWork.titleCase("for whom the bell tolls"));
    }
    @Test
    void testColon() {
        assertEquals("The Lord of the Rings: The Two Towers", GroupWork.titleCase("the lord of the Rings: the two Towers"));
    }
}
