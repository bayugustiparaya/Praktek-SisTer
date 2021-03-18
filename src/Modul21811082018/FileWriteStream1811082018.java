/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul21811082018;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author LABSIKOMP01
 */
public class FileWriteStream1811082018 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        String path1811082018 = "File1811082018/MengisiFile1811082018.txt";
        OutputStream output1811082018 = new FileOutputStream(path1811082018);
        System.out.println("Open "+path1811082018+" for writing ... ");
        String data1811082018 = "Contoh menulis file di java";
        for (int i = 0; i < data1811082018.length(); i++) {
            output1811082018.write((byte) data1811082018.charAt(i));
        }
        output1811082018.close();
        System.out.println("Output stream closed ... ");
    }
    
}
