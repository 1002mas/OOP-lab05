package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class SetComparator implements Comparator<String>{

	public int compare(String s1, String s2) {
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		if (a > b) {
			return 1;
		}else if (a < b) {
			return -1;
		} else {
			return 0;
		}
	}

}
