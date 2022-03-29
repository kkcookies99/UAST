class Solution {
public:
    bool XXX(vector<int>& nums) {
        int dst = nums.size() - 1;
        vector<bool> table(dst, false);
        int i = table.size() - 1;
        while(i >= 0){
            if(nums[i] == 0){
                func(nums, table, i);
            }else{
                table[i] = true; --i;
            }
        }
        for(auto w : table){
            if(!w) return false;
        }
        return true;
    }
    
    void func(vector<int> nums, vector<bool> &table, int &idx){
        int i = idx - 1; bool flag = false;
        for(; i >= 0; --i){
            if(nums[i] > idx - i){
                flag = true;
                break;
            }
        }
        if(flag == true){
            for(int j = i; j <= idx; ++j){
                table[j] = true;
            }
            idx = i - 1;
        }else{
            idx = i;
        }
        return ;
    }
    
};