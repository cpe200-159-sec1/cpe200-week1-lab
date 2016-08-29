/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int sum1=0; int sum2=0; int sum3=0;
        for (int k=1; k<=i; k++){
            sum1 += k*k;
        }
        for (int j=1; j<=i; j++){
            sum2 += j;
        }
        sum3 = sum2*sum2;
        return sum3-sum1;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

