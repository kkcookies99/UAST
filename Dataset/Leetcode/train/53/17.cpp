class Solution {
public:
    int XXX(vector<int>& nums) {
       int thissum=0;
       int maxsum=INT_MIN;
       for(int i=0;i<nums.size();i++){
           thissum+=nums[i];
           if(thissum>=maxsum){
               maxsum=thissum;
           }
           if(thissum<0){
             thissum=0;
           }
       }
       return maxsum;
    }
};

