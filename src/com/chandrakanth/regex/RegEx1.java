package com.chandrakanth.regex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;

public class RegEx1 {
	private static final Logger LOGGER = Logger.getLogger(RegEx1.class);
	private static Map<String, List<String>> regxMap = new LinkedHashMap<>();
	private static List<String> charSeqArray = new ArrayList<>();
	private static List<String> regxArray = new ArrayList<>();
	private static final String START = " --  start";
	private static final String END = " -- end";
	private static final String _N = "\n";
	public static void main(String[] argz) {
		// genericPatternMatching();
		 orOperator();
		// exceptMatching();
		// quantifierMatching();
		// exponentExpression();
		// specialCharacterRegx();
	}

	private static final void specialCharacterRegx() {
		LOGGER.info("Generic Matchers - \\s \\w \\d \\b" + START);
		regxArray.addAll(Arrays.asList("\\s", "\\w", "\\d", "\\bAB\\b"));
		charSeqArray.addAll(Arrays
				.asList("  ", "a", "3", "akjsdf", "AB ", "AB"));
		// patternMatcher();
		LOGGER.info("Generic Matchers - \\s \\w \\d \\b" + END);
		clearAll();

		LOGGER.info("Generic Matchers - \\S \\W \\D \\B" + START);
		regxArray.addAll(Arrays.asList("\\S", "\\W", "\\D", "\\B"));
		charSeqArray.addAll(Arrays.asList("asdjkdf", "", "a", " ", "bb"));
		patternMatcher();
		LOGGER.info("Generic Matchers - \\S \\W \\D \\B" + END);
		LOGGER.info(_N);
		clearAll();
	}

	private static void patternMatcher() {
		if (regxArray != null && !regxArray.isEmpty() && charSeqArray != null
				&& !charSeqArray.isEmpty()) {
			regxArray.forEach(elem -> regxMap.put(elem, charSeqArray));
		}
		for (Entry<String, List<String>> entr : regxMap.entrySet()) {
			final String key = entr.getKey();
			entr.getValue().forEach(
					value -> {
						if (Pattern.matches(key, value))
							LOGGER.info("Pattern: " + key + " String: " + value
									+ "\t" + " Index: "
									+ entr.getValue().indexOf(value) + "\t"
									+ Pattern.matches(key, value));
					});
		}
	}

	private static final void clearAll() {
		if (regxArray != null && charSeqArray != null && regxMap != null) {
			regxArray.clear();
			charSeqArray.clear();
			regxMap.clear();
		}
	}

	private static final void genericPatternMatching() {
		LOGGER.info("Generic Pattern matching" + START);
		regxArray.addAll(Arrays.asList("(s)", "(as)", "(sa)", "(pqs)", "[ap]"));
		charSeqArray.addAll(Arrays.asList("ars", "asr", "sr", "a_s", "as",
				"ass", "azeesa bsaa", "ap"));
		// patternMatcher();
		LOGGER.info("Generic Pattern matching" + END);
		LOGGER.info(_N);
		clearAll();

	}

	private static final void orOperator() {
		regxArray.addAll(Arrays.asList("[a|b|c]","[a[b][c]]","[amn[d]]","[.]"));
		charSeqArray.addAll(Arrays.asList("c","d","a","qr","s"));
		patternMatcher();
//		LOGGER.info(_N);
	}

	private static final void quantifierMatching() {

		LOGGER.info("Quantifier matcher - Start\n");
		LOGGER.info("Count Quantifier -1\t" + Pattern.matches("[abc]{2}", "ad"));
		LOGGER.info("Count Quantifier -2\t" + Pattern.matches("[abc]{2}", "aa")
				+ "\n");
		LOGGER.info(". followed by ? or * or + operator - Start\n");

		// . operator scans the entire string in the argument for pattern
		// matching
		LOGGER.info(Pattern.matches("((John)?)", "Johndire")); // ? - Repititon
																// zero or one
																// time
		LOGGER.info(Pattern.matches("(a)*", "This is a line")); // * -
																// Repitition
																// zero or more
																// times
		LOGGER.info(Pattern.matches("[a]+", "ababab")); // + - Repitition one or
														// more times
		LOGGER.info("Quantifier matcher - End");

		final String INPUT = "this is a line";

		Pattern matchPlus = Pattern.compile("[a]+");
		Pattern matchQuest = Pattern.compile("[a]?");
		Pattern matchStar = Pattern.compile("[a]*");

		Matcher matcherPlus = matchPlus.matcher(INPUT);
		Matcher matcherQuest = matchQuest.matcher(INPUT);
		Matcher matcherStar = matchStar.matcher(INPUT);

		LOGGER.info("####################################" + "Matcher using +");
		while (matcherPlus.find()) {
			LOGGER.info("found character  matching starting at index "
					+ matcherPlus.start() + " and ending at index "
					+ matcherPlus.end());
		}

		LOGGER.info("####################################" + "Matcher using ?");
		while (matcherQuest.find()) {
			LOGGER.info("found character  matching starting at index "
					+ matcherQuest.start() + " and ending at index "
					+ matcherQuest.end());
		}

		LOGGER.info("####################################" + "Matcher using *");
		while (matcherStar.find()) {
			LOGGER.info("found character  matching starting at index "
					+ matcherStar.start() + " and ending at index "
					+ matcherStar.end());
		}

	}

	private static final void exceptMatching() {
		LOGGER.info("Except Matching-1\t" + Pattern.matches("[a-d&&[^c]]", "c"));
		LOGGER.info("Except Matching-2\t"
				+ Pattern.matches("[a-d&&[^cd]]", "d"));
		LOGGER.info("Except Matching-3\t" + Pattern.matches("[a-d[^cd]]", "e"));
	}

	private static final void exponentExpression() {

		// Returns true if either of the letter bewteen A and Z comes first in
		// the line
		LOGGER.info("^ operator - 1\t" + Pattern.matches("^[A-Z]", "Z"));

		// Returns true if the expression that doesn't Start with given
		// expression within []
		LOGGER.info("^ operator - 2\t" + Pattern.matches("[^A-Z]", "a") + "\n");

		LOGGER.info(Pattern.matches("/MING/i", "MING"));
	}
}
