class Solution {
public:
    void XXX(vector<int>& nums) {
        int red=-1,blue=nums.size();
        int p1 = 0;
        while(p1!=blue)
        {
            if(nums[p1]==0)
            {
                red++;
                swap(nums,red,p1);
                p1++;
            }else if(nums[p1]==2)
            {
                blue--;
                swap(nums,blue,p1);
            }else{
                p1++;
            } 
        }
    }
    void swap(vector<int>& nums,int a,int b)
    {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
};

