 class Solution {
    public int XXX(int[] height) {
        int left = 0;
        int right = height.length-1;
        int S = 0;
        int temp = S;
        int minIndex = 0;
        while(left<right){
            if(height[left]<height[right]){ //判断左右大小获得小值得索引
                minIndex=left;
            }else{
                minIndex=right;
            }
            S = height[minIndex]*(right-left);
            if(S>temp){
                temp = S;
            }
            if(minIndex==left){ //移动一位底变化一样 所以要改变小的高
                left++;
            }else{
                right--;
            }
        }
        return temp;
    }
}

