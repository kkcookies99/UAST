class Solution {
public:
    bool XXX(vector<int>& nums) {
    auto max=nums.end()-1;
    for(auto it=nums.end()-2;it>=nums.begin();it--){
    if(*it+it>=max) max=it;}     
    if(max==nums.begin())return true;
    else return false;
    }
};

