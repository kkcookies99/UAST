 class Solution {
public:
vector<int> XXX(vector<int>& nums, int target)
{
    vector<pair<int,int>>vec_pair;
    for(int i=0;i<nums.size();i++)
    {
        vec_pair.push_back({nums[i],i});
    }
    sort(vec_pair.begin(),vec_pair.end());
    vector<int>ans;
    for(int i=0,j=vec_pair.size()-1;i<j;)
    {
        int sum=vec_pair[i].first+vec_pair[j].first;
        if(sum>target)j--;
        if(sum<target)i++;
        if(sum==target)return vector<int>{vec_pair[i].second,vec_pair[j].second};
    }
    return vector<int>();
}
};

