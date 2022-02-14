package w0214;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_2961 {
	static int[] S, B;
	static int N;
	static boolean[] isSelected;
	static int s, b;
	static int min;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		S = new int[N];
		B = new int[N];
		isSelected = new boolean[N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			B[i] = Integer.parseInt(st.nextToken());
			s=1;
			b=0;
			min = 100000; // Integer.MAX_VALUE 사용하세요
			
		}
		powerset(0);
		System.out.println(min);
	}
	public static void powerset(int cnt) {
		
		if(cnt==N) {
//			for(int i=0;i<N;i++) {
//				System.out.print((isSelected[i]?S[i]:"X") + " ");
//				System.out.print((isSelected[i]?B[i]:"X")+" ");
//			}
//			System.out.println();
			return;
		}
		// 현재 원소 선택
		isSelected[cnt] = true;
		s=s*S[cnt];
		b=b+B[cnt];
		if(Math.abs(s-b)<min) {
			min = Math.abs(s-b);
		}
		powerset(cnt+1);
		// 현재 원소 비선택
		isSelected[cnt] = false;
		s=s/S[cnt];
		b=b-B[cnt];

		powerset(cnt+1);
	}
}
