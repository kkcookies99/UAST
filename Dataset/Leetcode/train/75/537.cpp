 class Solution {
public:
    void XXX(vector<int>& nums) {
    map<int,int> num;
    for(int i=0;i<nums.size();++i)
    {
        num[nums[i]]++;
    }
    int k=0;
    for(auto i=num.begin();i!= num.end();++i)
    {
        for(int j=0;j<i->second;++j)
        {
            nums[k]=i->first;
            k++;
        }
    }
    }
};

