package Medium;

public class MaxNumOfPointWithCost1937 {
    public static void main(String[] args) {
        int[][] points = {{0, 3, 0, 4, 2}, {5, 4, 2, 4, 1}, {5, 0, 0, 5, 1}, {2, 0, 1, 0, 3}};
        System.out.println(maxPoints(points));
    }

    public static long maxPoints(int[][] points) {
        long ans=0;
        int m=points.length;
        int n=points[0].length;
        long dp[]=new long[n];
        for(int i=m-1;i>=0;i--){
            for(int j=1;j<n;j++){
                dp[j]=Math.max(dp[j],dp[j-1]-1);
            }
            for(int j=n-2;j>=0;j--){
                dp[j]=Math.max(dp[j],dp[j+1]-1);
            }
            for(int j=0;j<n;j++){
                dp[j]+=points[i][j];
                ans=Math.max(ans,dp[j]);
            }
        }
        return ans;
    }
}
