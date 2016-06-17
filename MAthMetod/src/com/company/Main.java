package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String s="",c,v,b;

        long numbeer;
        ArrayList array = new ArrayList();
        ArrayList array3 = new ArrayList();
        ArrayList array2 = new ArrayList();


                      write fd = new write("");
        for (int e = 0; e < 50; e++) {
            System.out.println("Введите натуральное число!");
            numbeer = scan.nextLong();


            for (long i = numbeer; i >0; i--) {
                if (i < 7) {
                    System.out.println("Число не кратне 7");
                     fd.dos.write("Число не кратне 7\r\n");
                    write fs=new write("Число не кратне 7\r\n");
                    break;
                }else if(i==7){
                    System.out.println("Число без остачи");
                    fd.dos.write("Число без остачи\r\n");
                    break;
                }
                else if (i > 7 ) {

                    if (i % 7 == 1) {
                        array.add(i);
                    }
                    if (i % 7 == 2) {
                        array2.add(i);
                    }
                    if (i % 7 == 5) {
                        array3.add(i);
                    }
                    if(i==8)break;


                }
            }
            if(numbeer>7){System.out.print("Числа кратные 7 , с остачей 1: ");
                fd.dos.write("Числа кратные 7 , с остачей 1: \r\n");
                for (int w = 0; w < array.size(); ) {
                    s=s+"[" + array.get(w) + "]" + " ";
                    System.out.print("[" + array.get(w) + "]" + " ");
                    fd.dos.write("[" + array.get(w) + "]" + " \r\n");


                    w++;
                }
                System.out.println();

                System.out.print("Числа кратные 7 , с остачей 2: ");
                fd.dos.write("Числа кратные 7 , с остачей 2: \r\n");
                for (int w = 0; w < array2.size(); w++) {
                    System.out.print("[" + array2.get(w) + "]" + " ");
                    fd.dos.write("[" + array2.get(w) + "]" + "\r\n");

                }
                System.out.println();


                System.out.print("Числа кратные 7 , с остачей 5: ");
                fd.dos.write("Числа кратные 7 , с остачей 5: \r\n");
                for (int w = 0; w < array3.size(); w++) {
                    System.out.print("[" + array3.get(w) + "]" + " ");
                    fd.dos.write("[" + array3.get(w) + "]" + " \r\n");

                }
                fd.dos.flush();
                System.out.println();}
                     fd.dos.write("");
            fd.dos.flush();


        }
fd.dos.write(s);
        fd.dos.flush();

        // write your code here
    }
}

