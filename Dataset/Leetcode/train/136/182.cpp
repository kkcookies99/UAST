 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        if(nums.size()%2 == 0)return -1;
        //方法一 直接用哈希，时间O（n），空间O（n）
        // unordered_map<int, int> mymap;
        // for(auto n:nums)
        //     mymap[n]++;
        // for(auto n:nums)
        //     if(mymap[n]==1)return n;
        // return -1;
        //方法二排序后判断，时间O（nlogn），空间O（1）
        // sort(nums.begin(), nums.end());
        // for(int i=0;i<nums.size()-1;i+=2)
        //     if(nums[i]!=nums[i+1])return nums[i];
        // return nums[nums.size()-1];
        //不需要额外空间的方法，就往位运算上想，，时间O（n），空间O（1），最优
        int tmp=0;
        for(int n:nums)
        {
            tmp^=n;
        }
        return tmp;

    }
};

