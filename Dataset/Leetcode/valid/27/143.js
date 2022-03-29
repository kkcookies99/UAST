 var XXX = function(nums, val) {
    var lang = nums.length;
    for(var i=0;i<lang;i++){
        if(nums[i]==val){ 
            nums.splice(i,1);
            i--;
        }
    }
    return nums.length;
};

