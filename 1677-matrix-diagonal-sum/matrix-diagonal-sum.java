class Solution {
    public int diagonalSum(int[][] mat) {
        int priSum=0, secSum=0, totSum=0;
        int n=mat.length;
        if(n==1){
            return mat[0][0];
        }
        for(int i=0;i<n;i++){
            priSum += mat[i][i];
        }
        int j=n-1;
        for(int i=0;i<n;i++){
            secSum += mat[i][j];
            j--;
        }
        if (n % 2 != 0) {
            totSum = priSum + secSum - mat[n / 2][n / 2];
        } else {
            totSum = priSum + secSum;
        }
        return totSum;
    }
}