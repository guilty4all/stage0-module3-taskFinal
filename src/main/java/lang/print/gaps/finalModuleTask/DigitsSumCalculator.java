package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int a = number % 10;
        int b = (number % 100)/10;
        int c = (number % 1000) /100;
        int d = number / 1000;
        System.out.println(a+b+c+d);
    }
}
