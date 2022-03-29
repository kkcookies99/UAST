class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        vector<int>f(n);
        int res=INT_MIN;
        for(int i=0;i<n;i++){
            f[i]=nums[i];//如果只有一个元素的话
            if(i>0) f[i]=max(f[i-1]+nums[i],f[i]);//如果超过一个元素
            res=max(res,f[i]);
        }
        return res;
    }
};
//空间优化
class Solution {
public:
    int XXX(vector<int>& nums) {
        int n=nums.size();
        vector<int>f(n);
        int res=INT_MIN;
        int last=0;
        for(int i=0;i<n;i++){
            last=max(last+nums[i],nums[i]);
            res=max(res,last);
        }
        return res;
    }
};

