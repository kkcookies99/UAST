 var XXX = function(nums, val) {
    let times = 0;
    let length = nums.length - 1;
    for(let i = 0;i<nums.length;i++){
        if (i === length){
            if (nums[i] === val){
                times++ 
            }
            return nums.length - times 
        }
        if(nums[i] == val){
            while(nums[i] == nums[length]){
                length--
                times++
                if(length === i){
                    times ++
                    return nums.length - times 
                } 
            }
            let currentVal = nums[length]
            nums[length]  = nums[i]
            nums[i] = currentVal
            times++
            length--
            if(length === i){
                return nums.length - times 
            }
        }
    }
};  