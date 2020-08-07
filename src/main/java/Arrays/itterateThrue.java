package Arrays;

public class itterateThrue {
    public static void main(String[] args) {
        String[] animals = {"dog", "cat", "sloth"};

        for(int i=0; i<animals.length; i++) {
            System.out.printf("%d. %s\n", i, animals[i]);
        }
    }
}
