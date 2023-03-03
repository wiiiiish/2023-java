package Array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Q11 {
	
	public int solution (int n, int m, int[][] arr) {
		
		int ans = 0;
		
		
		return ans;
	}
	
	public static void main(String[] args) {
		Q11 T = new Q11();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 입력받은 학생수
		int m = 5; // 5반까지
		int[][] arr = new int[n][5];
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(T.solution(n, m, arr));
		
		
	}
}
