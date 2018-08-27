package com.pluralsight.threads;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class PracticeThread {
	static CopyOnWriteArrayList<String> arList = new CopyOnWriteArrayList<>();

	public static void main(String[] argz) {
		Set<String> anotherSet = new LinkedHashSet<>();
		arList.addAll(Arrays.asList("ABC D", "ABCD", "D ABC", "ABC-DEF", "DEF-ABC", "DEF-ABC GHI", "ABC AND DEF",
				"ABC&DEF", "GEF I"));
		arList.forEach(s -> s.toUpperCase());
		Set<String> s = new TreeSet<>();
		for (int i = 0; i < arList.size(); i++) {
			String s2 = arList.get(i);
			boolean a = false;
			for (int j = 0; j < arList.size(); j++) {
				if ((getCheck(s2, arList.get(j))) && arList.indexOf(s2) != arList.indexOf(arList.get(j))) {
					arList.remove(j);
					j--;
					a = true;
				}
			}
			if (a) {
				anotherSet.add(arList.get(i));
			}
		}
		s.addAll(anotherSet);
		s.addAll(arList);
		System.out.println(s);
		System.out.println(anotherSet);

		arList.forEach((a) -> System.out.println(a));
	}

	static boolean getCheck(String s, String listE) {
		boolean matcher = false;
		if ((s.replaceAll("\\s", "").equals(listE.replaceAll("\\s", "")))) {
			matcher = true;
		} else if (checkRegex(s, listE)) {
			matcher = true;
		}

		return matcher;
	}

	static boolean checkRegex(String s, String j) {
		StringTokenizer strT = returnStringTokenizer(j, " ");
		int num = strT.countTokens();
		int countT = 0;
		boolean trueRegex = false;
		while (strT.hasMoreTokens()) {
			String nT = strT.nextToken();
			if (s.contains(nT)) {
				countT++;
			}
		}
		if (countT == num) {
			trueRegex = true;
		} else {
			// strT = returnStringTokenizer(j, "&");
			// StringTokenizer strT2 = returnStringTokenizer(s, "-");
			int count = 0;
			trueRegex = (compareTokens(returnStringTokenizer(s, "&"), returnStringTokenizer(j, "-"),s,j,"&","-")
					|| compareTokens(returnStringTokenizer(s, "&"), returnStringTokenizer(j, "AND"),s,j,"&","AND")
					|| compareTokens(returnStringTokenizer(s, "AND"), returnStringTokenizer(j, "-"),s,j,"AND","-")
					|| compareTokens(returnStringTokenizer(s, " "), returnStringTokenizer(j, "&"),s,j," ","&")
					|| compareTokens(returnStringTokenizer(s, " "), returnStringTokenizer(j, "-"),s,j," ","-")
					|| compareTokens(returnStringTokenizer(s, " "), returnStringTokenizer(j, "AND"),j,s," ","AND")
					|| compareTokens(returnStringTokenizer(j, " "), returnStringTokenizer(s, "-"),j,s," ","-")
					|| compareTokens(returnStringTokenizer(j, " "), returnStringTokenizer(s, "AND"),j,s," ","AND")
					|| compareTokens(returnStringTokenizer(j, " "), returnStringTokenizer(s, "&"),j,s," ","&")
					|| compareTokens(returnStringTokenizer(j, "&"), returnStringTokenizer(s, "-"),s,j,"&","-")
					|| compareTokens(returnStringTokenizer(j, "&"), returnStringTokenizer(s, "AND"),j,s,"&","AND")
					|| compareTokens(returnStringTokenizer(j, "AND"), returnStringTokenizer(s, "-"),j,s,"AND","-"));

			/*
			 * if(strT.countTokens() == strT2.countTokens()) { while(strT.hasMoreTokens() &&
			 * strT2.hasMoreTokens()) { if(!strT.nextToken().equals(strT2.nextToken())) {
			 * trueRegex = false; } else { trueRegex = true; } } }
			 */
		}
		return trueRegex;
	}

	static boolean compareTokens(StringTokenizer strT, StringTokenizer strT2, String s, String j,String delim1, String delim2) {
		boolean trueRegex = false;
		System.out.println(s + "\tTokens:" + strT.countTokens() + "\tDelimite1r1\t"+delim1 +"\t"+ j + "\tTokens:" + strT2.countTokens() + "\tDelimiter2"+delim2);
		if (strT.countTokens() == strT2.countTokens()) {
			while (strT.hasMoreTokens() && strT2.hasMoreTokens()) {
				if (!strT.nextToken().equals(strT2.nextToken())) {
					trueRegex = false;
					break;
				} else {
					trueRegex = true;
				}
			}
		}
		return trueRegex;
	}

	int getStringLengthWithoutSymbols() {

		return 0;
	}

	static StringTokenizer returnStringTokenizer(String s, String rx) {
		return new StringTokenizer(s, rx);
	}

}
