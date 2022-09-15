/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Percobaan 8 Penggunaan Operator Kondisi (?:)
package com.mycompany.jobsheet4prakpbo;

/**
 * Created by 21343062-Nesa Athallah
 * @author user
 */
public class kondisiOperator {
    public static void main(String[] args){
       String status = "";
       int grade = 50;
        
        //mendapatkan status pelajar
        status = (grade >= 60) ? "Passed" : "Fail";
        
        //print status
        System.out.println(status);
    }
}