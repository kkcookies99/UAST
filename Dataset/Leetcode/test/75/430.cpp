 class Solution {
public:
    void XXX(vector<int>& nums) {
        int left = -1,end = nums.size(),i = 0;
        while(i < end)
        {
            if(nums[i] == 0){
                swap(nums[++left],nums[i++]);
            }else if(nums[i] == 2){
                swap(nums[--end],nums[i]);
            }else
                i ++;
        }
    }
private:
    void swap(int& a,int& b){
        if(a == b) return;
        a ^= b;
        b ^= a;
        a ^= b;
    }
};

