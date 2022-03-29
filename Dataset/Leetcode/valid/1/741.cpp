 class Solution {
public:
    vector<int> XXX(vector<int>& nums, int target) {
        map<int,int>a,b;
        vector<int>ans(2);
        map<int,int>::iterator ite;
        int t;
        int nsize=nums.size();
        for(int i=0;i<nsize;i++)
            a[nums[i]]=i;
        for(int i=0;i<nsize;i++)
        { t=target-nums[i];
        ite=a.find(t);
        if(ite!=a.end()&&(*ite).second!=i)
        {
            ans[1]=i;
            ans[0]=(*ite).second;
         return ans;
        }
        
            } 
      return ans;
    }
};

