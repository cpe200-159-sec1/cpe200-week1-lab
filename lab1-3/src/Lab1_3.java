/**
 * Implement findMax method which receives an array of integer and return the maximum number in the array.
 */
public class Lab1_3 {

    public int findMax(int[] inputs)
    {
        int max=0;
        int a;
        for (int i=0;i<inputs.length;i++)
            for (int j=i+1;j<inputs.length;j++)
                if (inputs[j] > inputs[i])
                {
                    a = inputs[i];
                    inputs[i] = inputs[j];
                    inputs[j] = a;
                }
        return inputs[0];
    }

    public static void main(String[] args) {
        Lab1_3 l = new Lab1_3();
        int[] inputs = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.printf("Max value is %d\n", l.findMax(inputs));
    }
}
