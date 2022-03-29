 class Solution {
public:
    void XXX(vector<int>& nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;
        while(mid <= high){
            if(nums[mid] == 0){
                int t = nums[low];
                nums[low] = nums[mid];
                nums[mid] = t;
                mid++;low++;
            }else if(nums[mid] == 1){
                mid++;
            }else{
                while(mid < high && nums[high] == 2)
                    high--;
                int t = nums[high];
                nums[high] = nums[mid];
                nums[mid] = t;
                high--;
            }
        }
    }
};

