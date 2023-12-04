package at.mschreiber.advendofcode.y2023;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Day4Part2 {

	public static String[] originalCards = Day4Input.mine.split(("\r\n"));
	public static long totalCnt = 0;

	public static void main(String[] args) {
		for (int i = 0; i < originalCards.length; i++) {
			totalCnt++;
			proceedCard(originalCards[i], i);
		}
		System.out.println(totalCnt);
	}

	public static void proceedCard(String card, int i) {
		long cnt = getCnt(card);
		for (int x = 1; x <= cnt; x++) {
			totalCnt++;
			proceedCard(originalCards[x + i], x + i);
		}
	}

	public static long getCnt(String card) {
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
		return cnt;

	}

}
