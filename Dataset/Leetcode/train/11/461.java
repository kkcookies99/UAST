 public int XXX(int[] height) {

        //采用左右指针解
        //因为面积取决于短边，所以高度低的一边持续移动，直到找到更高的边计算面积保存后，哪边低哪边移动

        //height 从0开始

        int left = 0;
        int right = height.length-1;
        int XXX = 0;
        int maxLeft = -1;
        int maxRight = -1;


        while(left < right) {
            if(height[left] > maxLeft || height[right] > maxRight) {
                if(height[left] > maxLeft) {
                    maxLeft = height[left];
                }
                if(height[right] > maxRight) {
                    maxRight = height[right];
                }
                XXX = Math.max((right - left) * Math.min(height[left], height[right]), XXX);
            } else{
                if(height[left] < height[right]) {
                    left ++;
                }else{
                    right--;
                }
            }
        }
        return XXX;
    }

