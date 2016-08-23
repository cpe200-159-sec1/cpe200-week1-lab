/**
 * base on this problem https://projecteuler.net/problem=6 . Implement the subSquareDifference(i) where is a natural
 * number, and the output of the function will be the difference between the sum of the square of first i natural number
 * and the square of the sum the first i natural number.
 */
public class Lab1_5 {

    public int sumSquareDifference(int input)
    {
        /**
         * Your code here
         */
        //int size = inputs.length;

        int sum1=0,sum2=0,df=0;

        if(1==input){
            df=1;
            return df;
        }


        for(int i=1;i <= input;i++){
            sum1 += i;
        }
        sum1=sum1*sum1;

        for(int i=1;i <= input;i++){
            sum2 += i*i;
        }

        df = sum1-sum2;

        if(df < 0){
            df = 0-df;
        }


        return df;
    }

    public static void main(String[] args) {
        Lab1_5 l = new Lab1_5();
        System.out.printf("Result is %d\n", l.sumSquareDifference(10));
    }
}

