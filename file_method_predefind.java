/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.File;
/**
 *
 * @author Dell 3567 7i3
 */
public class file_method_predefind {
    public static void main(String args[])throws Exception{
    File f=new File("C:\\Users\\Dell35677i3\\Desktop\\notepadJAVA\\javafile\\myfileinnot.txt");
    File d=new File("C:\\Users\\Dell35677i3\\Desktop\\notepadJAVA\\javafile\\myfilechangename.txt");
    f.renameTo(d); //rename() method use -->change name
   // f.createNewFile();
   // f.delete();
}
}