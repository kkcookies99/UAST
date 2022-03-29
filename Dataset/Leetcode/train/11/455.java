 class Solution {
    public int XXX(int[] height) {

        int left = 0;
        int right = height.length-1;

        //结果
        int res = Integer.MIN_VALUE;

        //双指针滑动
        while(left < right){
            
            //看看哪条边短
            boolean leftShort = true;
            if(height[left] > height[right]){
                leftShort = false;
            }

            //记录最新值
            int newRes =  (leftShort? height[left]:height[right]) * (right-left);

            if(res < newRes){
                res = newRes;
            }

            //移动短的边，尽可能往高处走
            if(leftShort){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}

