/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penanganan_error;

/**
 *
 * @author ACER
 */
public class Exc12 {
    public static void main (String [] args) {
        byte[] b = new byte[5];
        try {
            System.in.read(b);
        } catch (java.io.IOException e) {
            System.err.println(e.getMessage());
        } 
         System.out.println("Hasil : " + (char) b[0] + (char) b[1] + (char) b[2]);
    }
}
