 class Solution {
public:
    void XXX(vector<int>& nums) {
        int num0=0,num2=nums.size()-1;  //0和2要放置的位置
        int i=0;
        while(i<=num2){
            if(nums[i]==0){
                if(num0==i){
                    num0++;
                }else{
                    swap(nums[num0],nums[i]);
                    num0++;
                    i--;
                }              
            }else if(nums[i]==2){
                if(num2==i){
                    num2--;
                }else{
                    swap(nums[num2],nums[i]);
                    num2--;
                    i--;
                }
            }            
            i++;
        }
    }
};

