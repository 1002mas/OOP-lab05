package it.unibo.oop.lab05.ex1;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in order:
         * 
         * 1) Builds a TreeSet containing Strings
         */
        Set<String> treeSet = new TreeSet<>();

        /*
         * 
         * 2) Populates such Collection with all the Strings ranging from "1" to "20"
         */

        for (int i = 1; i < 21; i++) {
            treeSet.add(Integer.toString(i));
        }
        /*
         * 3) Prints its content
         */
        System.out.println(treeSet);

        /*
         * 4) Removes all those strings whose represented number is divisible by three
         */
        ArrayList<String> ar = new ArrayList<>();
        for (String s : treeSet) {
            if (Integer.parseInt(s) % 3 == 0) {
                ar.add(s);
            }
        }
        treeSet.removeAll(ar);

        /*
         * 5) Prints the content of the Set using a for-each costruct
         */

        for (String s : treeSet) {
            System.out.print(s + " ");
        }
        System.out.println();
        /*
         * 6) Verifies if all the numbers left in the set are even
         */


        boolean isEven = true;
        for (String s : treeSet) {
            if (Integer.parseInt(s) % 2 != 0) {
                isEven = false;
                break;
            }
        }

        if (isEven) {
            System.out.println("They are even");
        } else {
            System.out.println("There are odd");
        }
    }
}
