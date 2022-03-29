class Solution {
public:
    void XXX(vector<int>& nums) {
        int front = 0, back = nums.size() - 1;
        for(int i = 0; i < nums.size();) {
            if(i > back){
                break;
            }
            if(nums[i] == 0){
                swap(nums[front], nums[i]);
                front++;
                i++;
            }else if(nums[i] == 2){
                swap(nums[back], nums[i]);
                back--;
            }else{
                i++;
            }
        }
    }
};

