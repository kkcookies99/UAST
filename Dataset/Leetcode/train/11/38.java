class Solution {
    public int XXX(int[] height) {
        int i = 0;
        int j  = height.length - i - 1;
        int area = 0;

        while (i < j){

            int tmpArea = height[i] > height[j] ? height[j] * (j - i) :  height[i] * (j - i) ;
            //计算较大的面积
            area = tmpArea > area ? tmpArea : area;

            if (height[i] > height[j]){
                //如果左边更高，右边则左移一位
                j--;
            } else{
                //如果右边更高或者高度相同，左边则左移一位
                i++;
            } 

        }
        return area;
    }
}

