/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int n)
    {
        int sum = 0, sum_2 = 0;
        for (int i = 0; i < n; i++) {
            sum += (i + 1);
            sum_2 += Math.pow(i + 1, 2);
        }

        return (int) (Math.pow(sum, 2) - sum_2);
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

