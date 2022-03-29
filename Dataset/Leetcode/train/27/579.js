 var XXX = function(nums, val) {
    let res = 0;
    let len = nums.length;
    for(let i=0; i<len; i++){
        if(nums[i] !== val){
            nums[res++] = nums[i];
        }
    }
    return res;
};

