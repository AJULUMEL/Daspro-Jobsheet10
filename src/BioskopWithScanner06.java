import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (isValidSeat(baris, kolom, penonton)) {
                        if (penonton[baris - 1][kolom - 1] == null) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        } else {
                            System.out.println("Maaf, kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                        }
                    } else {
                        System.out.println("Nomor baris atau kolom kursi tidak valid. Silakan pilih kembali.");
                    }
                    break;

                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.printf("*** \t");
                            } else {
                                System.out.printf("%s \t", penonton[i][j]);
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }

            System.out.print("Kembali ke menu? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        return baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length;
    }
}
