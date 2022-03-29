 var XXX = function(nums, target) {
    let res;
    nums.forEach((item,i)=>{
        const j = target-item;
        if(nums.indexOf(j)!=-1 && nums.indexOf(j)!=i) return res = [i,nums.indexOf(j)];
    })
    return res
};


