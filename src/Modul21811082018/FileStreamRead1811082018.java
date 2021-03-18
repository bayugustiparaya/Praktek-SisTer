/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul21811082018;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author LABSIKOMP01
 */
public class FileStreamRead1811082018 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        InputStream file1811082018 = new FileInputStream("File1811082018/ReadFile1811082018.txt");
        int data1811082018 = file1811082018.read();
        while(data1811082018 != -1){
            System.out.print((char)data1811082018);
            data1811082018 = file1811082018.read();
        }
        file1811082018.close();
        System.out.println("");
    }
    
}
