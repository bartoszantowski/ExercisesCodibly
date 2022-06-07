package BubbleSort;

import java.util.Collections;
import java.util.List;

public class BubbleSort <T extends Comparable<T>>{
    public List<Number> sort(List<Number> input) {
        input.removeAll(Collections.singleton(null));
        int n = input.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (input.get(j).doubleValue() > input.get(j + 1).doubleValue()) {
                    Number temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
        System.out.println(input);
        return input;
    }
}

