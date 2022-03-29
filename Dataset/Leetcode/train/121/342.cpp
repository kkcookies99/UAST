 class Solution {
public:
    int XXX(vector<int>& prices) {
        if(prices.size()<=1)return 0;
        vector<int> t;
        for(int i=0,j=1;j<prices.size();i++,j++){
            t.push_back(prices[j]-prices[i]);
        }
        int res=FindMaxSubarray(0,t.size()-1,t);
        return res<=0?0:res;
    }

    int FindMaxCrossSubarray(int left,int right,int mid,vector<int>& nums){
        int sum=0;
        int leftsum=-1000000;
        for(int i=mid;i>=left;i--){
            sum=sum+nums[i];
            if(sum>leftsum){
                leftsum=sum;
            }
        }
        sum=0;
        int rightsum=-1000000;
        for(int i=mid+1;i<=right;i++){
            sum=sum+nums[i];
            if(sum>rightsum){
                rightsum=sum;
            }
        }
        return leftsum+rightsum;
    }

    int FindMaxSubarray(int left,int right,vector<int>& nums){
        if(left==right)return nums[left];
        int mid=(left+right)/2;
        int leftmax=FindMaxSubarray(left,mid,nums);
        int rightmax=FindMaxSubarray(mid+1,right,nums);
        int crossmax=FindMaxCrossSubarray(left,right,mid,nums);
        if(leftmax>=rightmax&&leftmax>=crossmax)return leftmax;
        if(rightmax>=leftmax&&rightmax>=crossmax)return rightmax;
        return crossmax;
    }
};

