var XXX = function(nums) {
    var sum=nums[0];
    var max=nums[0]
    for(var i=1;i<nums.length;i++){
        if(sum<0&&nums[i]>sum)
            sum = 0;
        sum += nums[i];
        max = Math.max(sum,max);
    }
    
    return max;
};

