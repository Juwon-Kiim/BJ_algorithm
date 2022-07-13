package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2352_반도체설계 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] dp = new int[n];
		dp[0] = arr[0];
		int idx=0;
		for(int i=1;i<n;i++) {
			if(arr[i]>dp[idx]) {
				dp[++idx] = arr[i];
			}
			else {
				int j;
				for(j=0;j<idx;j++) {
					if(arr[i]<=dp[j]) break;
				}
				dp[j] = arr[i];
			}
		}
		System.out.println(idx+1);
	}
}