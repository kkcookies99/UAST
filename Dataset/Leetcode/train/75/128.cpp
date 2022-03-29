class Solution {
public:
    void XXX(vector<int>& nums) {
       int end = nums.size()-1;
        for(int i = 0;i <= end;i++){
            while(nums[i] == 2){
                if(i==end){
                    end--;
                    break;
                }
                swap(nums[i],nums[end]);
                end--;
            }
 
        }
        for(int j = 0;j <= end;j++){
            while(nums[j] == 1){
                if(j==end){
                    end--;
                    break;
                }
                swap(nums[j],nums[end]);
                end--;

            }
        }
    }
};

