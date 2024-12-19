/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfersAC;

/**
 *
 * @author WINDOWS 11
 */
public interface InterfaceAc {
    public static final int KEADAAN_HIDUP = 1;
    public static final int KEADAAN_MATI = 0;
    public static final int KEADAAN_DINGIN = 1;
    public static final int KEADAAN_PANAS = 0;
    
  
    public abstract void hidupkan();
    public abstract void matikan();
    public abstract void dinginkan();
    public abstract void panaskan();
}
