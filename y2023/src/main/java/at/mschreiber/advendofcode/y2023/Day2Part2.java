package at.mschreiber.advendofcode.y2023;

public class Day2Part2 {

  public static String input = "Game 1: 4 blue, 4 red, 16 green; 14 green, 5 red; 1 blue, 3 red, 5 green\r\n"
      + "Game 2: 3 green, 8 red, 1 blue; 5 green, 6 blue; 4 green, 4 blue, 10 red; 2 green, 6 red, 4 blue; 8 red, 11 blue, 4 green; 10 red, 10 blue\r\n"
      + "Game 3: 7 blue, 2 green; 9 blue, 2 green, 4 red; 5 blue, 2 red; 1 red, 1 green, 10 blue; 1 green, 5 blue, 1 red\r\n"
      + "Game 4: 5 green, 4 blue, 15 red; 1 green, 5 blue, 2 red; 14 red, 3 blue, 2 green; 6 red, 12 green, 1 blue; 1 blue, 6 green, 16 red\r\n"
      + "Game 5: 1 red, 1 blue, 4 green; 3 blue, 2 green, 4 red; 4 blue, 1 red, 2 green; 1 green, 3 red, 4 blue; 1 green, 2 blue\r\n"
      + "Game 6: 17 red, 2 blue, 18 green; 4 green, 10 blue, 14 red; 10 blue, 15 green, 14 red; 6 blue, 9 red; 5 blue, 7 red, 10 green\r\n"
      + "Game 7: 2 green, 3 red, 14 blue; 3 red, 2 green, 6 blue; 3 blue, 1 red; 10 blue, 1 green; 3 green, 17 blue\r\n"
      + "Game 8: 9 blue, 13 green, 2 red; 3 red, 10 green, 18 blue; 8 blue, 8 green\r\n"
      + "Game 9: 11 red, 2 blue; 1 blue, 9 green, 13 red; 2 blue, 17 red, 6 green\r\n"
      + "Game 10: 13 green, 8 red, 8 blue; 10 red, 5 blue, 9 green; 3 blue, 2 green, 1 red; 5 blue, 1 red, 10 green; 10 red, 8 blue; 8 blue, 1 green\r\n"
      + "Game 11: 14 red, 19 green; 2 blue, 6 red, 17 green; 12 green, 9 red, 6 blue\r\n"
      + "Game 12: 19 green, 3 blue, 10 red; 8 red, 2 blue, 19 green; 3 blue, 6 red, 2 green; 8 red, 5 blue; 1 blue, 15 green; 8 green, 7 red\r\n"
      + "Game 13: 2 red, 8 green, 1 blue; 4 green, 3 blue, 2 red; 4 red, 1 green; 1 red, 1 green; 2 green, 1 blue\r\n"
      + "Game 14: 4 blue, 2 green; 2 blue, 6 red, 2 green; 6 red, 16 blue; 5 blue, 1 green, 5 red\r\n"
      + "Game 15: 2 red, 4 green, 4 blue; 5 red; 5 green, 2 red, 2 blue; 5 green, 1 blue, 7 red\r\n"
      + "Game 16: 4 blue, 7 red, 1 green; 8 red, 5 blue; 9 blue, 6 red, 3 green; 4 red, 3 green, 7 blue; 3 green, 1 blue\r\n"
      + "Game 17: 1 green, 15 red; 8 red, 4 blue, 7 green; 8 green, 11 blue; 4 red, 1 green, 11 blue; 11 red; 1 green, 3 red\r\n"
      + "Game 18: 2 blue, 8 green, 6 red; 6 green, 5 blue, 15 red; 13 red, 15 green, 5 blue\r\n"
      + "Game 19: 8 blue, 8 red, 2 green; 10 red, 2 blue; 6 red, 4 blue, 3 green; 7 blue, 2 green, 6 red\r\n"
      + "Game 20: 8 blue, 4 green, 13 red; 14 green, 2 blue, 4 red; 1 green, 11 red, 2 blue; 8 blue, 14 red, 1 green\r\n"
      + "Game 21: 4 red, 14 green, 2 blue; 8 green, 2 blue, 1 red; 2 blue, 1 green, 1 red\r\n"
      + "Game 22: 3 blue, 2 red, 5 green; 2 blue, 3 green, 1 red; 4 green, 4 blue, 7 red; 1 green, 1 red\r\n"
      + "Game 23: 3 green, 9 red, 15 blue; 8 red, 4 green; 4 green, 13 blue, 6 red\r\n"
      + "Game 24: 1 green, 2 blue, 1 red; 3 blue, 2 green; 2 blue, 4 red, 7 green; 2 red, 8 green, 2 blue\r\n"
      + "Game 25: 4 blue, 3 green, 5 red; 4 red, 3 blue; 3 green, 7 red, 3 blue; 5 green, 12 red\r\n"
      + "Game 26: 9 red, 1 green, 3 blue; 1 blue, 13 red; 3 blue, 5 red; 14 red, 1 green\r\n"
      + "Game 27: 1 blue, 7 green, 3 red; 2 red; 1 green, 1 red\r\n"
      + "Game 28: 13 red, 1 blue, 9 green; 4 red, 10 green; 1 blue, 12 red, 6 green; 6 green, 3 red, 1 blue; 2 green, 16 red, 1 blue; 12 green, 16 red\r\n"
      + "Game 29: 1 red, 9 blue; 15 blue, 3 green; 2 green, 1 red, 9 blue\r\n"
      + "Game 30: 6 blue; 1 green, 4 blue, 2 red; 2 blue, 2 red\r\n"
      + "Game 31: 1 blue, 2 red, 3 green; 3 blue, 3 red, 2 green; 3 red, 2 green; 2 blue, 1 green, 4 red; 1 red, 1 green, 1 blue; 1 green, 3 red, 2 blue\r\n"
      + "Game 32: 1 green, 6 blue; 1 blue, 2 red, 3 green; 9 blue; 2 green, 1 red, 6 blue; 6 blue\r\n"
      + "Game 33: 3 blue, 3 green; 2 red, 4 blue, 5 green; 2 red, 4 blue, 3 green; 3 green, 5 red, 8 blue; 2 green, 2 blue, 3 red; 11 blue, 6 green, 4 red\r\n"
      + "Game 34: 11 green, 14 red, 4 blue; 18 red, 10 green, 2 blue; 3 green, 11 blue, 3 red; 10 blue, 6 red, 10 green\r\n"
      + "Game 35: 4 green, 2 red, 4 blue; 3 green, 2 blue; 4 green, 2 red; 1 red, 4 green, 6 blue; 6 green\r\n"
      + "Game 36: 11 green, 15 red, 6 blue; 10 red, 7 blue, 2 green; 7 red, 7 green, 10 blue; 6 red, 14 green, 2 blue; 6 blue, 13 red, 12 green\r\n"
      + "Game 37: 2 green, 9 red, 3 blue; 2 blue, 5 green, 4 red; 3 green, 3 red; 4 green, 2 blue, 12 red; 3 red, 6 green\r\n"
      + "Game 38: 8 red, 4 green, 6 blue; 1 blue, 6 red, 6 green; 2 red, 5 blue, 6 green; 9 blue, 7 red, 7 green; 1 green, 9 red, 5 blue\r\n"
      + "Game 39: 1 green, 9 blue, 8 red; 9 blue; 8 red, 9 blue, 1 green; 2 blue, 1 red, 1 green\r\n"
      + "Game 40: 7 green, 13 blue; 11 green, 17 blue; 16 blue, 10 green; 7 green, 1 blue, 2 red; 5 blue\r\n"
      + "Game 41: 6 red, 2 blue, 7 green; 6 green, 4 blue; 2 red, 1 green, 3 blue; 6 red, 2 blue, 5 green\r\n"
      + "Game 42: 9 green, 3 blue; 1 red, 7 green, 6 blue; 3 red, 6 green, 10 blue; 1 blue, 8 green\r\n"
      + "Game 43: 5 green, 1 blue, 2 red; 4 blue, 2 red, 8 green; 4 green, 1 red, 4 blue; 2 blue, 9 green\r\n"
      + "Game 44: 9 red, 7 green; 7 blue, 9 green, 5 red; 4 green, 19 red, 16 blue; 5 green, 13 red, 6 blue; 3 green, 4 blue, 7 red\r\n"
      + "Game 45: 17 blue, 2 red, 3 green; 17 green, 9 blue, 1 red; 12 blue, 12 green; 1 blue, 1 red, 16 green\r\n"
      + "Game 46: 3 blue, 4 green, 1 red; 7 green, 1 red; 4 blue; 5 green, 1 red, 3 blue\r\n"
      + "Game 47: 6 red, 3 blue, 5 green; 2 green, 12 red; 6 blue, 2 green, 14 red; 5 blue, 5 red, 6 green; 8 red, 9 blue, 4 green; 17 red, 7 blue, 7 green\r\n"
      + "Game 48: 8 red, 18 blue, 6 green; 5 red, 2 blue, 1 green; 1 green, 12 red, 8 blue\r\n"
      + "Game 49: 2 red, 4 blue, 11 green; 10 green, 7 blue, 11 red; 3 red, 6 blue, 12 green; 7 red, 5 green, 6 blue\r\n"
      + "Game 50: 2 blue, 3 green, 3 red; 3 blue, 14 red; 3 red, 1 blue; 1 green; 11 red, 1 green, 2 blue\r\n"
      + "Game 51: 9 green, 2 red, 7 blue; 13 green, 3 red, 4 blue; 4 red, 12 green, 8 blue; 1 blue, 9 green, 4 red; 1 red, 7 blue, 4 green; 12 green, 9 blue, 4 red\r\n"
      + "Game 52: 10 red; 6 red, 3 blue, 3 green; 5 blue, 11 red; 3 green, 5 red\r\n"
      + "Game 53: 11 blue, 3 green; 17 blue, 1 green, 8 red; 2 blue, 3 green, 2 red; 7 blue, 10 red, 3 green\r\n"
      + "Game 54: 11 green, 5 red; 8 green, 10 blue, 2 red; 2 red, 8 green, 1 blue; 11 blue, 2 red, 17 green\r\n"
      + "Game 55: 4 green, 7 blue, 12 red; 8 red, 5 blue, 1 green; 1 blue, 11 red, 8 green; 12 red, 2 blue, 3 green; 7 green, 7 red\r\n"
      + "Game 56: 2 red, 6 blue, 6 green; 7 green, 1 red; 1 blue, 5 red, 5 green; 8 green, 8 red, 5 blue; 10 red, 1 blue, 5 green; 7 blue, 1 red, 8 green\r\n"
      + "Game 57: 14 red, 6 green, 3 blue; 11 red, 1 blue, 7 green; 19 red, 4 blue, 6 green; 2 blue, 17 red, 5 green\r\n"
      + "Game 58: 5 red, 11 blue; 13 green, 2 red, 2 blue; 6 green, 1 red, 1 blue\r\n"
      + "Game 59: 7 red, 8 green, 7 blue; 6 green, 12 red, 20 blue; 1 red, 10 blue, 1 green; 11 red, 5 green, 18 blue; 3 green, 13 blue; 12 red, 4 green\r\n"
      + "Game 60: 6 blue, 10 red; 1 blue, 9 red, 9 green; 5 red, 2 blue, 2 green; 4 blue, 8 green, 12 red\r\n"
      + "Game 61: 12 red, 1 green, 7 blue; 19 red, 1 green, 12 blue; 9 blue, 17 red, 1 green; 3 blue, 1 green, 13 red; 8 blue, 1 green, 10 red\r\n"
      + "Game 62: 3 red, 12 blue, 20 green; 4 green, 4 blue, 4 red; 6 green, 2 red, 4 blue; 10 green, 1 blue, 4 red\r\n"
      + "Game 63: 3 blue, 7 green, 12 red; 13 red, 2 blue, 2 green; 7 green, 2 blue; 2 blue, 17 red, 15 green\r\n"
      + "Game 64: 1 green, 10 red; 5 red, 17 green, 2 blue; 2 blue, 4 red, 1 green; 5 blue, 5 red, 3 green\r\n"
      + "Game 65: 6 red, 2 green, 2 blue; 4 blue, 12 red; 18 red, 3 blue; 2 green, 17 red, 8 blue; 1 green, 8 blue, 9 red\r\n"
      + "Game 66: 15 blue, 5 green; 4 red, 9 blue; 6 green, 15 blue, 1 red; 8 green, 8 red, 6 blue; 17 blue, 4 red, 6 green; 14 blue, 8 green, 7 red\r\n"
      + "Game 67: 16 red, 8 green, 1 blue; 9 red, 8 green; 10 red, 2 green, 2 blue; 11 blue, 6 green, 15 red; 4 green, 3 blue, 10 red\r\n"
      + "Game 68: 4 blue, 1 green, 10 red; 2 green, 2 red; 6 red; 2 blue, 1 green; 2 blue, 8 red; 4 red, 1 green\r\n"
      + "Game 69: 4 red, 5 blue, 4 green; 4 red, 1 blue; 1 green, 2 red, 3 blue\r\n"
      + "Game 70: 13 blue, 2 red, 10 green; 11 blue, 17 green; 6 red, 10 blue; 4 red, 13 green, 2 blue; 9 green, 13 blue, 3 red\r\n"
      + "Game 71: 1 green, 8 red, 5 blue; 1 green, 5 red, 3 blue; 7 red, 2 green, 7 blue; 1 blue, 2 green, 17 red; 10 red, 1 green, 2 blue; 5 blue, 16 red, 1 green\r\n"
      + "Game 72: 19 red, 2 green; 3 blue, 19 red, 7 green; 3 blue, 1 green, 15 red; 9 green, 2 blue, 16 red; 1 blue, 8 green, 1 red\r\n"
      + "Game 73: 1 blue, 2 green; 8 blue, 1 red, 1 green; 5 blue, 6 green\r\n"
      + "Game 74: 12 red; 5 green, 12 red; 4 red, 6 green; 8 red, 5 green; 1 blue, 10 red, 7 green\r\n"
      + "Game 75: 3 green, 1 blue; 10 green, 8 red; 8 blue, 11 green; 6 blue, 2 red, 6 green\r\n"
      + "Game 76: 9 green, 14 red; 2 red, 4 green, 18 blue; 7 blue, 6 green, 2 red; 6 red, 13 blue, 10 green; 4 red, 2 blue, 1 green; 16 blue, 12 green, 12 red\r\n"
      + "Game 77: 4 red, 2 blue; 6 blue, 1 red, 4 green; 3 red, 3 green, 8 blue; 7 red, 2 blue, 4 green; 4 red, 6 blue\r\n"
      + "Game 78: 5 green, 4 blue; 1 red, 4 green, 9 blue; 3 blue, 8 green\r\n"
      + "Game 79: 12 green, 1 blue, 6 red; 10 green, 2 blue, 1 red; 3 blue, 2 red; 11 green, 5 red\r\n"
      + "Game 80: 3 green, 3 red; 1 green, 3 blue, 2 red; 15 green, 2 red, 4 blue; 9 green, 3 blue, 8 red; 3 green, 2 red; 3 green, 5 red\r\n"
      + "Game 81: 9 blue, 9 green; 2 red, 3 green, 16 blue; 12 green, 16 blue, 4 red; 1 blue, 2 red, 6 green; 10 green, 4 red, 17 blue; 13 blue, 6 green, 4 red\r\n"
      + "Game 82: 1 blue, 16 green, 10 red; 15 green, 11 red, 1 blue; 1 blue, 8 red, 8 green\r\n"
      + "Game 83: 6 blue, 5 green; 2 green, 12 blue; 1 red, 2 green, 6 blue\r\n"
      + "Game 84: 3 red, 17 blue; 2 red, 10 green, 10 blue; 14 blue, 1 green, 9 red; 8 green, 11 blue\r\n"
      + "Game 85: 3 blue, 5 green, 14 red; 2 blue, 3 red; 2 green, 9 red\r\n"
      + "Game 86: 7 red, 1 green; 14 blue, 8 green; 3 blue, 10 red, 7 green; 3 red, 8 green\r\n"
      + "Game 87: 9 blue, 1 green; 2 green, 8 blue, 18 red; 10 red, 3 blue, 2 green; 2 green, 4 red; 4 green, 9 red, 9 blue; 14 red, 5 blue, 2 green\r\n"
      + "Game 88: 3 red, 16 blue, 1 green; 13 blue, 3 red, 4 green; 3 green, 1 blue, 2 red; 4 green, 1 blue, 3 red\r\n"
      + "Game 89: 12 blue, 5 green, 14 red; 7 red, 4 green, 10 blue; 7 red, 11 blue, 3 green; 5 green, 7 blue, 4 red\r\n"
      + "Game 90: 8 green, 3 blue, 1 red; 1 red, 2 blue, 13 green; 2 blue, 14 green, 3 red; 7 green, 2 red, 5 blue\r\n"
      + "Game 91: 3 green, 3 red, 9 blue; 5 green, 1 red; 1 green, 1 red, 3 blue\r\n"
      + "Game 92: 2 blue, 1 red, 4 green; 7 blue, 6 green; 7 red, 12 green, 3 blue; 7 red, 8 green, 4 blue; 14 green, 9 blue; 15 green, 3 red, 3 blue\r\n"
      + "Game 93: 8 blue, 4 green, 1 red; 15 green; 9 blue, 3 green\r\n"
      + "Game 94: 12 green, 17 blue, 11 red; 3 green, 1 red, 19 blue; 17 blue, 10 green, 11 red\r\n"
      + "Game 95: 13 green, 1 red, 8 blue; 12 blue, 10 green, 4 red; 13 red, 5 green; 11 red, 12 blue, 6 green\r\n"
      + "Game 96: 13 blue, 11 red, 13 green; 12 red, 3 blue, 4 green; 14 green, 9 red, 15 blue\r\n"
      + "Game 97: 9 red, 9 green, 11 blue; 11 green, 8 red, 9 blue; 5 blue, 6 red, 9 green; 3 green, 8 red, 4 blue\r\n"
      + "Game 98: 5 blue, 6 red; 8 red; 1 green, 9 blue, 5 red\r\n"
      + "Game 99: 4 green, 3 red; 3 green; 1 red, 2 green; 2 red, 1 green, 2 blue; 2 red, 4 green; 1 green, 2 blue, 1 red\r\n"
      + "Game 100: 3 blue, 3 red, 6 green; 7 red, 2 green, 16 blue; 14 green, 9 red, 9 blue; 8 red, 10 green, 9 blue; 6 blue, 11 red";
  
  public static void main(String[] args) {
    int score = 0;
    for (String line : input.split("\r\n")) {
      String[] sets = line.split(":")[1].split(";");
      long maxB = 0;
      long maxR = 0;
      long maxG = 0;
      for (String set : sets) {
        String[] values = set.trim().split(",");
        long blue = 0;
        long red = 0;
        long green = 0;
        for (String v : values) {
          String c = v.trim().split(" ")[1];
          int cnt = Integer.parseInt(v.trim().split(" ")[0]);
          if ("blue".equals(c)) {
            blue += cnt;
          }
          if ("red".equals(c)) {
            red += cnt;
          }
          if ("green".equals(c)) {
            green += cnt;
          }

        }
        if (blue > maxB) {
          maxB = blue;
        } 
        if (red > maxR) {
          maxR = red;
        }
        if (green > maxG) {
          maxG = green;
        }
      }
      score += (maxB * maxR * maxG);
      System.out.println(score);
    }
  }
}
