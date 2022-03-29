class Solution {
    public int XXX(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        int i = 0;
        int j = height.length-1;
        int area = 0;
        int XXX = 0;
        while(i < j){
            if(height[i] > height[j]){
                area = height[j]*(j-i);
                j--;
            }else if(height[i] < height[j]){
                area = height[i]*(j-i);
                i++;
            }else{
                area = height[i]*(j-i);
                i++;
                j--;
            }
            if(XXX < area)
                XXX = area;
        }
        return XXX;
    }
}

