class Solution {
public:
    int XXX(vector<int>& nums) {
        return maxSum(0,nums.size()-1,nums);
    }
    int maxSum(int start,int end,vector<int>& nums){ //求nums[start,end]的最大子序列和
        if(start == end)
            return nums[start];
        int mid = (start+end)/2;
        int leftSum = maxSum(start,mid,nums);
        int rightSum = maxSum(mid+1,end,nums);
        //最大子列出现在中间
        // nums[ ,mid]+nums[mid+1, ]
        long left = -1000000000;
        int l = 0;
        for(int i = mid;i>=start;i--){
            l+=nums[i];
            if(l>left)
                left = l;
        }
        long right = -1000000000;
        int r = 0;
        for(int i = mid+1;i<=end;i++){
            r+=nums[i];
            if(r>right)
                right = r;
        }
        int midSum = right+left;
        return midSum>=leftSum&&midSum>rightSum?midSum: leftSum>rightSum?leftSum : rightSum;
    }
};

