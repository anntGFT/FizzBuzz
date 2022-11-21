import org.example.Solution;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {

    Solution solution;
    int num;

    List<String> result;

    @BeforeEach
    void setup(){
        solution = new Solution();
        result = new ArrayList<>();
    }

    @Test
    public void given2returnListOfStrings(){
        num = 2;
        result.add("1");
        result.add("2");

        assertEquals(result, solution.fizzBuzz(num));
    }

    @Test
    public void given3returnListOfStrings(){
        num = 3;
        result.add("1");
        result.add("2");
        result.add("Fizz");

        assertEquals(result, solution.fizzBuzz(num));
    }

    @Test
    public void given15returnListOfStrings(){
        num = 15;
        result.add("1");
        result.add("2");
        result.add("Fizz");
        result.add("4");
        result.add("Buzz");
        result.add("Fizz");
        result.add("7");
        result.add("8");
        result.add("Fizz");
        result.add("Buzz");
        result.add("11");
        result.add("Fizz");
        result.add("13");
        result.add("14");
        result.add("FizzBuzz");

        assertEquals(result, solution.fizzBuzz(num));
    }
}
