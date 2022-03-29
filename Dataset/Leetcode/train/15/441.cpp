 class Solution {
public:
    vector<vector<int>> XXX(vector<int>& nums) {
        vector<vector<int>>res;
        //双指针算法一定要有序
        sort(nums.begin(),nums.end());
        for(int i=0;i<nums.size();i++){
            //去除重复元素
            if(i&&nums[i]==nums[i-1]) continue;
            for(int j=i+1,k=nums.size()-1;j<k;j++){
                if(j>i+1&&nums[j]==nums[j-1])   continue;
        //  根据单调性，如果j往右走，那么要满足nums[i]+nums[j]+nums[k]>=0
        //     k一定会往左边走
        //     检查我的k下一个要去的点是否满足nums[i] + nums[j] + nums[k - 1]>=目标值，如果满足，说明此时的k还可以更小。如果不满足了，此时的k跳出while循环，这时候的k就一定是使得nums[i] + nums[j] + nums[k - 1] >=目标值情况下，能取到的最左边的k。
                while(j<k-1&&nums[i]+nums[j]+nums[k-1]>=0)  k--;
                if(nums[i]+nums[j]+nums[k]==0){
                    res.push_back({nums[i],nums[j],nums[k]});
                }
            }
        }
        return res;
    }
};

