package org.example;

public class LoopExercises {
    public int sum(int n) {
            int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = i;
        }
        return sum;
    }

    public int sumUntilEven(int n) {
        int sum = 0;
        int counter = 0;
            while (sum % 2 != 0 || counter == 0) {
            }
        sum += n;
            counter++;
            n++;

        return sum;
    }
}

//return and finish last loop
