package com.fauziallagan.javaLearningProject;

import java.io.IOException;
import java.util.Scanner;

public class Dessert {
    public static void dessert() throws IOException{
        int porsi,pilihan, bayar,total1, total, harga = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("==================");
            System.out.println("   Menu Dessert   ");
            System.out.println("==================");
            System.out.println("| 1. Pudding      |");
            System.out.println("| 2. Es Krim      |");
            System.out.println("| 3. Kue          |");
            System.out.println("| 4. Pie          |");
            System.out.println("==================");
            System.out.print("Silahkan pilih yang anda pesan : ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    harga = 4000;
                    System.out.printf("Pudding" + " harga : %d", harga );
                    break;
                case 2:
                    harga = 10000;
                    System.out.println("Es Krim" + " harga : Rp. " + harga);
                    break;
                case 3:
                    harga = 6000;
                    System.out.println("Kue" + " harga : Rp. " + harga);
                    break;
                case 4:
                    harga = 10000;
                    System.out.println("Pie  " + " harga : Rp. " + harga);
                    break;
                default:
                    System.out.println("Wrong Choice!. Try Again!");
                    break;
            }
            System.out.print("Jumlah Pesanan ? : ");
            porsi = input.nextInt();
            total =  (harga * porsi); // melakukan proses perhitungan dari nilai
            System.out.print("Anda harus membayar : Rp. "+ total );//mencetak nilai dari objek total
            System.out.print("\nBayar : Rp. ");
            bayar = input.nextInt();
            total1 =(bayar - total);
            if (total1 >= 0){
                System.out.println("Kembaliannya : Rp. " +total1);//mencetak nilai dari objek total1

            }else{
                System.err.println("Uang Anda Tidak Mencukupi!.");
            }
        }catch (Exception ex){
            System.err.println("Error!");
        }
    }
}
