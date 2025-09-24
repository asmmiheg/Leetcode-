class Solution {
    public int trap(int[] height) {
        int waterLevel;
        int trapped=0;
        int n=height.length;
        int[] leftMax= new int[n];
        int[] rightMax=new int[n];

        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            waterLevel=Math.min(leftMax[i],rightMax[i])-height[i];
            if(waterLevel > 0){
                trapped += waterLevel;
            }
        }
        return trapped;
    }
}