/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul21811082018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

/**
 *
 * @author LABSIKOMP01
 */
public class Lat2Modul21811082018 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkkan inputan anda : "); 
        String data1811082018 = inputan.nextLine();
        String path1811082018 = "File1811082018/DariKeyboard1811082018.txt";
        OutputStream output1811082018 = new FileOutputStream(path1811082018);
        System.out.println("Open "+path1811082018+" for writing ... ");
        for (int i = 0; i < data1811082018.length(); i++) {
            output1811082018.write((byte) data1811082018.charAt(i));
        }
        output1811082018.close();
        System.out.println("Output stream closed ... \n\n---------------------------");
        System.out.println("Reading  file");
        
        InputStream file1811082018 = new FileInputStream("File1811082018/DariKeyboard1811082018.txt");
        int dataread1811082018 = file1811082018.read();
        while(dataread1811082018 != -1){
            System.out.print((char)dataread1811082018);
            dataread1811082018 = file1811082018.read();
        }
        file1811082018.close();
        System.out.println("");
    }
}
