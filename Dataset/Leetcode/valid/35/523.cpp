 class Solution {
public:
    int XXX(vector<int>& nums, int target) {
        int i=0,j=nums.size()-1,mid=i+(j-i)/2;
        while(i<=j){
            if(j==i){
                return nums[i]>=target?i:i+1;
            }
            if(nums[mid]==target)   return mid;
            else if(nums[mid]>target) j=mid;//不能j=mid-1,否则会出现i<j直接跳到i>j的情况（比如[2,2] 3 的case就过不了，因为mid=i+(j-i)/2使得mid靠左）,这样就不好处理了。
            else i=mid+1;
            mid=i+(j-i)/2;
        }return -1;//这条语句永远不会被执行，只是为了过编译。
    }
};

