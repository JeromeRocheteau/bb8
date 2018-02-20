package fr.icam.practicals;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class AlgoI8 {

	/** L'objectif de ces tests est d'introduire :
	 * 
	 *  1. les structures de données récursives
	 *  2. les structures de listes chaînées
	 *  3. les structures de données paramétrées
	 */
	
	class list<T> {	
		T head;
		list<T> tail;
	}
	
	<T> list<T> empty() {
		return null;
	}
	
	<T> list<T> cons(T head, list<T> tail) {
		list<T> list = new list<T>();
		list.head = head;
		list.tail = tail;
		return list;
	}
	
	<T> T head(list<T> list) {
		return list.head;
	}
	
	<T> list<T> tail(list<T> list) {
		return list.tail;
	}
	
	<T> boolean empty(list<T> list) {
		return list == null;
	}
	
	<T> int size(list<T> list) {
		if (empty(list)) {
			return 0;
		} else {
			return size(tail(list)) + 1;
		}
	}
	
	<T> list<T> merge(list<T> left, list<T> right) {
		if (empty(left)) {
			return right;
		} else {
			return cons(head(left), merge(tail(left), right));
		}
	}
	
	<T> list<T> flat(list<list<T>> lists) {
		if (empty(lists)) {
			return empty();
		} else {
			return merge(head(lists), flat(tail(lists)));
		}
	}
	
	Integer sum(list<Integer> list) {
		if (empty(list)) {
			return 0;
		} else {
			return head(list) + sum(tail(list));
		}
	}

	list<Integer> zero;
	list<Integer> one;
	list<Integer> two;
	list<Integer> three;
	list<Integer> four;	
	
	@Before
	public void setUp() {
		zero = empty();
		one = cons(5 , zero);
		two = cons(10 , one);
		three = merge(one, two);
		four = flat(cons(one, cons(two, cons(three, empty()))));	
	}
	
	@Test
	public void test00() {
		int size = size(zero);
		assertEquals(0, size);
	}
	
	@Test
	public void test01() {
		int size = size(one);
		assertEquals(1, size);
	}
	
	@Test
	public void test02() {
		int size = size(two);
		assertEquals(2, size);
	}
	
	@Test
	public void test03() {
		int size = size(three);
		assertEquals(3, size);
	}
	
	@Test
	public void test04() {
		int size = size(four);
		assertEquals(6, size);
	}
	
	@Test
	public void test05() {
		int sum = sum(zero);
		assertEquals(0, sum);
	}
	
	@Test
	public void test06() {
		int sum = sum(one);
		assertEquals(5, sum);
	}
	
	@Test
	public void test07() {
		int sum = sum(two);
		assertEquals(15, sum);
	}
	
	@Test
	public void test08() {
		int sum = sum(three);
		assertEquals(20, sum);
	}
	
	@Test
	public void test09() {
		int sum = sum(four);
		assertEquals(40, sum);
	}
		
}
