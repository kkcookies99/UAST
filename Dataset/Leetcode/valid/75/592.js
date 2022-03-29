 var XXX = function(nums) {
    for(let i=0;i<nums.length;i++){
        for(let j=i+1;j<nums.length;j++){
            if(nums[i]>nums[j]){
                let num
                num = nums[i]
                nums[i] = nums[j]
                nums[j] = num
            }
        }
    }
    return nums
};

