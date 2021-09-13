package com.olcap;

import java.util.Comparator;

public class EqualityComparer<T extends Comparable<T>> implements Comparator<T> {
	
	@Override
	public int compare(T o1, T o2) {
		return o1.compareTo(o2);
	}
}
