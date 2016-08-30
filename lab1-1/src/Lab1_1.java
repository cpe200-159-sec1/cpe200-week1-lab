/**
 * Implement chooseMax method which receives two integers and return the maximum number among them.
 */
public class Lab1_1 {

    public int chooseMax(int input_a, int input_b)
    {
        if(input_a>input_b) return input_a;
        else return input_b;
    }

    public static void main(String[] args) {
        Lab1_1 l = new Lab1_1();
        System.out.printf("Max value is %d\n", l.chooseMax(3, 4));
    }
}
