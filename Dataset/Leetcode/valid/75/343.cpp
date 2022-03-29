class Solution {
public:
    void XXX(vector<int>& nums) {
        //只有 0 ，1,2  三种颜色
        int num0=0,num1=0,num2=0;
        for(int &x: nums) {
            if(x==0) num0++;
            else if(x==1) num1++;
            else num2++;
        }
        int k=0;
        while(num0--) nums[k++] = 0;
        while(num1--) nums[k++] = 1;
        while(num2--) nums[k++] = 2; 

    }
};

