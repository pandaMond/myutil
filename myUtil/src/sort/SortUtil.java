package sort;

public class SortUtil {

	/**
	 * √∞≈∆≈≈–Ú
	 * 
	 * @param a
	 * @return
	 */
	public Integer[] bubbleSort(Integer[] a) {
		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		return a;
	}

	/**
	 * ÷±Ω”≤Â»Î≈≈–Ú
	 */
	public Integer[] InsertSort(Integer[] a) {
		int temp = 0;
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			temp = a[i];
			for (; j >= 0 && temp < a[j]; j--) {
				a[j + 1] = a[j];
			}
			a[j + 1] = temp;
		}

		return a;
	}

}
