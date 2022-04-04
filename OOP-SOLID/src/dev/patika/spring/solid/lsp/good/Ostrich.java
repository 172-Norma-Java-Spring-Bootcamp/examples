package dev.patika.spring.solid.lsp.good;

import java.io.File;
import java.io.IOException;

public class Ostrich implements Walk {


    @Override
    public void walking() throws IOException {
        File.createTempFile("", "");


    }

    public static void main(String[] args) {
        Walk ost = new Ostrich();

        try {
            ost.walking();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
