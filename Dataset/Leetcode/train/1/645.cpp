 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        vector<int> v(nums);
    vector<int> twoIdx;
    if(nums.empty())
        return nums;
    std::sort(nums.begin(), nums.end());
    int r=nums.size()-1;
    int l=0;
    while (r!=l) {
        if(nums[l]+nums[r]>target)
            r--;
        else if (nums[l]+nums[r]<target)
            l++;
        else
            break;
    }
    vector<int>::iterator it1=std::find(v.begin(),v.end(),nums[l]);
    vector<int>::iterator it2;
    if(nums[l]==nums[r])
       it2=std::find(it1+1,v.end(),nums[r]);
    else  it2=std::find(v.begin(),v.end(),nums[r]);
    auto idx1=std::distance(v.begin(),it1);
    auto idx2=std::distance(v.begin(), it2);
    
    if(idx1<=idx2){
        twoIdx.push_back(idx1);
        twoIdx.push_back(idx2);}
    else{
        twoIdx.push_back(idx2);
        twoIdx.push_back(idx1);}
    return twoIdx;
    }
};

