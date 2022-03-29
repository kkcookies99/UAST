 public int XXX(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = Integer.MIN_VALUE;
        while(start<end){
            max = Math.max(max,(end-start)*Math.min(height[end],height[start]));
            if(height[end]>height[start]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
双指针往中间扫描，小的往中间靠，保留最大值

