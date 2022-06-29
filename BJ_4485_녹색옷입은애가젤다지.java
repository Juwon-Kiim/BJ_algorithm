package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class BJ_4485_녹색옷입은애가젤다지 {
	static int N;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int[][] map, distance;
	
	static class Vertex implements Comparable<Vertex>{

		int r, c, cost;
		
		public Vertex(int r, int c, int cost) {
			super();
			this.r = r;
			this.c = c;
			this.cost = cost;
		}

		@Override
		public int compareTo(Vertex o) {
			return this.cost - o.cost;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int tc = 1;
		while(true) {
			N = Integer.parseInt(br.readLine());
			if(N==0) {
				break;
			}
			map = new int[N][N];
			distance = new int[N][N];
			
			for(int i=0;i<N;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<N;j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					distance[i][j] = Integer.MAX_VALUE;
				}
			}
			
			bfs();
			
			System.out.println("Problem " + tc++ + ": " + distance[N-1][N-1]);
		}
	}
	static void bfs() {
		PriorityQueue<Vertex> pq = new PriorityQueue<>();
		pq.add(new Vertex(0, 0, map[0][0]));
		distance[0][0] = map[0][0];
		
		while(!pq.isEmpty()) {
			Vertex v = pq.poll();
			
			for(int d=0;d<4;d++) {
				int nR = v.r + dr[d];
				int nC = v.c + dc[d];
				if(isValid(nR, nC)) {
					if(distance[nR][nC] > distance[v.r][v.c]+ map[nR][nC]) {
						distance[nR][nC] = distance[v.r][v.c] + map[nR][nC];
						pq.add(new Vertex(nR, nC, distance[nR][nC]));
					}
				}
			}
		}
	}
	static boolean isValid(int r, int c) {
		if(r>=0 && r<N && c>=0 && c<N)
			return true;
		return false;
	}
}
