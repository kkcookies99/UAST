 public int XXX(int[] height) {
        int max =Integer.MIN_VALUE;
        int left =0;
        int right = height.length-1;
        while(right>left){
            int area = (right-left)*(height[left]>height[right]?height[right]:height[left]);
            if(area>max){
                max = area;
            }
            if(height[right]<height[left]){
                right--;
            }else{
                left++;
            }
        }
        return max;
    }

