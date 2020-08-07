package Arrays;
// 1 2 3 4 5 6 7 8 9 10 11 12

public class Multiplication_table {
    public static void main(String[] args) {
        int[][] table = new int[12][12];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%3d\t", table[i][j]);;
            }
            System.out.println();
        }
    }
}
