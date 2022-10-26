package FileReaderandComprable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderandComprable {
	public static void main(String[] args) throws FileNotFoundException {
		int i = 0;
		int n = 0;
		File datafile = new File("filename");
		Scanner keyboard = new Scanner(datafile);
		while (keyboard.hasNextLine()) {
			String data = keyboard.nextLine();
			System.out.println(data);
			n++;
			double datagetter = Double.parseDouble(data);
			double dataholder[] = new double[n];
			dataholder[i] = datagetter;
			i++;
		}
		keyboard.close();

	}

	private static boolean big(Comparable v, Comparable w) {
		return v.compareTo(w) > 0;
	}

	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static void sort(Comparable[] a) { // Sort a[] into increasing order.
		int N = a.length;

		for (int i = 1; i < N; i++) { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
			for (int j = i; j > 0 && big(a[j], a[j - 1]); j--)
				exch(a, j, j - 1);
		}
	}

}
