import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    private Parser parser;

    @BeforeEach
    void createInstance() {
    parser = new Parser();
    }

    @Test
    void letterShouldBeGivenProperDigit(){
        //given
        //when
        String actual = parser.encode("ola");
        //then
        assertEquals("6665552", actual);
    }

    @Test
    void letterIsNotCaseSensitive(){
        //given
        //when
        String actual = parser.encode("ADA");
        //then
        assertEquals("232", actual);
    }

}
