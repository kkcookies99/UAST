var XXX = function(nums) {
    if(nums.length == 1) return nums
    for(let i=0;i<nums.length;i++){
        if(nums[i] == 1){
            nums.splice(i,1)
            nums.unshift(1)
        }
    }
    for(let i=0;i<nums.length;i++){
        if(nums[i] == 0){
            nums.splice(i,1)
            nums.unshift(0)
        }
    }
    return nums
    // return nums.sort()
};

