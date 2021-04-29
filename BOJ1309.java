package 백준공부;

import java.util.Scanner;

public class BOJ1309 {	
	static int dp[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		dp = new int[N][3];
		dp[0][0] = 1;
		dp[0][1] = 1;
		dp[0][2] = 1;
		
		for (int i=1;i<N;i++) {
			dp[i][0] = (dp[i-1][0]+dp[i-1][1]+dp[i-1][2])%9901;
			dp[i][1] = (dp[i-1][0]+dp[i-1][2])%9901;
			dp[i][2] = (dp[i-1][0]+dp[i-1][1])%9901;
		}
		System.out.println((dp[N-1][0]+dp[N-1][1]+dp[N-1][2])%9901);
	}

}
