 var XXX = function(nums) {
    //return [...new Set(nums)];
    var obj = {};
    return nums.filter((item,index)=>{
        return obj.hasOwnProperty(item) ? false : (obj[item]=true);
    });
};

