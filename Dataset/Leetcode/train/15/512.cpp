 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        int n=nums.size();
        if(n<3) return ans;
        for(int i=0;i<n-2;++i){
//去重，&&运算符并上两个条件是很好用的，如果当前nums[i]的值与nume[i-1]相等，那么不用再来一遍了。
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = -nums[i];
            int l=i+1,r=n-1;
            while(l<r){
                if(nums[l]+nums[r]<target) l++;
                else if(nums[l]+nums[r]>target) r--;
                else{
                    auto t = vector<int>{nums[i],nums[l],nums[r]};
//在固定i值的情况下，扫描过程中判断如果新构成的数据与当前最后一个加入答案的三元组相同，则跳过不加入答案。记得同时更新指针，否则会死循环。
                    if(!ans.empty() && t==ans.back()) {l++;continue;}
                    ans.emplace_back(t);
                }
            }
        }
    return ans;
    }
};

