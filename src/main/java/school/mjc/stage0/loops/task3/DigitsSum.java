package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        String numberString = number + "";

        for (int i = 0; i < numberString.length(); i++) {
            char digitChar = numberString.charAt(i);
            int digit = digitChar - '0';
            sum += digit;

        }
    }
}
