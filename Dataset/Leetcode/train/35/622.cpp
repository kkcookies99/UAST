 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
int high,low;
high = size(nums)-1;
low = 0;
    while(low<=high){
    int mid = (low+high)/2;
    if(nums[mid]==target){
        return mid; 
    }
    if(nums[mid]>target){
        high = mid-1;
    }
    if(nums[mid]<target){
        low = mid+1;
    }
}//while
return low;
}
};
code block

