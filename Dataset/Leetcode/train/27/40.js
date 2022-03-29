 var XXX = function(nums, val) {
    nums.forEach((value,index,nums)=>{
        if(value === val){
            nums.splice(index,1);
        }  
    })
    return nums;
};


