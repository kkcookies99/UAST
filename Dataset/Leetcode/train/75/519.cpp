 class Solution {
public:
    void XXX(vector<int>& nums) {
        int left = 0, right = nums.size()-1;
        for(int i = 0; i <= right; i++){
            if(nums[i] == 0){
                swap(nums[i], nums[left]);
                left++;
            }
            else if(nums[i] == 2){
                swap(nums[i], nums[right]);
                right--;
                i--;//这里要提前--以中和之后的i++操作，因为置换过来的元素尚未扫描，有可能是0，需要再次判断
            }
        }
    }
};

