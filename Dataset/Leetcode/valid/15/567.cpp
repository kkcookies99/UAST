 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        //从小到大排序
        sort(nums.begin(),nums.end());
        int len=nums.size();
        vector<vector<int>>ans;
        if(len<3)return ans;
        int l=0,r=len-1;
        int mid;
        //找正负数交替点
        while(l<=r){
            mid=l+(r-l)/2;
            if(mid==0||(nums[mid]>0&&nums[mid-1]<=0))break;
            else if(nums[mid]<=0)l=mid+1;
            else r=mid-1;
        }
        //哈希表分别存出现的正负数
        unordered_set<int>ha;
        unordered_set<int>hb;
        if(mid==len-1&&nums[len-1]<=0){
            mid++;
        }
        //三个零的情况
        int count0=0;
        for(int t=0;t<mid;t++)ha.insert(nums[t]);
        for(int t=mid-1;t>=0;t--){
            if(nums[t]==0)count0++;
            else break;
        }
        if(count0>=3)ans.push_back({0,0,0});
        for(int t=mid;t<len;t++)hb.insert(nums[t]);
        //从负数区域取两个数相加
        for(int t1=0;t1<mid;t1++){
            if(t1>0&&nums[t1]==nums[t1-1])continue;
            for(int t2=t1+1;t2<mid;t2++){
                if(t2>t1+1&&nums[t2]==nums[t2-1])continue;
                if(hb.count((nums[t1]+nums[t2])*(-1))){
                    ans.push_back({nums[t1],nums[t2],(nums[t1]+nums[t2])*(-1)});
                }
            }
        }
        //从正数区域取两个数相加
        for(int t1=mid;t1<len;t1++){
            if(t1>0&&nums[t1]==nums[t1-1])continue;
            for(int t2=t1+1;t2<len;t2++){
                if(t2>t1+1&&nums[t2]==nums[t2-1])continue;
                if(ha.count((nums[t1]+nums[t2])*(-1))){
                    ans.push_back({nums[t1],nums[t2],(nums[t1]+nums[t2])*(-1)});
                }
            }
        }
        return ans;
    }
};

