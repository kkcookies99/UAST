 var XXX = function(nums) {
    let result = []
    nums.sort((a, b) => a-b)
    for(let i = 0;i < nums.length-2; i++) {
        if(i===0 || nums[i] !== nums[i-1]) {
            target = - nums[i]
            left = i + 1, right = nums.length - 1
            while(left < right) {
                total = nums[left] + nums[right]
                if(total < target) {
                    left++
                }
                else if(total === target) {
                    if(left === i+1 || nums[left]!==nums[left-1]) {
                        result.push([nums[i], nums[left], nums[right]])
                    }
                    left++,right--
                } else {
                   right-- 
                }
            }
        }
    }
    return result
};

