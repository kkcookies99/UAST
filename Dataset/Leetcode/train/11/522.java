 class Solution {
    public int XXX(int[] height) {
        int len=height.length;
    	int left=0,right=len-1;
    	int max=0;
    	int water=0;
    	while(left<=right){
    		//water=Math.min(height[left],height[right])*(right - left);
    		if(height[left] < height[right]){
    			water=height[left]*(right - left);
    			left++;
    		}else{
    			water = height[right]*(right - left);
    			right--;
    		}
    		
    		max=Math.max(water,max);
    	}
    	
    	return max;
    }
}

