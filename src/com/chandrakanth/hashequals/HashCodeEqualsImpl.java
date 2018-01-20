package com.chandrakanth.hashequals;

import java.util.HashSet;

public class HashCodeEqualsImpl {

	public static <E> void main(String[] args) {
		HashSet<String> hash = new HashSet<>();

		/*
		 * System.out.println();
		 * 
		 * HashCodeEquals hashEquals = new HashCodeEquals( "abc" 2);
		 * HashCodeEquals hashEquals2 = new HashCodeEquals( "abc" 3);
		 * 
		 * System.out.println(hashEquals.equals(hashEquals2)); hash.add(new
		 * HashCodeEquals().getA1(new String("abc")));
		 * 
		 * boolean b = hash.contains( new HashCodeEquals("abc") hashEquals);
		 * System.out.println(hash + "\t" + b);
		 * 
		 * 
		 * Iterator<String> itr = hash.iterator(); hash.contains(new
		 * HashCodeEquals("abc")); // System.out.println(new
		 * String("abc").hashCode()); // boolean b = hash.contains(new
		 * String("abc")); // System.out.println();
		 */

		HashCodeEquals hash1 = new HashCodeEquals();
//		HashCodeEquals2 hashEq = new HashCodeEquals2();
//		hashEq.setString("new strasdfing");
//		hash1.setHashEq(hashEq);
		hash1.setPrimitiveInt(15);
		hash1.setPrimitiveBool(true);
		hash1.setL(2377823L);
		hash1.setName("abc");
		hash1.setObjectBool(Boolean.TRUE);
		hash1.setObjectDouble(Double.valueOf(23d));
		hash1.setObjectFloat(Float.valueOf(23.34f));
		hash1.setObjectInt(Integer.valueOf(23));
		hash1.setObjectLong(23l);

		HashCodeEquals hash2 = new HashCodeEquals();
//		HashCodeEquals2 hashEq2 = new HashCodeEquals2();
//		hashEq2.setString("new string");
//		hash2.setHashEq(hashEq);
		hash2.setPrimitiveInt(15);
		hash2.setPrimitiveBool(true);
		hash2.setL(2377823L);
		hash2.setName("abc");
		hash2.setObjectBool(Boolean.TRUE);
		hash2.setObjectDouble(Double.valueOf(23d));
		hash2.setObjectFloat(Float.valueOf(23.34f));
		hash2.setObjectInt(Integer.valueOf(23));
		hash2.setObjectLong(23l);

		System.out.println(hash1.equals(hash2));

		// List<HashCodeEquals> list = new ArrayList<>();
		// list.addAll(Arrays.asList(hash1, hash2));

		// ListIterator<E> listIterator = (ListIterator<E>) list.listIterator();

		/*
		 * while (listIterator.hasNext()) { HashCodeEquals h = (HashCodeEquals)
		 * listIterator.next(); } System.out.println(list.contains(hash2));
		 */
	}

}
