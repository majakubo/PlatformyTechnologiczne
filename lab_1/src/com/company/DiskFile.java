package com.company;

import java.io.File;
import java.util.stream.IntStream;

public class DiskFile extends DiskElement{
    DiskFile(File file) {
        super(file);
    }
    protected void print(int depth) {
        IntStream.range(0,depth).forEachOrdered(n -> System.out.print('-'));
        System.out.println(this.file.getName());
    }
}
