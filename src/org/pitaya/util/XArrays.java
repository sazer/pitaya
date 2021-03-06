/*----------------------------------------------------------------------------*
 * This file is part of Pitaya.                                               *
 * Copyright (C) 2012-2014 Osman KOCAK <kocakosm@gmail.com>                   *
 *                                                                            *
 * This program is free software: you can redistribute it and/or modify it    *
 * under the terms of the GNU Lesser General Public License as published by   *
 * the Free Software Foundation, either version 3 of the License, or (at your *
 * option) any later version.                                                 *
 * This program is distributed in the hope that it will be useful, but        *
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY *
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public     *
 * License for more details.                                                  *
 * You should have received a copy of the GNU Lesser General Public License   *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.       *
 *----------------------------------------------------------------------------*/

package org.pitaya.util;

import java.util.Arrays;
import java.util.Random;

/**
 * Various extra utilities for arrays.
 *
 * @see Arrays
 *
 * @author Osman KOCAK
 */
public final class XArrays
{
	private static final Random PRNG = new Random();

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static long[] concat(long[]... arrays)
	{
		int len = 0;
		for (long[] array : arrays) {
			len += array.length;
		}
		long[] concat = new long[len];
		int i = 0;
		for (long[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static int[] concat(int[]... arrays)
	{
		int len = 0;
		for (int[] array : arrays) {
			len += array.length;
		}
		int[] concat = new int[len];
		int i = 0;
		for (int[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static short[] concat(short[]... arrays)
	{
		int len = 0;
		for (short[] array : arrays) {
			len += array.length;
		}
		short[] concat = new short[len];
		int i = 0;
		for (short[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static char[] concat(char[]... arrays)
	{
		int len = 0;
		for (char[] array : arrays) {
			len += array.length;
		}
		char[] concat = new char[len];
		int i = 0;
		for (char[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static byte[] concat(byte[]... arrays)
	{
		int len = 0;
		for (byte[] array : arrays) {
			len += array.length;
		}
		byte[] concat = new byte[len];
		int i = 0;
		for (byte[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static boolean[] concat(boolean[]... arrays)
	{
		int len = 0;
		for (boolean[] array : arrays) {
			len += array.length;
		}
		boolean[] concat = new boolean[len];
		int i = 0;
		for (boolean[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static float[] concat(float[]... arrays)
	{
		int len = 0;
		for (float[] array : arrays) {
			len += array.length;
		}
		float[] concat = new float[len];
		int i = 0;
		for (float[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static double[] concat(double[]... arrays)
	{
		int len = 0;
		for (double[] array : arrays) {
			len += array.length;
		}
		double[] concat = new double[len];
		int i = 0;
		for (double[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Concatenates the given arrays into a single one.
	 * 
	 * @param arrays the arrays to concatenate.
	 * 
	 * @return the concatenated array.
	 * 
	 * @throws NullPointerException if {@code arrays} is {@code null} or if
	 *	it contains a {@code null} reference.
	 */
	public static Object[] concat(Object[]... arrays)
	{
		int len = 0;
		for (Object[] array : arrays) {
			len += array.length;
		}
		Object[] concat = new Object[len];
		int i = 0;
		for (Object[] array : arrays) {
			System.arraycopy(array, 0, concat, i, array.length);
			i = array.length;
		}
		return concat;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static long[] copyOf(long[] a, int off, int len)
	{
		long[] copy = new long[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static int[] copyOf(int[] a, int off, int len)
	{
		int[] copy = new int[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static short[] copyOf(short[] a, int off, int len)
	{
		short[] copy = new short[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static char[] copyOf(char[] a, int off, int len)
	{
		char[] copy = new char[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static byte[] copyOf(byte[] a, int off, int len)
	{
		byte[] copy = new byte[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code false}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static boolean[] copyOf(boolean[] a, int off, int len)
	{
		boolean[] copy = new boolean[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0.0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static float[] copyOf(float[] a, int off, int len)
	{
		float[] copy = new float[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code 0.0}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static double[] copyOf(double[] a, int off, int len)
	{
		double[] copy = new double[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Copies the specified range of elements from the given array into a 
	 * new array. The returned array will be padded with {@code null}, if 
	 * necessary, so that it has an exact length of {@code len}.
	 * 
	 * @param a the source array.
	 * @param off the starting position in the source array.
	 * @param len the number of elements to copy (returned array's length).
	 * 
	 * @return a new array containing the specified range of the source array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ArrayIndexOutOfBoundsException if {@code off} is negative.
	 * @throws NegativeArraySizeException if {@code len} is negative.
	 */
	public static Object[] copyOf(Object[] a, int off, int len)
	{
		Object[] copy = new Object[len];
		if (len > a.length - off) {
			System.arraycopy(a, off, copy, 0, a.length - off);
		} else {
			System.arraycopy(a, off, copy, 0, len);
		}
		return copy;
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static long[] copyOf(long... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static int[] copyOf(int... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static short[] copyOf(short... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static char[] copyOf(char... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static byte[] copyOf(byte... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static boolean[] copyOf(boolean... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static float[] copyOf(float... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static double[] copyOf(double... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a copy of the given array. The original array and the 
	 * returned copy will have identical length and content.
	 * 
	 * @param original the array to be copied.
	 * 
	 * @return a copy of the original array.
	 * 
	 * @throws NullPointerException if {@code original} is {@code null}.
	 */
	public static Object[] copyOf(Object... original)
	{
		return Arrays.copyOf(original, original.length);
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(long[])
	 */
	public static long[] sort(long... a)
	{
		long[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(int[])
	 */
	public static int[] sort(int... a)
	{
		int[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(short[])
	 */
	public static short[] sort(short... a)
	{
		short[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(char[])
	 */
	public static char[] sort(char... a)
	{
		char[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(byte[])
	 */
	public static byte[] sort(byte... a)
	{
		byte[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(float[])
	 */
	public static float[] sort(float... a)
	{
		float[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array into ascending numerical 
	 * order.
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 * 
	 * @throws NullPointerException if {@code a} is {@code null}.
	 *
	 * @see Arrays#sort(double[])
	 */
	public static double[] sort(double... a)
	{
		double[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a sorted copy of the given array of objects into ascending 
	 * order, according to the natural ordering of its elements (all 
	 * elements in the array must implement the {@link Comparable} 
	 * interface).
	 *
	 * @param a the array to be sorted.
	 * 
	 * @return a sorted copy of the given array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 * @throws ClassCastException if the array contains elements that are 
	 *	not mutually comparable (for example, Strings and Integers).
	 * @throws IllegalArgumentException if the natural ordering of the array
	 *	elements is found to violate the {@link Comparable} contract.
	 * 
	 * @see Arrays#sort(java.lang.Object[])
	 */
	public static Object[] sort(Object... a)
	{
		Object[] copy = copyOf(a);
		Arrays.sort(copy);
		return copy;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates 
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs 
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static long[] shuffle(long... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations 
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static long[] shuffle(long[] a, Random rnd)
	{
		long[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(long[] a, int i, int j)
	{
		long c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static int[] shuffle(int... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static int[] shuffle(int[] a, Random rnd)
	{
		int[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(int[] a, int i, int j)
	{
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates 
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs 
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static short[] shuffle(short... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations 
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static short[] shuffle(short[] a, Random rnd)
	{
		short[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(short[] a, int i, int j)
	{
		short c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static char[] shuffle(char... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static char[] shuffle(char[] a, Random rnd)
	{
		char[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(char[] a, int i, int j)
	{
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static byte[] shuffle(byte... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static byte[] shuffle(byte[] a, Random rnd)
	{
		byte[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(byte[] a, int i, int j)
	{
		byte c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static boolean[] shuffle(boolean... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static boolean[] shuffle(boolean[] a, Random rnd)
	{
		boolean[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(boolean[] a, int i, int j)
	{
		boolean c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static float[] shuffle(float... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static float[] shuffle(float[] a, Random rnd)
	{
		float[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(float[] a, int i, int j)
	{
		float c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates 
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs 
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static double[] shuffle(double... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations 
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static double[] shuffle(double[] a, Random rnd)
	{
		double[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(double[] a, int i, int j)
	{
		double c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted. This method uses the optimized version of the Fisher-Yates
	 * shuffle algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs
	 * in linear time.
	 *
	 * @param a the array whose content will be shuffled.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if {@code a} is {@code null}.
	 */
	public static Object[] shuffle(Object... a)
	{
		return shuffle(a, PRNG);
	}

	/**
	 * Returns a copy of the given array where its element have been randomly
	 * permuted using the specified source of randomness. All permutations
	 * occur with equal likelihood assuming that the source of randomness is
	 * fair. This method uses the optimized version of the Fisher-Yates shuffle
	 * algorithm (Fisher, Yates, Durstenfeld, Knuth) and thus runs in linear
	 * time.
	 *
	 * @param a the array whose content will be shuffled.
	 * @param rnd the source of randomness to use.
	 *
	 * @return the shuffled array.
	 *
	 * @throws NullPointerException if one of the arguments is {@code null}.
	 */
	public static Object[] shuffle(Object[] a, Random rnd)
	{
		Object[] copy = copyOf(a);
		for (int i = copy.length; i > 1; i--) {
			swap(copy, i - 1, rnd.nextInt(i));
		}
		return copy;
	}

	private static void swap(Object[] a, int i, int j)
	{
		Object c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code long} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(long[], long[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(long[])
	 */
	public static int hashCode(long... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code int} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(int[], int[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(int[])
	 */
	public static int hashCode(int... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code short} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(short[], short[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(short[])
	 */
	public static int hashCode(short... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code char} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(char[], char[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(char[])
	 */
	public static int hashCode(char... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code byte} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(byte[], byte[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(byte[])
	 */
	public static int hashCode(byte... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code boolean} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(boolean[], boolean[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(boolean[])
	 */
	public static int hashCode(boolean... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code float} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(float[], float[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(float[])
	 */
	public static int hashCode(float... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two {@code double} arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(double[], double[])}, it is also the case that
	 * {@code XArrays.hashCode(a) == XArrays.hashCode(b)}. If {@code a} is 
	 * {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(double[])
	 */
	public static int hashCode(double... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a hash code based on the contents of the specified array.
	 * For any two arrays {@code a} and {@code b} such that 
	 * {@link Arrays#equals(java.lang.Object[], java.lang.Object[])}, it is 
	 * also the case that {@code XArrays.hashCode(a) == XArrays.hashCode(b)}.
	 * If {@code a} is {@code null}, this method returns {@code 0}.
	 *
	 * @param a the array whose hash value to compute.
	 *
	 * @return a content-based hash code for {@code a}.
	 * 
	 * @see Arrays#hashCode(java.lang.Object[]) 
	 * @see Arrays#deepHashCode(java.lang.Object[])
	 */
	public static int hashCode(Object... a)
	{
		return Arrays.hashCode(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(long[])
	 */
	public static String toString(long... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(int[])
	 */
	public static String toString(int... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(short[])
	 */
	public static String toString(short... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(char[])
	 */
	public static String toString(char... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(byte[])
	 */
	public static String toString(byte... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(boolean[])
	 */
	public static String toString(boolean... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(float[])
	 */
	public static String toString(float... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(double[])
	 */
	public static String toString(double... a)
	{
		return Arrays.toString(a);
	}

	/**
	 * Returns a {@code String} representation of the contents of the given
	 * array. Returns {@code "null"} if {@code a} is {@code null}.
	 *
	 * @param a the array whose {@code String} representation to return.
	 *
	 * @return a {@code String} representation of {@code a}.
	 * 
	 * @see Arrays#toString(java.lang.Object[]) 
	 * @see Arrays#deepToString(java.lang.Object[])
	 */
	public static String toString(Object... a)
	{
		return Arrays.toString(a);
	}

	private XArrays()
	{
		/* ... */
	}
}
