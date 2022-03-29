var XXX = function(nums) {
    var len=nums.length;
    for(var i=0;i<len;i++){
        if(nums[i]===2){
            nums.push(2);
            nums.splice(i,1);
            i-=1;
            len-=1;
        }else{
            if(nums[i]===0){
                nums.splice(i,1);
                nums.unshift(0);
            }
        }
    }
};

