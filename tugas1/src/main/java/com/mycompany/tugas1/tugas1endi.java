/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas1;

import java.util.Scanner;

/**
 *
 * @author A-22
 */
public class tugas1endi {
    public static void main(String[] args) {
        int nilaiA = 10;
        int nilaiB = 20;
        
        double nilaiC = 8;
        double nilaiD = 3;
        
        boolean isPLus = true;
        
        System.out.println("nilaiA; " + nilaiA);
        System.out.println("nilaiB; " + nilaiB);
        System.out.println("nilaiC; " + nilaiC);
        System.out.println("nilaiD; " + nilaiD);
        System.out.println("isPLus; " + isPLus);
        
        Scanner input = new Scanner(System.in);
        System.out.println("masukkan nilai baru untuk nilaiA: ");
        nilaiA = input.nextInt();
        System.out.println("masukkan nilai baru untuk nilaiB: ");
        nilaiB = input.nextInt();
        System.out.println("masukkan nilai baru untuk nilaiC: ");
        nilaiC = input.nextDouble();
        System.out.println("masukkan nilai baru untuk nilaiD: ");
        nilaiD = input.nextDouble();
        System.out.println("masukkan nilai baru untuk isPlus (true/false): ");
        isPLus = input.nextBoolean();
        
        System.out.println("nilaiA; " + nilaiA);
        System.out.println("nilaiB; " + nilaiB);
        System.out.println("nilaiC; " + nilaiC);
        System.out.println("nilaiD; " + nilaiD);
        System.out.println("isPLus; " + isPLus);
        
        String nama = "";
        System.out.println("silahkan input nama lengkap: ");
        nama = input.nextLine();
        nama = input.nextLine();
        System.out.println("nama lengkap :" + nama);
         
    }
}
