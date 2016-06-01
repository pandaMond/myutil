package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MathUtil {

	/**
	 * 产生随机数组
	 */
	public int[] randomArray(int length, int min, int max) {
		Random random = new Random();

		int[] number = new int[length];
		for (int i = 0; i < number.length; i++) {
			int spacing = Math.abs(max - min);
			int storage = random.nextInt(spacing);
			number[i] = storage + min;
		}
		return number;
	}

	public static void randomString(int length) {
		StringBuffer stringbuffer = new StringBuffer();
		List<Character> list = new ArrayList<>();
		for (int i = 48; i < 58; i++) {
			list.add((char) i);
		}
		for (int i = 0; i < 26; i++) {
			int a = 65;
			int A = 97;
			list.add((char) (a + i));
			list.add((char) (A + i));
		}
		Random random = new Random();
		for (int i = 0; i <= length; i++) {

			stringbuffer.append(list.get(random.nextInt(list.size())));
		}

	}
}
