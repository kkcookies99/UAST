 class Solution {
    public int XXX(int[] height) {
    // /*滑动窗口移动，有两个指针，一前一后，用两个for循环i,j，决定步长j-i，通过比较nums[i]和nums[j]的大小 ，取较小者，面积     s*/int max = 0 ;
    // for(int i = 0 ;i<height.length-1;i++){
    //     for(int j = i+1 ;j<height.length;j++){
    //         int area = Math.min(height[i],height[j]) *(j-i);
    //         if(area>max){
    //             max = area ;
    //         }
    //     }
    // }
    // return max;
    int left = 0 ;
    int right = height.length-1;
    int max = 0 ;
    while(left<right){
        max = Math.max(max,Math.min(height[left],height[right])*(right-left));
        if(height[left]<height[right]){
            left ++;
        }
        else{
            right--;
        }
    }
    return max;
    }
}

