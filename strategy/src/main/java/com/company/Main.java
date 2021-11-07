package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Pathname: ");

        String pathname = sc.nextLine();
        File file = FileConfig.getFile(pathname);

        FileType fileType = FileConfig.getFileType(file);

        if (fileType == FileType.RAR) {
            new CompressionContext(new RarCompressionStrategy())
                    .createArchive(file);
        } else if (fileType == FileType.ZIP) {
            new CompressionContext(new ZipCompressionStrategy())
                    .createArchive(file);
        } else if (fileType == FileType.UNKNOWN){
            System.out.println("FileType Unknown");
        }

    }
}
