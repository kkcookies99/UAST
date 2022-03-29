class Solution {
public:
    void XXX(vector<int>& nums) {
        int i,num0=0,num1=0,num2=0;
        for(i=0;i<nums.size();i++){
            switch(nums[i]){
                case 0:{
                    if((num1!=0&&num2==0)||(num2!=0&&num1==0)){
                        swap(nums[num0],nums[i]);
                    }
                    else if(num1!=0&&num2!=0){
                        swap(nums[num0],nums[num0+num1]);
                        swap(nums[num0],nums[i]);
                    }
                    num0++;
                    break;
                }
                case 1:{
                    if(num2!=0) swap(nums[num0+num1],nums[i]);
                    num1++;
                    break;
                }
                case 2:{
                    num2++;
                    break;
                }
            }
        }
        //return nums;
    }
};

