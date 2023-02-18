import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DragonCaveTest {
    public DragonCave obj;

    @BeforeEach
    public void setup() {
        System.out.println("Instantiating object...");
        obj = new DragonCave();
    }

    @Test
    public void test1() {

        // Act: execute the method you are testing
        String actual = obj.welcome();

        // Assert: check whether the actual result is equal to the expected result
        String expected = "You are in a land full of dragons. In front of you,\r\n" +
                "\r\n" +
                "you see two caves. In one cave, the dragon is friendly\r\n" +
                "\r\n" +
                "and will share his treasure with you. The other dragon\r\n" +
                "\r\n" +
                "is greedy and hungry and will eat you on sight.\r\n" +
                "\r\n" +
                "Which cave will you go into? (1 or 2)";
        Assertions.assertEquals(expected, actual); //Go and check for us
    }
}
