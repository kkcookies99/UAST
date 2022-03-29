 class Solution {
    public int XXX(int[] height) {
        int end=height.length;
        if(end==0||end==1)
            return 0;
        end--;
        int begin=0;
        int maxV=0;
        while(begin<end){
            int nowV=Math.min(height[begin],height[end])*(end-begin);
            if(nowV>maxV)
                maxV=nowV;
            if(height[begin]>height[end])
                end--;
            else 
                begin++;
        }
        return maxV;
    }
}

