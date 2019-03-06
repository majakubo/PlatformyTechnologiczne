package com.company;

import java.util.Comparator;
import java.util.Date;

class LexicographComp implements Comparator<DiskElement> {
    @Override
    public int compare(DiskElement e1, DiskElement e2) {
        return e1.file.getName().compareToIgnoreCase(e2.file.getName());
    }
}

class SizeComp implements Comparator<DiskElement> {
    @Override
    public int compare(DiskElement e1, DiskElement e2) {
        return Long.compare(e1.file.getTotalSpace(), e2.file.getTotalSpace());
    }
}

class NameLengthComp implements Comparator<DiskElement> {
    @Override
    public int compare(DiskElement e1, DiskElement e2) {
        return Integer.compare(e1.file.getName().length(), e2.file.getName().length());
    }
}

class DateComp implements Comparator<DiskElement> {
    @Override
    public int compare(DiskElement e1, DiskElement e2) {
        Date date1 = new Date(e1.file.lastModified());
        Date date2 = new Date(e2.file.lastModified());
        return date1.compareTo(date2);
    }
}