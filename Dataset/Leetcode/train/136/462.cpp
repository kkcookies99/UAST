 class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int temp;
        //先冒泡排序
        for(int i=0;i<nums.size()-1;i++){
            for(int j=0;j<nums.size()-1-i;j++){
                if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        //前后比较
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        else if(nums[nums.size()-2]!=nums[nums.size()-1]){
            return nums[nums.size()-1];
        }
        else{
            for(int a=1;a<=nums.size()-2;a++){
                if(nums[a]!=nums[a-1]&&nums[a]!=nums[a+1]){
                    return nums[a];
                }
            }
        }
        return 0;
        //有时候要在函数末尾加一个return 0才能运行成功不知道为何
    }
};

