class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        queue<vector<int>>qu;
        int begin=0,twobegin=0;;
        for(int i=begin;i<nums.size();i++){
            swap(nums[i],nums[begin]);
            qu.emplace(nums);
            twobegin=0;
            while(!qu.empty()){
                int sz=qu.size();
                twobegin++;
                while(sz--){
                    vector<int> temp = qu.front();
                    if(twobegin==nums.size()) res.emplace_back(temp);
                    qu.pop();
                    for(int i = twobegin;i<nums.size();i++){
                        swap(temp[i],temp[twobegin]);
                        qu.emplace(temp);
                        swap(temp[i],temp[twobegin]);
                    }
                }
            }
            swap(nums[i],nums[begin]);
        }
        return res;
    }
};

