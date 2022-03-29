class Solution {
public:
    void XXX(vector<int>& nums){
        int n = nums.size();
        int red = -1;
        int blue = n-1;
        int i = 0;
        while(i<=blue){
            if(nums[i]==0)
                swap(nums,i++,++red);
            else if(nums[i]==2)
                swap(nums,i,blue--);
            else
                i++;
        }
    }   

    void swap(vector<int>& nums,int x,int y){
        int tmp = nums[x];
        nums[x] = nums[y];
        nums[y] = tmp;
    }
};

