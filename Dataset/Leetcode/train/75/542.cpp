 class Solution {
public:
    void XXX(vector<int>& nums) {
        
        int left = 0;
        int right = nums.size()-1;
        // head表示最左边的下标，出现0才会右移
        int head = 0;
        while(left<=right)
        {
            // 左边是2，将其调整到右边第一个非2
            if(nums[left] == 2)
            {
                while(right>left && nums[right] == 2)
                    --right;
                swap(nums[left],nums[right]);
                --right;
            } 
            // 如果调整过来的是0
            else if(nums[left] == 0)
            {
                // left == head表明left之前没有1
                // left != head表明left之前有1
                // 先交换，然后left和head一起+1
                if(left!=head)
                    swap(nums[head],nums[left]);
                ++head;
                ++left;
            }
            // 如果调整过来的是1,则head不动，left+1
            else
                ++left;
        }
    }
};

