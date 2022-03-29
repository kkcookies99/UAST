class Solution {
public:
    int XXX(vector<int>& nums) {
        // cur indicates the current subset of the nums
        int cur = nums[0];
        int maximun = cur;
        for(int i=1;i<nums.size();i++){
            // sum of current negative and next number is negative,
            // in this case, we need to set the next number as the new set 
            // otherwise the sum would be even negative
            if(nums[i]>0 && cur<=0){
                maximun = max(maximun, nums[i]);
                cur = nums[i];
            }
            // sum of current positive and next number is positive,
            // we need to include next number in the subset to increase the sum
            else if(nums[i]>0 && cur>0){
                cur += nums[i];
                maximun = max(maximun, cur);
            }
            // sum of current is negative and next number is positive,
            // we just abondan the current subset and set next number as the new subset
            else if(nums[i]<=0 && cur<=0){
                maximun = max(maximun, nums[i]);
                cur = nums[i];
            }
            // sum of current is postive and next number is negative,
            // we still need to include next number in the subset,
            // since if the new sum (include next number) is positive it still may be larger
            // if next next number is positve and even as if it is negative, we could not simply 
            // abandon current subset and set the next number as new subset since in this case 
            // the sum would be even negative
            else if(nums[i]<=0 && cur>0){
                cur += nums[i];
            }
        }

        return maximun;
    }
};

