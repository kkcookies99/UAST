 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        if (nums.empty())  
            return 0;
        int left = 0;//left指向最左的等于val元素
        int right = nums.size()-1;//right指向最右的不等于val的元素位置
        while (left < right) {
            while (nums[left] != val && left < right) 
                left ++;
            while (nums[right] == val && left < right) 
                right --;
            if (right > left)
                swap (nums[left],nums[right]); 
        }
        if (nums[left] == val)
            return left ;
        else 
            return left + 1;
    }
};

