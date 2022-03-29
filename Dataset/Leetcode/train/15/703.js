 var XXX = function(nums) {
  if (nums.length < 3) return [];
    let result = [], start = 0, end = nums.length - 1;
    nums = nums.sort();
    while (start < end - 1) {
        for (let i = start+1; i < nums.length; i++) {
            const finalVal = 0 - nums[start] - nums[i];
            let finalIndex;
            for (let j = i+1; j < nums.length; j++) {
                if (finalVal === nums[j]) {
                    finalIndex = j
                }
            }  
            if (finalIndex > i) {
                const resultItem = [nums[start], nums[i], nums[finalIndex]];
                let findIndex  = result.findIndex( item => item.sort().join() === resultItem.join())
                findIndex <0 && result.push(resultItem);
                if (nums[i] === nums[i+1]) i++;
            }
            
        }
        if (nums[start] === nums[start+1]) {
            start += 2;
        } else {
            start ++;
        }
    }
    return result;
};

