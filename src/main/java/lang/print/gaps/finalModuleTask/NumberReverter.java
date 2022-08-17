package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstNum = number %10;
        int secondNum = (number%100)/10;
        int thirdNum = number / 100;

        System.out.println(firstNum+""+secondNum+""+thirdNum);
    }
}
