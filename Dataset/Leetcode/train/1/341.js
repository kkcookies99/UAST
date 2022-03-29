 var XXX = function(nums, target) {
    const len = nums.length
    var needNums = {}
    for(var i = 0; i<len;i++){
       const need = target-nums[i]
       if(needNums[nums[i]] ||needNums[nums[i]] ===0){
           if(needNums[nums[i]] !== i) {
                   return [needNums[nums[i]],i]
           }
       
       } 
       needNums[need]=i
    }
};
以needNums有没有于当前处理项匹配的key做判断条件
有两个边界条件要注意 
1.有匹配的key但value为0
2.被处理的数字是target的一半



