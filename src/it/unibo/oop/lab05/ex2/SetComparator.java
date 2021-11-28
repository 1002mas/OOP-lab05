package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class SetComparator implements Comparator<String> {

    public int compare(String s1, String s2) {
        return Integer.compare(Integer.parseInt(s1), Integer.parseInt(s2));
    }

}
