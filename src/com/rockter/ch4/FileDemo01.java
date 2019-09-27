package com.rockter.ch4;

import java.io.File;
import java.io.IOException;

import static java.lang.Thread.sleep;

public class FileDemo01 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File src = new File("/Users/rockter/Desktop/123.txt");
        src.createNewFile();
        sleep(3000);
        src.delete();
    }
}
