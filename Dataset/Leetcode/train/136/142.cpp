 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        unordered_set<int> hashset;
        for(int i=0;i<nums.size();++i)
        {
            if(hashset.count(nums[i])>0)
            {
                hashset.erase(nums[i]);
            }
            else
                hashset.insert(nums[i]);   
        }
        //for(auto it = hashset.begin();it!=hashset.end();++it)
          //  cout<<*it<<"  ";
        //cout<<endl;
        return *(hashset.begin());
    }
};

