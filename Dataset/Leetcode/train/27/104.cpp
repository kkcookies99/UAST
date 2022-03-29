 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        vector<int> num;
        for(int i=0;i<nums.size();i++){
            if(nums[i]!=val)
                num.push_back(nums[i]);
        }
        int n;
        n=num.size();
        if(n!=0){
            int a[n];
            for(int i=0;i<n;i++)
            {
                a[i]=num[i];
            }
            nums=num;
            return n;
        }else{
            nums.clear();
            return 0;
        }
        

    }
};

