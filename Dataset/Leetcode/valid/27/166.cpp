 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int i=0,j=0,n=nums.size();
        //[0,i]是不包含val的，如果j指向的数字是val的话，那就让nums[i]=nums[j],j和i都移动，否则就只有j移动
        //就相当于不断找不是val 的元素按顺序赋值给nums[i]，nums[i]指向目前第一个val的值
        while(j<n)
        {
            if(nums[j]!=val)
            {
                nums[i]=nums[j];
                i++;  
            }            
           
                j++;
            
        }
        return i;
    }
};

