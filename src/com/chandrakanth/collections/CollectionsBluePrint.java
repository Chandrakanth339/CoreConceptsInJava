package com.chandrakanth.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

public class CollectionsBluePrint<E> {

	private Set<E> s; 
	private SortedSet<E> sortedSet;
	private NavigableSet<E> navigableSet;
	private List<E> ls;
	
	private LinkedList<E> lL;
	private HashSet<E> hashSet;


	public SortedSet<E> getSortedSet() {
		return sortedSet;
	}

	public void setSortedSet(SortedSet<E> sortedSet) {
		this.sortedSet = sortedSet;
	}

	public NavigableSet<E> getNavigableSet() {
		return navigableSet;
	}

	public void setNavigableSet(NavigableSet<E> navigableSet) {
		this.navigableSet = navigableSet;
	}

	public List<E> getLs() {
		return ls;
	}

	public void setLs(List<E> ls) {
		this.ls = ls;
	}

	public LinkedList<E> getlL() {
		return lL;
	}

	public void setlL(LinkedList<E> lL) {
		this.lL = lL;
	}

	public HashSet<E> getHashSet() {
		return hashSet;
	}

	public void setHashSet(HashSet<E> hashSet) {
		this.hashSet = hashSet;
	}

	public Set<E> getS() {
this.setS(new HashSet<E>());
		return s;
	}

	public void setS(Set<E> s) {
		this.s = s;
	}

}
