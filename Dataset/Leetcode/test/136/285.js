 var singleNumber = function(nums) {
    let set=new Set()
    for(let i=0;i<nums.length;i++){
        if(!set.has(nums[i])){
            set.add(nums[i])
        }else{
            set.delete(nums[i])
        }
    }
    return set.keys().next().value
};

