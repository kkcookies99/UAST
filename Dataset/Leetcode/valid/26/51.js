 var XXX = function(nums) {
    let i=0
    while(i<nums.length){
        //若第i个等于第i+1个，则删除第i个
        nums[i]===nums[i+1]?nums.splice(i,1):i++
    }
    return nums.length
};

