 var singleNumber = function(nums) {
    nums.sort((a,b)=>a-b);
    for(var i=0;i<nums.length;i++){
        if(nums[i]!=nums[i-1]&& nums[i]!=nums[i+1]){
            return nums[i];
        }
    }
};

