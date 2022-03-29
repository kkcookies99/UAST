 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int len = nums.size();
        for(vector<int>::iterator i=nums.begin();i!=nums.end();i++){
            if(*i==val){
                i = nums.erase(i);
                i--;
            }
            
        }
        
        return nums.size();
        
    }
};

