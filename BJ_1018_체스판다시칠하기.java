package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1018_체스판다시칠하기 {
	public static boolean[][] map;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(st.nextToken());
		
		map = new boolean[N][M];
		
		
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				if(str.charAt(j)=='W') {
					map[i][j] = true;
				} else {
					map[i][j] = false;
				}
			}
		}
		
		int row = N-7;
		int col = M-7;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
	public static void find(int x, int y) {
		int cnt = 0;
		
		boolean FirstBoolean = map[x][y];
		
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if(map[i][j] != FirstBoolean) {
					cnt++;
				}
				FirstBoolean = !FirstBoolean;
			}
			FirstBoolean = !FirstBoolean;
		}
		cnt = Math.min(cnt, 64-cnt);
		min = Math.min(min, cnt);
	}
}
