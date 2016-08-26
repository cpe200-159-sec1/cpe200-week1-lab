/**
 * Implement findMax method which receives an array of integer and return the maximum number in the array.
 */
public class Lab1_3 {

    public int findMax(int[] inputs)
    {
        int max=0;
        for(int n=0;n<inputs.length;n++){
            if(inputs[n]>max)
                max=inputs[n];
        }


        return max;
    }

    public static void main(String[] args) {
        Lab1_3 l = new Lab1_3();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Max value is %d\n", l.findMax(inputs));
    }
}
