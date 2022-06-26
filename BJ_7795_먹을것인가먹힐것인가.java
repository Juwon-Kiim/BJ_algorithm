package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_7795_먹을것인가먹힐것인가 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			int a_size = Integer.parseInt(st.nextToken());
			int b_size = Integer.parseInt(st.nextToken());
			int[] A = new int[a_size];
			int[] B = new int[b_size];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<a_size;i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(A);
			st = new StringTokenizer(br.readLine());
			for(int i=0;i<b_size;i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(B);
			int count = 0;
			for(int i=0;i<a_size;i++) {
				for(int j=b_size-1;j>=0;j--) {
					if(A[i]>B[j]) {
						count+=j+1;
						break;
					}
				}
			}
			
			System.out.print(count + " ");
		}
	}
}
