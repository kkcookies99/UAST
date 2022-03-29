class Solution {
    public int XXX(int[] height) {
        int  len = height.length;
        int i = 0;
        int j = len-1;
        int res=0;
        while(i<j){
            int tem = (j-i)*Math.min(height[i],height[j]);
            if(tem > res) res = tem;
            if(height[i]<=height[j]){
                //左指针长度受限，所以应该移动左指针
                int left = height[i];
               while(height[++i]>left){
                break;} 
            }else{
                  int right = height[j];
               while(height[--j]>right){
                break;} 
            }
        }
        return res;
    }
}

