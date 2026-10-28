import java.util.Scanner;

public class parkingfee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehicleType;
        int duration;
        int total = 0;

        System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
        vehicleType = sc.nextInt();

        do {
            if (vehicleType == 1 || vehicleType == 2) {
                System.out.print("Masukkan durasi (jam): ");
                duration = sc.nextInt();

                if (duration > 5) {
                    total += 12500;
                } else if (vehicleType == 1) {
                    total += duration * 3000;
                } else if (vehicleType == 2) {
                    total += duration * 2000;
                }
            }

            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            vehicleType = sc.nextInt();
        } while (vehicleType != 0);

        System.out.println("Total: Rp " + total);
    }
}