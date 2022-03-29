 class Solution {
public:
    int XXX(vector<int>& nums, int val) {
        int count=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==val)
            {
                nums[i]=INT_MAX;
                count++;

            }
        }
        sort(nums.begin(),nums.end());
        return nums.size()-count;

    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


