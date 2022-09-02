//https://practice.geeksforgeeks.org/problems/minimum-cost-to-cut-a-board-into-squares/1

class Solution {
    public static int minimumCostOfBreaking(int[] X, int[] Y,int M,int N) {
        // code here
        Arrays.sort(X);
        Arrays.sort(Y);
        int i=X.length-1;
        int j=Y.length-1;
        int row=1;
        int col=1;
        int ans=0;
        while(i>=0 || j>=0) {
            int a=i>=0?X[i]:-1;
            int b=j>=0?Y[j]:-1;
            if(a>=b) {
                ans+=row*(a);
                col++;
                i--;
            }else{
                ans+=col*(b);
                row++;
                j--;
            }
        }
        return ans;
    }
}
