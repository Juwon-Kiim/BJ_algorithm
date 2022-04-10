package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1012 {
	static int M, N, K, ans;
	static int[][] map;
	static boolean[][] visit;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			st = new StringTokenizer(br.readLine());
			
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[M][N];
			visit = new boolean[M][N];
			
			
			for(int i=0;i<K;i++) {
				st = new StringTokenizer(br.readLine());
				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				
				map[r][c] = 1;
			}
			
			ans=0;
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					if(map[i][j]==1 && !visit[i][j]) {
						visit[i][j] = true;
						bfs(i, j);
					}
				}
			}
			System.out.println(ans);
		}
	}
	
	private static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {r, c});
		
		while(!q.isEmpty()) {
			int[] cur = q.poll(); 
			
			for(int d=0;d<4;d++) {
				int nr = cur[0]+dr[d];
				int nc = cur[1]+dc[d];
				
				if(nr>=0 && nc>=0 && nr<M && nc<N && map[nr][nc]==1 && !visit[nr][nc]) {
					visit[nr][nc] = true;
					q.offer(new int[] {nr, nc});
				}
			}
		}
		ans++;
	}
}
