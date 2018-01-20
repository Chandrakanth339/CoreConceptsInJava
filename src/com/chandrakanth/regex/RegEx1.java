package com.chandrakanth.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;


public class RegEx1 {

	public static void main(String[] argz) {

		Logger LOGGER = Logger.getLogger(RegEx1.class);
		
		LOGGER.info("Character Matching");
		// The below matcher returns true if the string in the second argument is a 2 character string ending with 's'
		// The dots represent the unknown characters
		
		LOGGER.info("Pattern.matches(\".s\", \"as\") - - " +Pattern.matches(".s", "as") ); // True as s is second character
		LOGGER.info(Pattern.matches(".s", "ars")); // false as s is not second character, and string is a 3-char string.
		LOGGER.info("Character Matching ends");
		LOGGER.info("General Pattern Matchers - Start");
		
		LOGGER.info(Pattern.matches("[a-z]","c")); // Matches a letter in between a and z
		LOGGER.info(Pattern.matches("[A-Z7-9]{2}","Z7")); // Matches (a letter between A and Z) OR ( a digit between 7 and 9)
		LOGGER.info(Pattern.matches("[acb]+", "acabcc"));
		LOGGER.info(Pattern.matches("[a-c][0-9]", "a1")+"\n");
		
		// Returns true if either of the letter bewteen A and Z comes first in the line
		LOGGER.info("Character Matching patterns - Start");
		
		LOGGER.info("^ operator - 1\t"+Pattern.matches("^[A-Z]", "Z")); 
		LOGGER.info("^ operator - 2\t"+Pattern.matches("[^A-Z]", "a")+"\n");// Returns true if the expression that doesn't contain letters btw A and Z
		
		LOGGER.info("OR Operator -1\t"+Pattern.matches("[a|b|c]", "c"));
		LOGGER.info("OR Operator -2\t"+Pattern.matches("[a[b][c]]", "c"));
		LOGGER.info("OR Operator -3\t"+Pattern.matches("[amn[d]]","d")+"\n");
		
		LOGGER.info("Last of line pattern matcher - $ operator\t" +Pattern.matches("az$", "az")+"\n");// $ indicates that the pattern falls in the last of the line
		LOGGER.info("Except Matching-1\t"+Pattern.matches("[a-d&&[^c]]", "c"));
		LOGGER.info("Except Matching-2\t"+Pattern.matches("[a-d&&[^cd]]", "d"));
		LOGGER.info("Except Matching-3\t"+Pattern.matches("[a-d[^cd]]", "e"));
		
		LOGGER.info("Character Matching patterns - End\n");
		
		LOGGER.info("Quantifier matcher - Start\n");
		LOGGER.info("Count Quantifier -1\t"+ Pattern.matches("[abc]{2}","ad"));
		LOGGER.info("Count Quantifier -2\t"+Pattern.matches("[abc]{2}","aa")+"\n");
		LOGGER.info(". followed by ? or * or + operator - Start\n");
		
		// . operator scans the entire string in the argument for pattern matching
		LOGGER.info(Pattern.matches("((John)?)","Johndire")); //  ? - Repititon zero or one time
		LOGGER.info(Pattern.matches("(a)*","This is a line")); // * - Repitition zero or more times
		LOGGER.info(Pattern.matches("[a]+","ababab")); // + - Repitition one or more times
		LOGGER.info("Quantifier matcher - End");
		
		final String INPUT = "this is a line";
		
		Pattern matchPlus = Pattern.compile("[a]+");
		Pattern matchQuest = Pattern.compile("[a]?");
		Pattern matchStar = Pattern.compile("[a]*");
		
		Matcher matcherPlus = matchPlus.matcher(INPUT);
		Matcher matcherQuest = matchQuest.matcher(INPUT);
		Matcher matcherStar = matchStar.matcher(INPUT); 
		
		
		LOGGER.info("####################################" + "Matcher using +");
		while(matcherPlus.find()){
			LOGGER.info("found character  matching starting at index "+matcherPlus.start() + 
					" and ending at index "+matcherPlus.end());
		}
		
		LOGGER.info("####################################" + "Matcher using ?");
		while(matcherQuest.find()){
			LOGGER.info("found character  matching starting at index "+matcherQuest.start() + 
					" and ending at index "+matcherQuest.end());
		}
		
		LOGGER.info("####################################" + "Matcher using *");
		while(matcherStar.find()){
			LOGGER.info("found character  matching starting at index "+matcherStar.start() + 
					" and ending at index "+matcherStar.end());
		}
		
	}

}
