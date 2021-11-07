package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileConfig {

    public static File getFile(String pathname) {
        try {
            File file = new File(pathname);
            return file;
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public static FileType getFileType(File file) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] head = new byte[4];
            if (-1 == inputStream.read(head)) {
                return FileType.UNKNOWN;
            }
            int headHex = 0;
            for (byte b : head) {
                headHex <<= 8;
                headHex |= b;
            }
            return switch (headHex) {
                case 0x504B0304 -> FileType.ZIP;
                case 0x776f7264 -> FileType.TAR;
                case -0x51 -> FileType._7Z;
                case 0x425a6839 -> FileType.BZ2;
                case -0x74f7f8 -> FileType.GZ;
                case 0x52617221 -> FileType.RAR;
                default -> FileType.UNKNOWN;
            };
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return FileType.UNKNOWN;
    }

}
