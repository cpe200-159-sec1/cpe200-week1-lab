/**
 * Implement chooseMax method which receives two integers and return the maximum number among them.
 */
public class Lab1_1 {

    public int chooseMax(int input_a, int input_b)
    {
        /*
          Implement your code here
        */
        int temp=0;

        if(input_b>=input_a){
            temp=input_a;
            input_a=input_b;
            input_b=temp;
        }




        return input_a;
    }

    public static void main(String[] args) {
        Lab1_1 l = new Lab1_1();
        System.out.printf("Max value is %d\n", l.chooseMax(3, 4));
    }
}
