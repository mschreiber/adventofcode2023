package at.mschreiber.advendofcode.y2023;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3Part1 {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("\\d+");
    String[] lines = Day3Input.input.split("\r\n");
    long sum = 0;
    for (int i = 0; i < lines.length; i++) {
      Matcher m = p.matcher(lines[i]);
      while (m.find()) {
        int start = m.start();
        int end = m.end();
        long number = Long.parseLong(m.group());
        String lineBefore = i > 1 ? lines[i - 1] : null;
        String lineAfter = i < lines.length-1 ? lines[i + 1] : null;
        if (search(lineBefore, start, end) || search(lineAfter, start, end) || search(lines[i], start, end)) {

          sum += number;
        }

      }
    }
    System.out.println(sum);
  }

  public static boolean search(String line, int start, int end) {
    if (line == null) {
      return false;
    }
    int realStart = start > 0 ? start - 1 : start;
    int realEnd = end == line.length()? end - 1 : end;
    System.out.println(end);
    for (int x = realStart; x <= realEnd; x++) {
      char a = line.charAt(x);
      if (!Character.isDigit(a) && a != '.') {
        return true;
      }
    }
    return false;
  }
}
