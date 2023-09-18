public class SumCalculator {

    public void calculateSum() {
        int sum = 0;
        System.out.println("Сумма: " + sum);
    }

    public void calculateSum(int num1) {
        int sum = num1;
        System.out.println("Сумма: " + sum);
    }

    public void calculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Сумма: " + sum);
    }

    public void calculateSum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        System.out.println("Сумма: " + sum);
    }

    public void calculateSum(int num1, int num2, int num3, int num4) {
        int sum = num1 + num2 + num3 + num4;
        System.out.println("Сумма: " + sum);
    }
}

class SumCalculatorTest{
    public static void main(String[] args) {
        SumCalculator a1 = new SumCalculator();
        a1.calculateSum();
        a1.calculateSum(4);
        a1.calculateSum(5,2);
        a1.calculateSum(8,9,4);
        a1.calculateSum(10,5,9,5);
    }

}