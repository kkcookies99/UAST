 class Solution {
public:
    int XXX(vector<int>& nums) {
        return doubleDevide(nums,0,nums.size()-1);
    }
    int doubleDevide(vector<int>nums,int left,int right){
        int mid = (left + right)>>1;
        if(left == right){
            return nums[left];
        }
        else if(right - left == 1){
            if(nums[left] + nums[right] >= nums[left] && nums[left] + nums[right] >= nums[right]){
                return nums[left] + nums[right];
            }
            else{
                return nums[left] > nums[right]?nums[left]:nums[right];
            }
        }
        else if(right - left == 2){
            int x,y,z;
            x = max(doubleDevide(nums,left,mid),doubleDevide(nums,mid ,right));
            z = nums[right] + nums[left] + nums[mid];
            return max(x,z);
        }
        int a1,a2,a3;
        a1 = doubleDevide(nums,left,mid);
        a2 = doubleDevide(nums,mid+1,right);
        a1 = max(a1,a2);
        a3 = nums[mid];
        int temp = a3;
        for(int i = mid + 1; i <= right;i++){
            temp += nums[i];
            if(temp > a3){
                a3 = temp;
            }
        }
        temp = a3;
        for(int i = mid - 1; i >= left;i--){
            temp += nums[i];
            if(temp > a3){
                a3 = temp;
            }
        }
        return max(a1,a3);
    }
};

