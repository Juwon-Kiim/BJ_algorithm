package w0221;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BJ_1260 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int M = Integer.parseInt(st.nextToken());
		
		int V = Integer.parseInt(st.nextToken());
		
		int[][] graph=new int[N+1][N+1];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		dfs(graph, new boolean[N+1], N, V);
		System.out.println();
		bfs(graph, new boolean[N+1], N, V);
	}
	public static void dfs(int[][] graph, boolean[] visited, int N, int current) {
		visited[current]=true;
		System.out.print(current+" ");
		for(int i=1;i<=N;i++) {
			if(!visited[i]&&graph[current][i]==1) {
				dfs(graph, visited, N, i);
			}
		}
	}
	public static void bfs(int[][] graph, boolean[] visited, int N, int start) {
	
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(start);
		visited[start]=true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current+" ");
			
			for(int i=1;i<=N;i++) {
				if(!visited[i]&&graph[current][i]==1) {
					queue.offer(i);
					visited[i]=true;
				}
			}
		}
	}
}
