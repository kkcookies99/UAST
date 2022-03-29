class Solution {
    public int XXX(int[] height) {
        int begin = 0, end =height.length-1,max = 0, temp = height[0], j = 0;
        int length = height.length;
        for(int i=1; i<length; i++){
            if(height[i] > temp){
                temp = height[i];
                j = i;
            }
        }
        while(begin<j){
            max = Math.max(max, (j - begin) * height[begin]);
            begin++;
        }
        while(end>j){
            max = Math.max(max, (end - j) * height[end]);
            end--;
        }
        return max;
    }
}

