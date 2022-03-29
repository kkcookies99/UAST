 var XXX = function(nums) {
    let num=nums[0]
    let sum=0
    for(let i=0;i<nums.length;i++){
        sum+=nums[i]
        num=Math.max(sum,num)
        if(sum<0){
            sum=0
        }
    }
    return num
};

