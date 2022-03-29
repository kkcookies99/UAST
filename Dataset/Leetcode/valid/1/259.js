 var XXX = function(nums, target) {
    var i,i2,x;
    for(i=nums.length-1;i>-1;i--){   
        x=target-nums[i];   
        i2=nums.indexOf(x);
        if(i2!=-1&&i2!=i){
            return [i2,i]
        }       
   }
   return [];
};

