package at.mschreiber.advendofcode.y2023;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3Part2 {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("\\*");
    String[] lines = Day3Input.input.split("\r\n");
    long sum = 0;
    for (int i = 0; i < lines.length; i++) {
      Matcher m = p.matcher(lines[i]);
      while (m.find()) {
        System.out.println(m.start());
        String lineBefore = i > 0?lines[i-1]:null;
        String lineAfter = i < lines.length -1? lines[i+1]:null;
        List<Integer> numbers = new ArrayList<Integer>();
        search(numbers, lineBefore, m.start());
        search(numbers, lineAfter, m.start());
        search(numbers, lines[i], m.start());
        if (numbers.size() == 2) {
          sum = sum + (numbers.get(0) * numbers.get(1));
        }
      }
    }
    System.out.println(sum);
  }

  public static void search(List<Integer> numbers , String line, int start) {
    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher(line);
    while(m.find()) {
      int mStart = m.start() - 1;
      int mEnd = m.end();
      if (start >= mStart && start <= mEnd) {
        numbers.add(Integer.parseInt(m.group()));
      }
    }
  }
  
}
