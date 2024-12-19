/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bank;

/**
 *
 * @author WINDOWS 11
 */
public class Bank {

    int saldo;

    public Bank(int saldo) {
        this.saldo = saldo;
    }

    void getsaldo() {
        System.out.println("selamat datangdi Bank ABC");
        System.out.println("saldo anda saat ini : " + saldo);
    }

    void simpanuang(int simpan) {
        saldo += simpan;
        System.out.println("simpan uang : " + simpan);
        System.out.println("saldo saat ini : " + saldo);

    }
    void ambiluang(int ambil) {
        saldo -= ambil;
        System.out.println("ambil uang : " + ambil);
        System.out.println("saldo saat ini : " + saldo);

    }
}
