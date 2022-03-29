 class Solution {
    int target;
	int[] nums;
    public int[] XXX(int[] nums, int target) {
     int i=0;
	 int[] solt=new int[2];
     int b=0;
	     while(i<nums.length){
	            int j=i+1;
	            while(j<nums.length){
	            	if(nums[i]+nums[j]==target){
	            		solt[0]=i;
	            		solt[1]=j;
	            		b=1;
	                }
                    if(b==1){
                        break;
                    }
	            	j++;
	            }
                if(b==1){
                        break;
                    }
	           i++;      
	            }
	        return solt;
     }
}

