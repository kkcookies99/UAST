 var XXX = function(nums, target) {
    var index = [];
    for(i=0;i<nums.length;i++){
        for(j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                index[0] = nums[i];
                index[1] = nums[j];
                return index;
            }
        }
    }
};
XXX([2,7,11,15],9)

