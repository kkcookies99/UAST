class Solution {
public:
    bool XXX(vector<int>& nums) {
        int mlen = nums[0];
        for(int i=0;i<min(mlen+1,(int)nums.size());++i){
            mlen = max(mlen,i+nums[i]);
        }
        return mlen>=nums.size()-1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


