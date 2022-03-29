class Solution {
public:
    void XXX(vector<int>& nums) {
        // 简单排序就可以，但是题目要求常数空间，一趟扫描
        // 双指针，分别记录0和2的位置
        int left = 0, right = nums.size()-1, i = 0;
        while (i <= right){
            if (i < left) i++;
            else if (nums[i] == 0) {
                nums[i] = nums[left];
                nums[left] = 0;
                left++;
            }else if (nums[i] == 2){
                nums[i] = nums[right];
                nums[right] = 2;
                right--;
            } else i++;
        }
        return ;
    }
};

