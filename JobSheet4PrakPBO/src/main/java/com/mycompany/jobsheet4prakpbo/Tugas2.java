/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jobsheet4prakpbo;

/**
 * Created by 21343062 -Nesa Athallah
 * @author user
 */
public class Tugas2 {
    public static void main(String[]args){
        int a = 10;
        int b = 23;
        int c = 5;
        //mencari nilai maximal atau terbesar
        int max = c > (a > b ? a : b) ? c : ((a > b) ? a : b);

        System.out.println("number a = "+a);
        System.out.println("number b = "+b);
        System.out.println("number c = "+c);
        System.out.println("Nilai tertingginya adalah angka = "+max);
    }
}