/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int sum = 0;
        int sumSquare;
        int sumEach = 0;
        for (int n = 1; n <= i; n++) {
            sum += n;
            sumEach += (n * n);
        }
        sumSquare = sum * sum;

        return sumSquare - sumEach;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

