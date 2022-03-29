var XXX = function(nums) {
    // 难度稍微高一点  复杂难度O(n)
    // 临界点就是nums.length-1 大于临界点就表示可以达到最后下标
    let max=nums[0];
    if(nums.length === 1){
        return true
    }
    for(let i=1;i<nums.length;i++){
        if(i<=max){
           max=Math.max(max,nums[i]+i)
            if(max>=nums.length-1){
                return true
            }
        }
    }
    return false
};

