/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade)
    {
        float GPA;
        float sum=0;
        float sumcredit=0;
        for(int i=0;i<grade.length;i++) {
            sum += grade[i] * credit[i];
            sumcredit += credit[i];
        }
        GPA = sum/sumcredit;
        return GPA;
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %.2f\n", h.gpaCalculation(credit, grade));
    }
}
