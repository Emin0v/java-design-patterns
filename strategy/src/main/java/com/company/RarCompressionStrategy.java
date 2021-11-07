package com.company;

import java.io.File;

public class RarCompressionStrategy implements CompressionStrategy{

    @Override
    public void compressFile(File file) {
        System.out.println("Rar Compression");
    }
}
