 var XXX = function(nums) {
    let i=0,index=0
    while(i<nums.length){
        //如果第i个数不等于第i+1个数，则把这个数放到index位，同时index+1
        if(nums[i]!==nums[i+1]){
            nums[index]=nums[i]
            index++
        }
        i++
    }
    return index
};

