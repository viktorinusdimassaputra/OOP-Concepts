/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author WINDOWS 11
 */
public class BMI {
    double hasil;
    
    void bmi (double tinggi, double berat){
        hasil = berat /(tinggi * tinggi);
        
        System.out.println("hasil BMI adalah" + hasil);
        String category = getBMICategory(hasil);
        System.out.println("kategori BMI" + category);
        System.out.println("berat badan saya"+ berat);
        System.out.println("tinggi saya"+ tinggi);
        
    }
    
    public String getBMICategory(double hasil){
        if (hasil < 18.5){
            return "underweight";
        } else if (hasil >= 18.5 && hasil < 24.9){
            return "Normal weight";
        } else if (hasil >=25 && hasil <29.9){
            return "Overweight";
        } else { 
            return "obesity"; }}}
            
       
   

