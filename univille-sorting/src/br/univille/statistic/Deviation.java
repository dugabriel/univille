package br.univille.statistic;
/***********************************************************
 * Introduction to Computers and Programming (Fall 2009)   *
 * Professor Evan Korth                                    *
 *                                                         *
 * File Name: Deviation.java                               *
 * PIN: K0002F09084                                        *
 * Description: Calculating Standard Deviation             *
 *                                                         *
 * Focus:                                                  *
 * a. Calculating Standard Deviation                       *
 ***********************************************************/

// Beginning of class Deviation
public class Deviation {		

	public static double findDeviation2(long[] nums, double mean) {
		double squareSum = 0;

		for (int i = 0; i < nums.length; i++) {
			squareSum += Math.pow(nums[i] - mean, 2);
		}

		return Math.sqrt((squareSum) / (nums.length - 1));
	} // End of double findDeviation(int[])

	/** Method for computing mean of an array of double values*/
	// Beginning of double findMean(double[])
	public static long findMean(long[] nums) {
		long sum = 0;

		for (int i = 0; i < nums.length; i++) {
			//System.out.println(nums[i]);
			sum += nums[i];
		}

		return sum / nums.length;
	} // End of double getMean(double[])

	
} // End of class Deviation
