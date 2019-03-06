package com.company;

import java.io.File;
import java.util.Date;

public abstract class DiskElement implements Comparable<DiskElement>{
    protected File file;
    DiskElement(File file) {
        this.file = file;
    }
    protected abstract void print(int depth);
    public void print() {print(0);}
    public int compareTo(DiskElement other) {
        return this.file.getName().compareToIgnoreCase(other.file.getName());
    }

}
