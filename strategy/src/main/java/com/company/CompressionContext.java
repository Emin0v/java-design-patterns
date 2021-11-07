package com.company;

import java.io.File;

public class CompressionContext {

    private CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void changeStrategy(CompressionStrategy compressionStrategy) {
        this.compressionStrategy = compressionStrategy;
    }

    public void createArchive(File file){
        compressionStrategy.compressFile(file);
    }
}
