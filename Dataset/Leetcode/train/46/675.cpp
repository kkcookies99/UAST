 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector< vector<int> >v;
        vector<int> vec;
        int size = nums.size();
        if(size==0) return v;
        bfs(nums,v,vec);
        return v;
    }
    void bfs(vector<int> &nums,vector<vector<int> > &v,vector<int> &vec){
        if(vec.size()==nums.size()){
            v.push_back(vec);
            return;
        }
        for(int i = 0;i<nums.size();++i){
            if(vec.end()==find(vec.begin(),vec.end(),nums[i])){
                vec.push_back(nums[i]);
                bfs(nums,v,vec);
                vec.pop_back();
            }
        }
    }
};

