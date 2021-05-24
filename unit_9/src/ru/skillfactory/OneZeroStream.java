package ru.skillfactory;

import java.io.InputStream;

public class OneZeroStream extends InputStream {

    boolean isZero = false;
    int i = 0;

    private byte[] bytes = {'1', ' ', '0', ' '};

    public int read() {
        if (i >= bytes.length)
            i = 0;
        return bytes[i++];

    }
}
