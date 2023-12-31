package at.mschreiber.advendofcode.y2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day4Part1 {

	public static void main(String[] args) {
		String[] cards = Day4Input.mine.split(("\r\n"));
		double sum = 0;

		for (int i = 0; i < cards.length; i++) {
			String card = cards[i];
			sum = sum + getCnt(card);
		}
		System.out.println(sum);
	}

	public static double getCnt(String card) {
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
			return Math.pow(2, cnt - 1);
		}
		return cnt;

	}

}
