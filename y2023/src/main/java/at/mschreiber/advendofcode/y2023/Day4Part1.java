package at.mschreiber.advendofcode.y2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day4Part1 {

  public static void main(String[] args) {
    String[] cards = Day4Input.mine.split(("\r\n"));
    double sum = 0;
    for (String card : cards) {
      List<Long> cNbs = Arrays.asList(card.split("[|:]")[1].replaceAll("( )+", " ").trim().split(" ")).stream()
          .map(Long::parseLong).distinct().collect(Collectors.toList());
      List<Long> mNbs = Arrays.asList(card.split("[|:]")[2].replaceAll("( )+", " ").trim().split(" ")).stream()
          .map(Long::parseLong).collect(Collectors.toList());
      long cnt = 0;
      for (Long x : cNbs) {
        if (mNbs.contains(x)) {
          cnt++;
        }
      }
      if (cnt > 1) {
      sum += Math.pow(2, cnt - 1);
      }
      if (cnt == 1) {
        sum++;
      }

    }
    System.err.println(sum);
  }

}
