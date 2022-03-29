 var XXX = function(nums, target) {
    if(nums.length<2) return []
    let arr=[]
    for(let i=0;i<nums.length;i++){
        let index1=nums.indexOf(target-nums[i])
        if(index1>-1&&i!==index1){
            arr.push(i,index1)
            return arr
        }
    }
    return arr
};

