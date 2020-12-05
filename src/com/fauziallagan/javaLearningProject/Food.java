package com.fauziallagan.javaLearningProject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Food extends Kurs{
    public static void fastFood() throws IOException{
        int porsi,pilihan, bayar,total1, total, harga = 0;

        try{
        Scanner input = new Scanner(System.in);
        System.out.println("==================");
        System.out.println("   Menu Makanan   ");
        System.out.println("==================");
        System.out.println("| 1. Mie Ayam     |");
        System.out.println("| 2. Nasi Goreng  |");
        System.out.println("| 3. Mie Goreng   |");
        System.out.println("| 4. Mie Rebus    |");
        System.out.println("==================");
        System.out.print("Silahkan pilih yang anda pesan : ");
        pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                harga = 7000;
                System.out.printf("Mie Ayam" + " harga : %d", harga );
                break;
            case 2:
                harga = 1100;
                System.out.println("Mie Goreng" + " harga : Rp. " + harga);
                break;
            case 3:
                harga = 10000;
                System.out.println("Mie Rebus" + " harga : Rp. " + harga);
                break;
            case 4:
                harga = 10000;
                System.out.println("Nasi Goreng" + " harga : Rp. " + harga);
                break;
            default:
                System.out.println("Wrong Choice!. Try Again!");
                break;
        }
        System.out.println("Jumlah Porsi ? : ");
        porsi = input.nextInt();
        total =  (harga * porsi); // melakukan proses perhitungan dari nilai
        System.out.printf("Anda harus membayar : Rp. %d", total );//mencetak nilai dari objek total
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

