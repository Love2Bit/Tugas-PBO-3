package com.tugaspbo3;

import java.util.Scanner;

public class Main {

    private static Object Siswa;

    public static void main(String[] hady) {


        //Membuat objek Hp
        Udin_Siswa Dellas = new Udin_Siswa();
        Siswa_Kelas Sheva = new Siswa_Kelas();


        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {

            aksi = input.nextLine();
           if (aksi.equalsIgnoreCase("0")) {
                System.exit(0);
            } else {
                System.out.println("Kamu salah pilih");
            }

            System.out.println("0.Keluar");

        }
    }
}
