 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        int size=nums.size();
        if(size<2) 
            return vector(1,nums);
        vector<vector<int>> res;  
        for(int i=0;i<size;i++){
            int tmp=nums[i];
            vector<vector<int>> sub=XXX(nums,i);
            for(auto subb:sub){
                subb.push_back(tmp);
                res.push_back(subb);
            }
            sub.clear();
        }
        return res;
    }
    vector<vector<int>> XXX(vector<int> nums,int index){  
        nums.erase(nums.begin()+index);
        int size=nums.size();
        if(size<2)
            return vector(1,nums);
        vector<vector<int>> res;
        for(int i=0;i<size;i++){
            int tmp=nums[i];
            vector<vector<int>> sub=XXX(nums,i);
            for(auto subb:sub){
                subb.push_back(tmp);
                res.push_back(subb);
            }
            sub.clear();
        }
        return res;
    }
};

