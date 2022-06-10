package BJ;

import java.util.Scanner;

public class BJ_10974_모든순열 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];
		int[] num = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}

		back(N, arr, num, new boolean[N], 0);
	}

	static void back(int N, int[] arr, int[] num, boolean[] check, int cnt) {
		if (cnt == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (check[i] != true) {
				num[cnt] = arr[i];
				check[i] = true;
				back(N, arr, num, check, cnt + 1);
				check[i] = false;
			}
		}
	}
}
