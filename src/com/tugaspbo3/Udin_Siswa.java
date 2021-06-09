package com.tugaspbo3;


import java.util.Scanner;

public class Udin_Siswa  {


  public Udin_Siswa() {

    final double s_mapel1 , s_mapel2 , s_mapel3 , s_mapel4 , s_rata;

    Scanner input = new Scanner(System.in);

    System.out.println(" Apps Interface Menghitung Nilai Rata - Rata \n");

    System.out.print("Score Mapel 1: ");
    s_mapel1 = input.nextInt();

    System.out.print("Score Mapel 2 : ");
    s_mapel2 = input.nextInt();

    System.out.print("Score Mapel 3 : ");
    s_mapel3 = input.nextInt();

    System.out.print("Score Mapel 4 : ");
    s_mapel4 = input.nextInt();

    s_rata = (0.15 * s_mapel1 + 0.20 * s_mapel2 + 0.30 * s_mapel3 + 0.35 * s_mapel4);

    System.out.println(" memiliki score akhir "+s_rata);

  }

}
