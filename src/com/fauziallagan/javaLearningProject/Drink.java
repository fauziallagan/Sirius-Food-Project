package com.fauziallagan.javaLearningProject;

import java.io.IOException;
import java.util.Scanner;

public class Drink extends Main{
    public static void drink() throws IOException{
        int porsi,pilihan, bayar,total1, total, harga = 0;

        try{
            Scanner input = new Scanner(System.in);
            System.out.println("====================");
            System.out.println("   Menu Minuman     ");
            System.out.println("====================");
            System.out.println("| 1. Es Teh        |");
            System.out.println("| 2. Es Lemon Teh  |");
            System.out.println("| 3. Es Cappuciono |");
            System.out.println("| 4. Es Taro       |");
            System.out.println("==================");
            System.out.print("Silahkan pilih yang anda pesan : ");
            pilihan = input.nextInt();

            switch (pilihan){
                case 1:
                    harga = 5000;
                    System.out.println("Es Teh" + " harga : " +  harga );
                    break;
                case 2:
                    harga = 5000;
                    System.out.println("Es Lemon" + " harga : Rp. " + harga);
                    break;
                case 3:
                    harga = 5000;
                    System.out.println("Es Cappucino" + " harga : Rp. " + harga);
                    break;
                case 4:
                    harga = 5000;
                    System.out.println("Es Taro" + " harga : Rp. " + harga);
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