/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {


    public int sumSquareDifference(int i)
    {
        int sum_a=0,sum_b=0;
        for(int j=1;j<=i;j++){
            sum_a+=(j*j);
            sum_b+=j;
        }
        sum_b*=sum_b;
        return sum_b-sum_a;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

