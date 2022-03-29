 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.size()<3) return res;
        auto begin = nums.begin(), end = nums.end();
        sort(begin, end);
        for(auto i = begin; i != end - 2; i++){
            if(i > begin && *i == *(i-1)) continue;
            if(*i > 0) break;
            auto l = i+1, r = end-1;
            while(r > l && r < end){
                if(*i + *l > 0) break;
                if(*l+*r+*i < 0) ++l;
                else if(*l+*r+*i > 0) --r;
                else{
                    res.push_back({*i, *l, *r});
                    ++l, --r;
                    while (l < r && *l == *(l - 1)) ++l;
                    while (l < r && *r == *(r + 1)) --r;
                }
            } 
        }
        return res;
    }
};

