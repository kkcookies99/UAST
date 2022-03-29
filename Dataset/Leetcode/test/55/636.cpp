 class Solution {
public:
    bool XXX(vector<int>& nums) {
        int m=0;
        for(int i=0;i<nums.size();++i)
        {
            if(i>m)return false;
            m=max(m,nums[i]+i);
            if(m>=nums.size())return true;
        }
        return true;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


