package at.mschreiber.advendofcode.y2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day7Part1 {
  public static void main(String[] args) {

    String[] handsAndBids = Day7Input.example.split("\r\n");
    Arrays.sort(handsAndBids, new Comparator<String>() {

      @Override
      public int compare(String o1, String o2) {
        String hand1 = o1.split(" ")[0];
        String hand2 = o2.split(" ")[0];
        
        Map<String, List<String>> scoresHand1 = Arrays.stream(hand1.split(""))
            .collect(Collectors.groupingBy(s -> s)); 
        
        Map<String, List<String>> scoresHand2 = Arrays.stream(hand1.split(""))
            .collect(Collectors.groupingBy(s -> s));
        
        // Five
        if (scoresHand1.size() == 1 && scoresHand2.size() > 1) {
          return 1;
        }
        if (scoresHand2.size() == 1 && scoresHand1.size() > 1) {
          return -1;
        }
        if (scoresHand1.size() == 1 && scoresHand2.size() == 1) {
          return hand1.compareTo(hand2);
        }
        
        // Four
        String four1 = scoresHand1.keySet().stream().filter((key) -> scoresHand1.get(key).size() == 4).findFirst().orElse(null);
        String four2 = scoresHand1.keySet().stream().filter((key) -> scoresHand1.get(key).size() == 4).findFirst().orElse(null);
        if (four1 != null && four2 == null) {
          return 1;
        }
        if (four2 != null && four1 == null) {
          return -1;
        }
        if (four1 != null && four2 != null) {
          return hand1.compareTo(hand2);
        }
        
        // Full House
        if (scoresHand1.size() == 2) {
          
        }
        
        return 0;
      }
    });

    int totalWinnings = 0;
    for (int i = 0; i < handsAndBids.length; i++) {
      int rank = i + 1;
      int bid = Integer.parseInt(handsAndBids[i].split(" ")[1]);
      totalWinnings += rank * bid;
      System.out.println("Hand: " + handsAndBids[i] + ", Rank: " + rank);
    }

    System.out.println("Total Winnings: " + totalWinnings);
  }
  
}