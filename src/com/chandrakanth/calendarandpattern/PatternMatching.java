package com.chandrakanth.calendarandpattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {

		// 1st way
		Pattern p = Pattern.compile(".s");// . represents single character
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		// 2nd way
		boolean b2 = Pattern.compile(".s").matcher("as").matches();

		// 3rd way
		boolean b3 = Pattern.matches(".s", "as");

		System.out.println(b + " " + b2 + " " + b3);

		/*
		 * No. Character Class Description 1 [abc] a, b, or c (simple class) 2
		 * [^abc] Any character except a, b, or c (negation) 3 [a-zA-Z] a
		 * through z or A through Z, inclusive (range) 4 [a-d[m-p]] a through d,
		 * or m through p: [a-dm-p] (union) 5 [a-z&&[def]] d, e, or f
		 * (intersection) 6 [a-z&&[^bc]] a through z, except for b and c: [ad-z]
		 * (subtraction) 7 [a-z&&[^m-p]] a through z, and not m through p:
		 * [a-lq-z](subtraction)
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		

		System.out.println(Pattern.matches("[amn]", "abcd"));//false (not a or m or n)  
		System.out.println(Pattern.matches("[a-m][A-Z]", "am"));//true (among a or m or n)  
		System.out.println(Pattern.matches("[amn]", "amn"));//false (m and a comes more than once)  

		
//		System.out.println(Pattern.compile("[abd]").matcher("abd").matches());
		
		/*
		 * X?	X occurs once or not at all
X+	X occurs once or more times
X*	X occurs zero or more times
X{n}	X occurs n times only
X{n,}	X occurs n or more times
X{y,z}	X occurs at least y times but less than z times
		 * 
		 * 
		 * 
		 * */
		
		
		
		
		
		System.out.println("\n"+Pattern.matches("[pqr&&[def]]", "pdef"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "kkvarun32"));//false (more than 6 char)  
		System.out.println(Pattern.matches("[a-z[@][A-Z][0-9]]{6}", "23@Uk2"));//true  
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "arun$2"));//false ($ is not matched)  

		
		
	}

}
