class Solution {
public:
    void XXX(vector<int>& nums) {
        int rightcount = 0;
        for(int i = 0; i < nums.size() - rightcount; i++)
        {
            if(nums[i] == 0) //如果遇到0，则把0放到nums[0]的位置，i前面的元素往后移一位
            {
                int temp = nums[i];
                int j = i;
                while(j > 0)
                {
                    nums[j] = nums[j - 1];
                    j--;
                }
                nums[0] = temp;
            }
            if(nums[i] == 2) //如果遇到2，则把2放到最后一位，i后面的元素往前移一位
            {
                rightcount++;
                int temp = nums[i];
                int j = i;
                while(j < nums.size() - 1)
                {
                    nums[j] = nums[j + 1];
                    j++;
                }
                i--; //注意，如果元素往前移动了一位，则需要将i--，否则下一个元素会被跳过
                nums[nums.size() - 1] = temp;
            }
        }
    }
};

