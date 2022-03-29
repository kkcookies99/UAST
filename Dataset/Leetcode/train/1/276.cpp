 class Solution {
public:
    static bool cmp(pair<int,int> &a,pair<int,int> &b){
        return a.first<b.first;
    }
    vector<int> XXX(vector<int>& nums, int target) {
        vector<pair<int,int>> res;
        for(int i=0;i<nums.size();i++){
            res.push_back({nums[i],i});
        }
        vector<int> ans;
        sort(res.begin(),res.end(),cmp);
        int i=0,j=nums.size()-1;
        while(i<j){
            if(res[i].first+res[j].first==target){
                ans.push_back(res[i].second);
                ans.push_back(res[j].second);
                return ans;
            }
            if(res[i].first+res[j].first>target){
                j--;
            }
            else{
                i++;
            }
        }
        return ans;
    }
};

