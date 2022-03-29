 class Solution {
    public void XXX(int[] nums) {
        /*
        int[] count = {0, 0, 0};  
        for(int i = 0 ; i < nums.length ; i ++){
            assert nums[i] >= 0 && nums[i] <= 2;
            count[nums[i]] ++;
        }
        int index = 0;
        for(int i = 0 ; i < count[0] ; i ++)
            nums[index++] = 0;
        for(int i = 0 ; i < count[1] ; i ++)
            nums[index++] = 1;
        for(int i = 0 ; i < count[2] ; i ++)
            nums[index++] = 2;
        */
         //三路快排法：
        /*
        int zero = -1;//nums[0~zero] == 0;
        int two = nums.length;//nums[two~n-1]==2
        for(int i = 0;i<two;){
            if(nums[i]==1)
                i++;
            else if(nums[i]==2){
                two --;
                int temp = nums[i];
                nums[i] = nums[two];
                nums[two] = temp;
                }
            else {
                assert(nums[i] ==0);
                zero++;
                int temp = nums[zero];
                nums[zero] = nums[i];
                nums[i] = temp;
                i++;
            }        
        }  
        */
        //最简单
        Arrays.sort(nums);
    }    
}

