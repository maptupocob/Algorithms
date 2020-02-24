package Task1;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(exponention(2, 10));
    }

    private static int exponention(int i, int j) {
        if (j == 0) {
            return 1;
        }
        return i * exponention(i, --j);
    }
}
