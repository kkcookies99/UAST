 class Solution {
public:
    int singleNumber(vector<int>& nums) {
    int n=nums.size();
    set<int> a;
    for(int i=0;i<n;i++){
      if(!a.count(nums[i])){
          a.insert(nums[i]);
      }
      else{a.erase(nums[i]);}
    }
    return *a.begin();
    }
};

