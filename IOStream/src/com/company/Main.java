package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        /* byte data[]=new byte[10];
        System.out.println("Enter some charactes: ");
        System.in.read(data);
        System.out.println("You Entered: ");
        for(int i=0;i<data.length;i++){
            System.out.print((char)data[i]);*/
       /* File file=new File("src/test.txt");

        try(FileInputStream fileInputStream=new FileInputStream(file)){

            System.out.println("Total size to read in bytes is: "+ fileInputStream.available());
            int content;
            while((content=fileInputStream.read())!=-1){
                System.out.print((char)content);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }*/
        File file=new File("src/text.txt");

        try(FileWriter fileWriter=new FileWriter(file)){
           // System.out.println("This is amazing...");
            fileWriter.write("This is amazing!...and so so pretty");
            fileWriter.close();

            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }





    }
}

