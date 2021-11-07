package com.company;

import java.io.File;

public class ZipCompressionStrategy implements CompressionStrategy {

    @Override
    public void compressFile(File file) {
        System.out.println("Zip Compression");

    }
}
