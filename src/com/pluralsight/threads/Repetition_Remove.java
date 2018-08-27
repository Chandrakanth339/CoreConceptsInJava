package com.pluralsight.threads;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Repetition_Remove {

	// ABC-DEF DEF&ABC
	private static final String DELIMS = "[&| |-|AND]";
	private static final String MIN1 = "{1,}";
	private static final String MIN0 = "{0,}";
	private static final String ZERO = "{0}";
	private static final String SINGLE_SPACE = " ";
	private static final String ZERO_SPACE = "";

	public static void main(String[] argz) {
		String s1 = "A";
		String s2 = "A AND B AND C";
		String s3 = "C-A";
		boolean b = s2.matches("(.*)".concat(DELIMS).concat(ZERO).concat(s1).concat(DELIMS).concat(ZERO).concat("(.*)"));
		System.out.println(b);
		List<String> ar = new CopyOnWriteArrayList<>(Arrays.asList("a", "A B", "AB", "A-B", "A&B", "A AND B AND C",
				"B-A C", "B AND A", "B & A", "B - A", "B A"));

		Set<String> set = new LinkedHashSet<>();
		ar = ar.stream().map(String::toUpperCase).map(String::trim).collect(Collectors.toList());
		for (int j = 0; j < ar.size(); j++) {
			String s = ar.get(j);
			int repCount = 0;
			for (int i = 0; i < ar.size(); i++) {
				String lS = ar.get(i);
				if (ar.indexOf(s) == i) {
					continue;
				}
				if (checkIfCorrect(s, lS)) {
					ar.remove(ar.indexOf(lS));
					i--;
					repCount++;
				}
				if (i == ar.size() - 1 && repCount > 0) {
					set.add(s);
				}
			}

		}
		System.out.println(ar);
	}

	private static final boolean checkIfCorrect(String s, String lS) {
		boolean chkTrue = false;
		if (s.equals(lS)) {
			chkTrue = true;
		} else if (chkTru(s, lS)) {
			chkTrue = true;
		} else if (chkTru(s.replaceAll(SINGLE_SPACE, ZERO_SPACE), lS.replaceAll(SINGLE_SPACE, ZERO_SPACE))) {
			chkTrue = true;
		} else if (chkTru(lS, s)) {
			chkTrue = true;
		} else if (chkTru(lS.replaceAll(SINGLE_SPACE, ZERO_SPACE), s.replaceAll(SINGLE_SPACE, ZERO_SPACE)))
			;
		return chkTrue;

	}

	private static boolean chkTru(String s1, String s2) {
		boolean chkTrue = false;
		if (s1.replaceAll(DELIMS, ZERO_SPACE).equals(s2.replaceAll(DELIMS, ZERO_SPACE))) {
			chkTrue = true;
		}

		/*
		 * if (s1.replaceAll(" ", "").equals(s2.replaceAll(" ", ""))) { chkTrue = true;
		 * } else if (s1.replaceAll("-", "").equals(s2.replaceAll(" ", ""))) { chkTrue =
		 * true; } else if (s1.replaceAll("&", "").equals(s2.replaceAll(" ", ""))) {
		 * chkTrue = true; } else if (s1.replaceAll("AND", "").equals(s2.replaceAll(" ",
		 * ""))) { chkTrue = true; } else if (s1.replaceAll("-",
		 * "").equals(s2.replaceAll("&", ""))) { chkTrue = true; } else if
		 * (s1.replaceAll("-", "").equals(s2.replaceAll("AND", ""))) { chkTrue = true; }
		 * else if (s1.replaceAll("&", "").equals(s2.replaceAll("AND", ""))) { chkTrue =
		 * true; }
		 */
		return chkTrue;
	}

	public static StringTokenizer returnTokenizer(String str, String delim) {
		return new StringTokenizer(str, delim);
	}

}
