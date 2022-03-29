 var XXX = function(nums) {
    for(let i=0;i<nums.length;i++){
        if(nums[i] === nums[i+1]){
            nums.splice(i,1)
            i--
        }
    }
}

