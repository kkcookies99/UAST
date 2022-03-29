 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i = nums.size()-1;

        //从后向前遍历数组
        while(i>=0){
            //当找到nums[i]值为val
            if(nums[i] == val){
                //判断nums[i]是否在数组最尾，若是则直接删除队尾
                if(i == nums.size()-1){
                    nums.pop_back();
                }
                //若nums[i]不在数组尾，则交换nums[i]与数组最尾的元素值，然后删除队尾
                else{
                    swap(nums[i],nums[nums.size()-1]);
                    nums.pop_back();
                }
            }
            i--;
        }

        return nums.size();
    }
private:
    void swap(int& a, int& b){
        int temp = a;
        a = b;
        b = temp;
    }
};

