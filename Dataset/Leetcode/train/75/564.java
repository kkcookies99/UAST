 class Solution {
    public void XXX(int[] nums) {
        int start = 0;
        int last = nums.length - 1;
        int temp = 0;
        while(temp != last){
            if(nums[temp] == 2){
                while(nums[last] == 2){
                    if(temp == last) return ;
                    last--;
                }
                swap(nums,temp,last);
            }else if(nums[temp] == 0){
                while(nums[start] == 0){
                    if(start == last) return ;
                    start++;
                }
                if(start >= temp) temp = start;
                else{
                    swap(nums,start,temp);
                }
            }else{
                if(nums[last] == 0) swap(nums,last,temp);
                else temp++;
            }
        }
    }
    public void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

