package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main_1926 {
    static int n, m;
    static int[][] arr;
    static boolean[][] check;
    static int ans;
    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    static int max, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n][m];
        check = new boolean[n][m];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        max = 0;
        count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 1 && !check[i][j]){
                    bfs(i, j, 1);
                    count++;
                }
            }
        }
        System.out.println(count+"\n"+max);
    }

    static void bfs(int i, int j, int cnt){
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{i, j});

        check[i][j] = true;

        while(!q.isEmpty()){
            int[] poll = q.poll();
            int curR = poll[0];
            int curC = poll[1];
            for(int d=0;d<4;d++){
                int nR = dr[d] + curR;
                int nC = dc[d] + curC;
                if(nR>=0 && nC>=0 && nR<n && nC<m && arr[nR][nC]==1 && !check[nR][nC]){
                    q.add(new int[]{nR, nC});
                    cnt++;
                    check[nR][nC]=true;
                }
            }
        }
        if(cnt > max){
            max = cnt;
        }
    }
}
