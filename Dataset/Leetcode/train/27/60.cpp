 class Solution {
public:
    int XXX(vector<int>& nums, int val) 
    {
      sort(nums.begin(), nums.end());
      vector<int>::iterator iter;
      iter=std::find(nums.begin(),nums.end(),val);
      while(iter!= nums.end()&&*iter==val)
      {
       nums.erase(iter);
      }
      return nums.size();
    }
};

