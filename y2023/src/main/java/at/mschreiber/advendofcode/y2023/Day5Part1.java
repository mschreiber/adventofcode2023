package at.mschreiber.advendofcode.y2023;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day5Part1 {

	public static void main(String[] args) {
		String[] lines = Day5Input.mine.split("\r\n");
		List<Part1Map> seedsToSoil = feed(lines, "seed-to-soil map:");
		List<Part1Map> soilToFertilizer = feed(lines, "soil-to-fertilizer map:");
		List<Part1Map> fertilizerToWater = feed(lines, "fertilizer-to-water map:");
		List<Part1Map> waterToLight = feed(lines, "water-to-light map:");
		List<Part1Map> lightToTemp = feed(lines, "light-to-temperature map:");
		List<Part1Map> tempToHumi = feed(lines, "temperature-to-humidity map:");
		List<Part1Map> humiToLoc = feed(lines, "humidity-to-location map:");
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(lines[0]);
		long smallest = Long.MAX_VALUE;
		while (m.find()) {
			long value = Long.parseLong(m.group());
			long tmp = findDest(seedsToSoil, value);
			tmp = findDest(soilToFertilizer, tmp);
			tmp = findDest(fertilizerToWater, tmp);
			tmp = findDest(waterToLight, tmp);
			tmp = findDest(lightToTemp, tmp);
			tmp = findDest(tempToHumi, tmp);
			tmp = findDest(humiToLoc, tmp);
			if (tmp < smallest) {
				System.out.println(tmp);
				smallest = tmp;
			}
		}
		System.out.println(smallest);
	}

	private static long findDest(List<Part1Map> map, long src) {
		for (Part1Map m : map) {
			if (m.srcStart <= src && m.srcEnd > src) {
				return m.destStart + (src - m.srcStart);
			}
		}
		return src;
	}

	private static List<Part1Map> feed(String[] lines, String it) {
		List<Part1Map> list = new ArrayList<Part1Map>();

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
				Part1Map m = new Part1Map();
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

class Part1Map {
	public Part1Map() {
	}

	public long destStart;
	public long srcStart;
	public long destEnd;
	public long srcEnd;
	public long length;
}
