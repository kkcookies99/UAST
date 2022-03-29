 class Solution {
    public int XXX(int[] nums, int val) {
           if(nums.length==0){
         return 0;
     }
     Arrays.sort(nums);
   
    int i=0;
    
    while(i<nums.length&&nums[i]<val){
        i++;
    }
    int j=i;
    while(j<nums.length&&nums[j]==val){
        j++;
    }
    if(i==j) return nums.length;
    while(j<nums.length){
        nums[i++]=nums[j++];
    }
    return nums.length-(j-i);
}
}

