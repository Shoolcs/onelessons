package com.company;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Lenovo on 15.06.2016.
 */
public class write   {
    FileWriter dos = new FileWriter("C:\\Users\\Lenovo\\Desktop\\newfile.txt");

String text;
    public write(String text) throws IOException {

        dos.write(text);
        dos.flush();

    }
}

