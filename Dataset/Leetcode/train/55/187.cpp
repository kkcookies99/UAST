class Solution {
public:
    bool XXX(vector<int>& nums) {
        int pos=0,len=nums[0],farrest=0;;
        vector<int> temp(2);
        while(pos+len<nums.size()-1){
            if(len==0)return false;
            for(int i=pos+1;i<=pos+len&&i<nums.size();i++){
                if(i+nums[i]>=farrest){
                    farrest=i+nums[i];
                    temp[0]=i;
                    temp[1]=nums[i];
                }
            }
            pos=temp[0],len=temp[1];
        }
        return true;
    }
};

