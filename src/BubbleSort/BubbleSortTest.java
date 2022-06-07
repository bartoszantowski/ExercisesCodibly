package BubbleSort;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortTest {
    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void shouldBubbleSortIntegers() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1,4,5,6,8,3,8));
        List<Integer> output = new ArrayList<>(Arrays.asList(1,3,4,5,6,8,8));

        List<Double> result = bubbleSort.sort(input);

        Assert.assertEquals(output, result);
    }

    @Test
    public void shouldBubbleSortNegativeFloat() {
        List<Number> input = new ArrayList<>(Arrays.asList(-9.3,0.2,4,0.1,5,9));
        List<Number> output = new ArrayList<>(Arrays.asList(-9.3,0.1,0.2,4,5,9));

        List<Float> result = bubbleSort.sort(input);

        Assert.assertEquals(output, result);
    }

    @Test
    public void shouldBubbleSortEmpty() {
        List<Number> input = new ArrayList<>(Arrays.asList());
        List<Number> output = new ArrayList<>(Arrays.asList());

        List<Float> result = bubbleSort.sort(input);

        Assert.assertEquals(output, result);
    }

    @Test
    public void shouldBubbleSortNullValue() {
        List<Number> input = new ArrayList<>(Arrays.asList(null,5.0001));
        List<Number> output = new ArrayList<>(Arrays.asList(5.0001));

        List<Float> result = bubbleSort.sort(input);

        Assert.assertEquals(output, result);
    }

    @Test(expected = RuntimeException.class)
    public void shouldThrownRuntimeExceptionOnNullParameter() {
        List<Number> input = null;

        List<Float> result = bubbleSort.sort(input);
    }
}
