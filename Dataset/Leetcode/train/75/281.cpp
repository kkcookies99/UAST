class Solution {
public:
    void swap(vector<int> &nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    void patation(vector<int>& nums, int l, int r, int aim){
        int less = l-1;
        int more = r+1;
        while(l<more){
            if(nums[l] < aim){
                swap(nums, ++less, l++);
            }else if(nums[l] > aim){
                swap(nums, --more, l);
            }else{
                l++;
            }
        }
    }

    void XXX(vector<int>& nums) {
        patation(nums, 0, nums.size()-1, 1);
    }
};

