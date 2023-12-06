package at.mschreiber.advendofcode.y2023;

public class Day6Part1 {
	
    public static void main(String[] args) {
        int[] times = {52,94,75,94};
        int[] distances = {426,1374,1279,1216};

        int totalWaysToBeatRecord = 1;

        for (int i = 0; i < 4; i++) {
            int time = times[i];
            int recordDistance = distances[i];

            int waysToBeatRecord = calculateWaysToBeatRecord(time, recordDistance);
            System.out.println("Race " + i + ": " + waysToBeatRecord);

            totalWaysToBeatRecord *= waysToBeatRecord;
        }

        System.out.println("Total:" + totalWaysToBeatRecord);
    }

    private static int calculateWaysToBeatRecord(int time, int recordDistance) {
        int ways = 0;

        for (int holdTime = 1; holdTime < time; holdTime++) {
            int remainingTime = time - holdTime;
            int distance = remainingTime * holdTime;

            if (distance > recordDistance) {
                ways++;
            }
        }

        return ways;
    }
}

