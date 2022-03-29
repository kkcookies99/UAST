 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int res = nums.size();
        for(vector<int>::iterator it = nums.begin() ; it < nums.end() ; ){
            if(*it == val){
                nums.erase(it);
                res--;
            }else{
                it++;
            }
        }
        return res;
    }
};

