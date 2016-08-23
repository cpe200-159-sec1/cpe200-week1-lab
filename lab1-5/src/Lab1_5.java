/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int i)
    {
        int a=0,b=0;
        if(i==1){
            for(int s=0;s<=i;s++){
                a+=s;
            }
            return a;
        }
        else {
            for(int s=0;s<=i;s++){
                a+=s*s;
            }
            for(int l=0;l<=i;l++){
                b+=l;
            }
            return (b*b)-a;
        }
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

