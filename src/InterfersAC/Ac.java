/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfersAC;

/**
 *
 * @author WINDOWS 11
 */
public class Ac implements InterfaceAc {

    int statusAC;
    int statusSuhu;

    public void hidupkan() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC Hidup");
        } else {
            System.out.println("Hidupkan AC! --> AC Hidup");
        }
    }

    public void matikan() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan Lampu! --> Lampu Mati");
        } else {
            System.out.println("Matikan Lampu! --> Lampu Sudah Mati Kok");
        }
    }
    public void dinginkan() {
        if (statusAC== KEADAAN_PANAS) {
            statusAC = KEADAAN_DINGIN;
            System.out.println("Ac sudah di Dinginkan! --> Ac Dingin");
        } else {
            System.out.println("AC sudah di Dingikan! --> AC sudah di Dinginkan Kok");
        }
    }

    public void panaskan() {
        if (statusAC== KEADAAN_DINGIN) {
            statusAC = KEADAAN_PANAS;
            System.out.println("Ac panas! --> Ac panas");
        } else {
            System.out.println("Ac sudah panas! --> Ac sudah panas kok");
        }
    }

}
