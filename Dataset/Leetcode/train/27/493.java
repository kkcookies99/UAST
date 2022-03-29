 class Solution {
    public int XXX(int[] nums, int val) {
        int numLength=nums.length;
        if(numLength==0) return 0;
        else if(numLength==1&&nums[0]==val){
            return 0;
        }
        else {
            for (int i = 0; i < numLength; i++) {
                if (nums[i] == val) {
                    for (int j = i; j < numLength-1; j++) {
                        nums[j] = nums[j + 1];
                    }
                    if(nums[i]==val){
                        i--;
                    }
                    numLength--;
                }
            }
            return numLength;
        }

    }
}

