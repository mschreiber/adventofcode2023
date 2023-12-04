package at.mschreiber.advendofcode.y2023;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Day4Part1 {

  public static void main(String[] args) {
    Pattern p = Pattern.compile("\\d+");
    String[] cards = Day4Input.mine.split(("\r\n"));
    double sum = 0;
    for (String card : cards) {
      long cnt = 0;
      List<Long> cNbs = Arrays.asList(card.split("[|:]")[1].replaceAll("( )+", " ").trim().split(" ")).stream()
          .map(Long::parseLong).distinct().collect(Collectors.toList());
      String s = card.split("[|:]")[2].trim();
      List<Long> mNbs = Arrays.asList(card.split("[|:]")[2].replaceAll("( )+", " ").trim().split(" ")).stream()
          .map(Long::parseLong).distinct().collect(Collectors.toList());
      for (Long x : mNbs) {
        if (cNbs.contains(x)) {
            cnt++;
        }
      }
      sum += Math.pow(2, cnt - 1);

    }
    System.err.println(sum);
  }

}
