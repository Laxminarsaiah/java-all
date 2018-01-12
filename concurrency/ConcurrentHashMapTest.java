package com.lnragi.java.concurrency;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		ConcurrentHashMap<String, String> chm = new ConcurrentHashMap<String, String>();
		chm.putIfAbsent("Rag", "Laxmi");
		chm.putIfAbsent("foo", "ragi");
		chm.putIfAbsent("goo", "kanche");
		chm.putIfAbsent("boo", "manche");
		chm.putIfAbsent("bar", "munche");
		testReduce(chm);
		testSearch(chm);
	}

	public static void testReduce(ConcurrentHashMap<String, String> chm) {
		/*
		 * Returns the result of accumulating the given transformation of all
		 * (key, value) pairs using the given reducer to combine values, or null
		 * if none.
		 */
		String reduced = chm.reduce(3, (k, v) -> k + "=" + v, (s1, s2) -> s1
				+ "," + s2);

		System.out.println(reduced);
	}

	public static void testSearch(ConcurrentHashMap<String, String> chm) {
		/*
		 * Returns a non-null result from applying the given search function on
		 * each (key, value), or null if none. Upon success, further element
		 * processing is suppressed and the results of any other parallel
		 * invocations of the search function are ignored.
		 */
		String s = chm.search(0, (k, v) -> {
			if (k.equals("Rag") && v.equals("Laxmi")) {
				return "RagiLaxmi";
			}
			return "Not Found";
		});

		System.out.println("Return : " + s);

	}

}
