package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int multiplier = 0;
        int result = 1;
        while (counter <= printToInclusive) {
            System.out.println(result);
            multiplier++;
            result *= multiplier;
            counter++;
        }
    }
}
