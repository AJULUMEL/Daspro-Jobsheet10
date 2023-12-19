import java.util.Arrays;

public class Numbers06 {
    public static void main(String[] args) {

        int panjangBaris = 5;

        int[][] myNumbers = new int[3][panjangBaris];

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }
    }
}
