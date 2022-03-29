 class Solution {
public:
    int unique(vector<int>& a){
        int k=1;
        for(int i=1;i<a.size();i++){
            if(a[i]!=a[i-1])  a[k++]=a[i];
        }
        return k;
    }
    vector<vector<int>> XXX(vector<int>& nums) {
        if(nums.size()<3) return {};
        vector<vector<int>> ans;
        unordered_map<int,int> h;
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++) h[nums[i]]++;//用hash表计数
        int k=unique(nums);//去重
        if(h[0]>2) ans.push_back({0,0,0}); //a=b=c情况
        for(int i=0;i<k;i++){//a=b≠c情况
            if(h[nums[i]]>1){
                int tmp=-2*nums[i];
                if(tmp>nums[i]&&h[tmp]>0) ans.push_back({nums[i],nums[i],tmp});
            }
        }
        for(int i=0;i<k;i++){ //a≠b=c情况
            if(nums[i]%2==0){
                int tmp=-(nums[i])/2;
                if(h[tmp]>1&&tmp>nums[i]) ans.push_back({nums[i],tmp,tmp});
            }
        }
        for(int i=0;i<k-2;i++){ //a≠b≠c情况
            if(nums[i]>=0) break;
            int left=i+1,right=k-1;
            while(left<right){
                if(nums[left]+nums[right]==-nums[i]){
                    ans.push_back({nums[i],nums[left],nums[right]});
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]<-nums[i]) left++;
                else right--;
            }
        }
        return ans;
    }
};
code block

