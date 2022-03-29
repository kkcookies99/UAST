 class Solution {
    public void XXX(int[] nums) {
        int[] colors = new int[3];
        for(int i=0;i<nums.length;i++){
            int index = nums[i];
            colors[index] += 1;
        }
        for(int i=0;i<nums.length;i++) {
            if(colors[0]!=0) {
                nums[i]=0;
                colors[0]--;
            }else if(colors[1]!=0){
                nums[i]=1;
                colors[1]--;
            }else if(colors[2]!=0){
                nums[i]=2;
                colors[2]--;
            }
        } 
        
    }

}

