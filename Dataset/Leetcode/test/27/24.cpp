 class Solution {
public:
  
    int XXX(vector<int>& nums, int val) {
        //双指针
          int size=nums.size(); 
          int slow=0,fast=0; 
         for(;fast<size;fast++){
             if(nums[fast]!=val){
                 nums[slow++]=nums[fast];
             }
         }
         return slow;    
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

