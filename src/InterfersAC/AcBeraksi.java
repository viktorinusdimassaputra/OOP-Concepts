/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfersAC;

/**
 *
 * @author WINDOWS 11
 */
public class AcBeraksi {
    public static void main(String[] args) {
        Ac ac = new Ac();
        System.out.println("Status ac saat ini : Mati");
        ac.hidupkan();
        ac.hidupkan();
        ac.matikan();
        ac.hidupkan();
        ac.matikan();
        ac.matikan();
        
        System.out.println("\nStatus suhu ac saat ini : Panas" );
        ac.dinginkan();
        ac.dinginkan();
        ac.panaskan();
        ac.dinginkan();
        ac.panaskan();
        ac.panaskan();
    }
}
