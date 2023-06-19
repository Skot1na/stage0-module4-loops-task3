package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i++){
            int digit = number%10;
            sum += digit;
            number = number / 10;
            System.out.println(sum);
        }
    }
}
