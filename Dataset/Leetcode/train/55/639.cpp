 class Solution {
public:
   bool XXX(vector<int>& nums) {
       vector<bool> flag_arrived(nums.size(),false);
       flag_arrived[nums.size()-1] = true;
       bool enter_flag = true;
       while(enter_flag == true){
           enter_flag = false;
           for(int i=0;i<nums.size();i++){
               if(flag_arrived[i] == false){
                   for(int j=0;j<flag_arrived.size();j++){
                       if(flag_arrived[j] == true){
                           if(abs(j-i)<=nums[i]){
                               enter_flag = true;
                               flag_arrived[i] = true;
                               break;
                           }
                       }
                   } 
               }
           }
       }
       return flag_arrived[0]==true;
   }
};

