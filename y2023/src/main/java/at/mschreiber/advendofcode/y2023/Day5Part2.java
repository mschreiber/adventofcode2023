package at.mschreiber.advendofcode.y2023;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day5Part2 {
	
	static List<Long> smallestL = new ArrayList<Long>();

	public static void main(String[] args) {
		String[] lines = Day5Input.mine.split("\r\n");
		List<Part2Map> seedsToSoil = feed(lines, "seed-to-soil map:");
		List<Part2Map> soilToFertilizer = feed(lines, "soil-to-fertilizer map:");
		List<Part2Map> fertilizerToWater = feed(lines, "fertilizer-to-water map:");
		List<Part2Map> waterToLight = feed(lines, "water-to-light map:");
		List<Part2Map> lightToTemp = feed(lines, "light-to-temperature map:");
		List<Part2Map> tempToHumi = feed(lines, "temperature-to-humidity map:");
		List<Part2Map> humiToLoc = feed(lines, "humidity-to-location map:");
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(lines[0]);
		List<Long> starts = new ArrayList<Long>();
		List<Long> ends = new ArrayList<Long>();

		while (m.find()) {
			long start = Long.parseLong(m.group());
			starts.add(start);
			m.find();
			long length = Long.parseLong(m.group());
			ends.add(start + length);
		}
		starts.parallelStream().forEach((start) -> {
			long smallest = Long.MAX_VALUE;
			for (long x = start; x < ends.get(starts.indexOf(start)); x++) {
				long tmp = findDest(seedsToSoil, x);
				tmp = findDest(soilToFertilizer, tmp);
				tmp = findDest(fertilizerToWater, tmp);
				tmp = findDest(waterToLight, tmp);
				tmp = findDest(lightToTemp, tmp);
				tmp = findDest(tempToHumi, tmp);
				tmp = findDest(humiToLoc, tmp);
				if (tmp < smallest) {
					smallestL.add(tmp);
					smallest = tmp;
				}
			}
		});

		System.out.println(smallestL.stream().mapToLong((it)-> it).min().orElse(0));
	}

	private static long findDest(List<Part2Map> map, long src) {
		for (Part2Map m : map) {
			if (m.srcStart <= src && m.srcEnd > src) {
				return m.destStart + (src - m.srcStart);
			}
		}
		return src;
	}

	private static List<Part2Map> feed(String[] lines, String it) {
		List<Part2Map> list = new ArrayList<Part2Map>();

		boolean start = false;
		for (String line : lines) {
			if (line.contains(it)) {
				start = true;
				continue;
			}
			if (start && line.trim().equals("")) {
				break;
			}
			if (start) {
				String[] values = line.split(" ");
				Part2Map m = new Part2Map();
				m.destStart = Long.parseLong(values[0]);
				m.srcStart = Long.parseLong(values[1]);
				m.length = Long.parseLong(values[2]);
				m.destEnd = m.destStart + m.length;
				m.srcEnd = m.srcStart + m.length;
				list.add(m);
			}
		}
		return list;
	}

}

class Part2Map {
	public Part2Map() {
	}

	public long destStart;
	public long srcStart;
	public long destEnd;
	public long srcEnd;
	public long length;
}
