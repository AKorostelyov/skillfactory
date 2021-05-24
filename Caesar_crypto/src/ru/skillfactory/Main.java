package ru.skillfactory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Cipher cipher = new Cipher(16);
        IOManager.writeLine("src/ru/skillfactory/files/EncryptResult.txt",
                cipher.process(
                        IOManager.read("src/ru/skillfactory/files/InputFile.txt"),
                        true)
                        .toString());
    }
}
