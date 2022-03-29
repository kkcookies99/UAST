class Solution {
public:
        int subMaxSubArray(vector<int>&nums,int low,int high){
        //递归的出口
        if(low==high) return nums[low];
        int mid=(low+high)/2;
        int leftvalue=subMaxSubArray(nums,low,mid);
        int rightvalue=subMaxSubArray(nums,mid+1,high);
        int midleft=nums[mid],sumleft=nums[mid];
        
        for(int i=mid-1;i>=low;i--){
            sumleft+=nums[i];
            if(midleft<sumleft)
                midleft=sumleft;
        }
        int midright=nums[mid+1],sumright=nums[mid+1];
        for(int j=mid+2;j<=high;j++){
            sumright+=nums[j];
            if(midright<sumright)
                midright=sumright;
        }
        int midvalue=midleft+midright;
        if(midvalue>=leftvalue&&midvalue>=rightvalue)
        {
            return midvalue;
        }else if(leftvalue>=midvalue&&leftvalue>=rightvalue){
            return leftvalue;
        }else{
            return rightvalue;
        }
    }
    
    int XXX(vector<int>& nums) {
        return subMaxSubArray(nums,0,nums.size()-1);
    }
};

