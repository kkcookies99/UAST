 public int XXX(int[] height) {
        int start = 0;
        int end = height.length-1;
        int max = Math.min(height[start],height[end])*(end-start);
        while(start<end){
            if(height[start]<height[end]){ //左边小，只有左边往右走才有可能遇到更高的柱子，这样面积才大
                start++;
            }else if(height[start]>height[end]){ //右边小，只有右边往左走才有可能遇到更高的柱子，这样面积才大
                end--;
            }else{ //两边相等，倘若随便移动一遍得到的面积一定是小于等于现在的面积，因此两边都往中间走
                start++;
                end--;
            }
            max = Math.max(max,Math.min(height[start],height[end])*(end-start));
        }
        return max;
    }

