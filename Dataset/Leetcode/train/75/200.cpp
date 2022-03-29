class Solution {
public:
    void XXX(vector<int>& nums) {
        quick_sort(nums,0,nums.size());
    }
    void quick_sort(vector<int>& nums,int l ,int r){
        if(l + 1 >= r){
            return;
        }
        int first = l, last = r - 1,key = nums[l];
        while(first < last){
            while(first < last && nums[last] >= key){
                --last;
            }
            nums[first] = nums[last];
            while(first < last && nums[first] <= key){
                ++first;
            }
            nums[last] = nums[first];
        }
        nums[first] = key;
        quick_sort(nums,l,first);
        quick_sort(nums,first+1,r);
    }
};

