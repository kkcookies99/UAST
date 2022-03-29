 var XXX = function(nums) {
    for(let i=0;i<nums.length;i++){
        if(nums.indexOf(nums[i],i+1)!==-1){
            nums.splice(i,1)
            i--
        }
    }
    return nums.length
};

