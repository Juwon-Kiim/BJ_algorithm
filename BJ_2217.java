package Algo_D0302;

import java.util.Arrays;
import java.util.Scanner;

public class BJ_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] weight = new int[N];
		for(int i=0;i<N;i++) {
			weight[i] = sc.nextInt();
		}
		Arrays.sort(weight);
		
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<N;i++) {
			max = Math.max(max, weight[i]*(N-i));
		}
		
		System.out.println(max);
	}
}
