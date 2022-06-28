package BJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BJ_11279_최대힙 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2-o1;
			}

			
		});
		
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num>0) {
				pQueue.add(num);
			}
			else if(num==0) {
				if(pQueue.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(pQueue.poll());
				}
			}
		}
	}
}
