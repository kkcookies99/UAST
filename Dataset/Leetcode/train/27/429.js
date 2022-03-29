 var XXX = function(nums, val) {
        //JavaScript
        //filter 创建了一个新数组，好像是因为这个原因导致的bug
	nums = nums.filter((num)=>{
        if(num === val) return false;
        else return true;
    });
    return nums.length;
};

