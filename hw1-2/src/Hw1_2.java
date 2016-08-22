import javafx.scene.input.KeyCode;

import static javafx.scene.input.KeyCode.F;

/**
 * Created by pruet on 11/8/2559.
 */
public class Hw1_2 {
    float gpaCalculation(int[] credit, int[] grade) {
        float sumGrade = 0f;
        float sumCredit = 0f;
        for (int i = 0; i < grade.length; i++) {
            sumGrade += credit[i] * grade[i];
            sumCredit += credit[i];
        }
        if (sumGrade == 0) {
            return 0;
        }
        return (sumGrade / sumCredit);
    }

    public static void main(String[] args) {
        int[] credit = {3, 3, 3, 3, 2};
        int[] grade  = {2, 4, 4, 3, 2};
        Hw1_2 h = new Hw1_2();
        System.out.printf("Your GPA is %f\n", h.gpaCalculation(credit, grade));
    }
}
