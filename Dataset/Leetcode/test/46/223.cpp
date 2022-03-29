class Solution {
public:   
    vector<vector<int>> XXX(vector<int>&nums) {
       int n=nums.size(),N=pow(n,n);
       vector<vector<int>>ans;
       for(int i=0;i<N;i++){
            vector<int>ids(n);
            for(int j=n-1,x=i;j>=0;j--){
               ids[j]=x%n;
               x/=n;
            }
            vector<int>a;
            for(auto&id:ids)a.push_back(nums[id]);
            vector<int>b=a;
            sort(b.begin(),b.end());
            if(unique(b.begin(),b.end())-b.begin()==n)
                ans.push_back(a);
       }
       return ans; 
    }
};

