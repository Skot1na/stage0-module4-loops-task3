package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int num;
        int sum = 0;
        int number = 9;
        for (num = 9; num <= lengthOfLastNumber; num++){
            sum += number;
            number = number * 10 + 9;
        }
        System.out.println(sum);

    }
}
