package Arrays;

public class forEach {
    public static void main(String[] args) {
        int[][] diagonal = {
                {1, 3, 5},
                {11, 8, 18},
                {19, 39, 44}
        };

        int total = 0;

        for (int i=0; i<3; i++){

            System.out.println(diagonal[i][i]);

            total += diagonal[i][i];
            }
        System.out.println("Total " + total);

        }
    }


