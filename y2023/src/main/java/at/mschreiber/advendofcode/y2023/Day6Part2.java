package at.mschreiber.advendofcode.y2023;

import java.math.BigInteger;

public class Day6Part2 {

	public static void main(String[] args) {

		long time = 52947594;
		long recordDistance = 426137412791216l;
		long waysToBeatRecord = calculateWaysToBeatRecord(time, recordDistance);
		System.out.println("Total:" + waysToBeatRecord);
	}

	private static long calculateWaysToBeatRecord(long time, long recordDistance) {
		long ways = 0;
		for (long holdTime = 1; holdTime < time; holdTime++) {
			long remainingTime = time - holdTime;
			long distance = remainingTime * holdTime;

			if (distance > recordDistance) {
				ways++;
			}
		}
		return ways;
	}
}
