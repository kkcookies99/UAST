class Solution {
    public int XXX(int[] height) {
        int i=0,j=height.length-1,res=0,temp=0;
        while(i<j){
            res=(temp=(j-i)*(height[i]<=height[j]?height[i++]:height[j--]))>res?temp:res;
        }
        return res;
    }
}

