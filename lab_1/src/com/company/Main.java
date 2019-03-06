package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import java.io.File;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        File f = new File("Drzewo/");
        DiskDirectory dr = new DiskDirectory(f);
        dr.print(0);

        IntStream.range(0,10).forEachOrdered(n -> System.out.print('-'));
    }

}
