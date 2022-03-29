class Solution {
    public int XXX(int[] height) {
        int max = 0,i = 0,j=height.length - 1,temp;
        while(i != j){
            temp = (j - i)*(height[j]<height[i]?height[j--]:height[i++]);
            if(max < temp)max = temp;
        }
        return max;
    }
}

