package com.juven.java8.io;

import java.io.*;

public class IO {

    public static void dump(InputStream src, OutputStream desc) throws IOException {
        try(InputStream input = src; OutputStream out = desc) {
            byte[] data = new byte[1024];
            int length;
            while ((length = input.read(data)) != -1) {
                out.write(data, 0, length);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String inputPath = "E:\\aa.txt";
        String outputPath = "E:\\bb.txt";
        IO.dump(
                new FileInputStream(inputPath),
                new FileOutputStream(outputPath)
        );
    }
}
