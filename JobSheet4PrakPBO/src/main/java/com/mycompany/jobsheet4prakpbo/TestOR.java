/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Percobaan 5 Penggunaan Operator Logika NOT
package com.mycompany.jobsheet4prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class TestOR {
    public static void main(String[] args){
        int i =0;
        int j =10;
        boolean test = true;
       
        //demonstrasi ||
        test = (i < 10) || (j++ >9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
        
        //demonstrasi
        test = (i < 10) || (j++ >9);
        System.out.println(i);
        System.out.println(j);
        System.out.println(test);
    }
}