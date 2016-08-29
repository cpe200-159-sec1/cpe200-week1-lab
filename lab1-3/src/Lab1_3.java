/**
 * Implement findMax method which receives an array of integer and return the maximum number in the array.
 */
public class Lab1_3 {

    public int findMax(int[] inputs)
    {
        int max=0;
        for (int i=0; i<inputs.length; i++){
            if (inputs[i]>max)
                max=inputs[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Lab1_3 l = new Lab1_3();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Max value is %d\n", l.findMax(inputs));
    }
}
