package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_2583_영역구하기 {
	static int M, N, sqr_cnt;
	static int[][] map;
	static int[] cnt;
	static boolean[][] visited;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		cnt = new int[10000];
		
		map = new int[M][N];
		visited = new boolean[M][N];
		
		for(int i=0;i<K;i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			for(int c=x1;c<x2;c++) {
				for(int r=y1;r<y2;r++) {
					map[r][c] = 1;
				}
			}
		}
		sqr_cnt = 0;
		for(int i=0;i<M;i++) {
			for(int j=0;j<N;j++) {
				if(map[i][j]!=1 && !visited[i][j]) {
					bfs(i, j);
				}
			}
		}
		Arrays.sort(cnt);
		System.out.println(sqr_cnt);
		
		for(int i=0;i<10000;i++) {
			if(cnt[i]!=0)
				System.out.print(cnt[i] + " ");
		}
	}
	public static void bfs(int r, int c) {
		Queue<int[]> queue = new LinkedList<>();
		int count = 0;
		
		queue.add(new int[] {r, c});
		visited[r][c] = true;
		count++;
		
		while(!queue.isEmpty()) {
			int[] cur = queue.poll();
			int cr = cur[0];
			int cc = cur[1];
			
			for(int d=0;d<4;d++) {
				int nr = cr + dr[d];
				int nc = cc + dc[d];
				
				if(nr>=0 && nr<M && nc>=0 && nc<N && map[nr][nc]!=1 && !visited[nr][nc]) {
					queue.add(new int[] {nr, nc});
					visited[nr][nc]=true;
					count++;
				}
			}
		}
		cnt[sqr_cnt++] = count;
	}
}
