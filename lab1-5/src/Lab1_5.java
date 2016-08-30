/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }

    public int getSumSquare(int number) {
        return (int) Math.pow(
                ((number + 1) * number) / 2,
                2);
    }

    public int getSumOfSquares(int number) {
        if (number == 1) return 1;
        return (number * (number + 1) * (2 * number + 1)) / 6;
    }

    public int sumSquareDifference(int i) {
        return getSumSquare(i) - getSumOfSquares(i);
    }
}

