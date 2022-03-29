class Solution {
public:
    void XXX(vector<int>& nums) {
        quickSort(nums,0,nums.size()-1);

    }
    void quickSort(vector<int>& nums,int start,int end){
        if(start>end)
            return;
        int stand=nums[start];
        int left=start;
        int right=end;
        while(left<right){
            while(nums[right]>=stand && left<right)
                right--;
            while(nums[left]<=stand && left<right)
                left++;
            if(left<right){
                swap(nums[left],nums[right]);  
            }
        } 
        nums[start]=nums[left];
        nums[left]=stand;
        quickSort(nums,start,left-1);
        quickSort(nums,left+1,end);
    }
};

