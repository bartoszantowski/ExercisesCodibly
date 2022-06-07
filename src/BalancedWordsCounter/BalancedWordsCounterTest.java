package BalancedWordsCounter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BalancedWordsCounterTest {
    private BalancedWordsCounter balancedWordsCounter;

    @Before
    public void setUp() {
        balancedWordsCounter = new BalancedWordsCounter();
    }

    @Test
    public void shouldBalancedWordsCounter() {
        String input = "aabbabcccba";
        int output = 28;
        int result = balancedWordsCounter.count(input);
        Assert.assertEquals(output, result);
    }

    @Test
    public void shouldBalancedWordsCounterEmptyInput() {
        String input = "";
        int output = 0;
        int result = balancedWordsCounter.count(input);
        Assert.assertEquals(output, result);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrownRuntimeExceptionOnWrongParameter() {
        String input = "abababa1";
        int result = balancedWordsCounter.count(input);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrownRuntimeExceptionOnNullParameter() {
        String input = null;
        int result = balancedWordsCounter.count(input);
    }
}
