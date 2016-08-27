/**
 * Implement findMax method which receives an array of integer and return the maximum number in the array.
 */
public class Lab1_3 {

    public int findMax(int[] inputs)
    {
        for(int num =1; num< inputs.length; num++)
        {
            if(inputs[num]>inputs[0])
            {
                inputs[0]=inputs[num];
            }
        }
        return inputs[0];
    }

    public static void main(String[] args) {
        Lab1_3 l = new Lab1_3();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Max value is %d\n", l.findMax(inputs));
    }
}
