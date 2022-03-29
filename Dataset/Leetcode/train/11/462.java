 class Solution {
    public int XXX(int[] height) {
        int i=0,j=height.length-1;
        int max_num = 0;
        while (true){
            if (i==j){break;}
            if (height[i]<height[j]){
                if (max_num<height[i]*(j-i)){
                    max_num=height[i]*(j-i);
                }
                i++;
            }else{
                if (max_num<height[j]*(j-i)){
                    max_num=height[j]*(j-i);
                }
                j--;
            }
        }
        return max_num;
    }
}

