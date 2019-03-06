package com.company;

import java.io.File;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class DiskDirectory extends DiskElement {
    TreeSet<DiskElement> children = new TreeSet<>();

    DiskDirectory(File directory) {
        super(directory);
        for(File f: directory.listFiles()) {
            if(f.isDirectory()) {
                children.add(new DiskDirectory(f));
            } else if(f.isFile()) {
                children.add(new DiskFile(f));
            }
        }

    }
    protected void print(int depth) {
        IntStream.range(0,depth).forEachOrdered(n -> System.out.print('-'));
        System.out.println(this.file.getName());
        if(this.children != null) {
            for (DiskElement de : this.children) {
                de.print(depth + 4);
            }
        }
    }
}