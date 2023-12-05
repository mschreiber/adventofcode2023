package at.mschreiber.advendofcode.y2023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day5Part1 {

  public static void main(String[] args) {
    String[] lines = Day5Input.mine.split("\r\n");
    List<Map> seedsToSoil = feed(lines, "seed-to-soil map:");
    List<Map> soilToFertilizer = feed(lines, "soil-to-fertilizer map:");
    List<Map> fertilizerToWater = feed(lines, "fertilizer-to-water map:");
    List<Map> waterToLight = feed(lines, "water-to-light map:");
    List<Map> lightToTemp = feed(lines, "light-to-temperature map:");
    List<Map> tempToHumi = feed(lines, "temperature-to-humidity map:");
    List<Map> humiToLoc = feed(lines, "humidity-to-location map:");
    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher(lines[0]);
    long smallest = Long.MAX_VALUE;
    long minStart = Long.MAX_VALUE;
    long minEnd = 0;
    while (m.find()) {
      long start = Long.parseLong(m.group());
      m.find();
      long length = Long.parseLong(m.group());
      if (minStart > start) {
        minStart = start;
      }
      if (start + length > minEnd) {
        minEnd = start + length;
      }
    }

    System.out.println("Start: " + minStart);
    System.out.println("End: " + minEnd);
    for (long x = minStart; x < minEnd; x++) {
      long tmp = findDest(seedsToSoil, x);
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

  private static long findDest(List<Map> map, long src) {
    for (Map m : map) {
      if (m.srcStart <= src && m.srcEnd > src) {
        return m.destStart + (src - m.srcStart);
      }
    }
    return src;
  }

  private static List<Map> feed(String[] lines, String it) {
    List<Map> list = new ArrayList<Map>();

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
        Map m = new Map();
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

class Map {
  public Map() {
  }

  public long destStart;
  public long srcStart;
  public long destEnd;
  public long srcEnd;
  public long length;
}
