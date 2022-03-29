 var XXX = function(nums, target) {
       for(var i = 0 ; i < nums.length; i++){
           var a = nums.indexOf((target - nums[i]),i+1)
           if(a != -1){
               return [i , a]
           }
       }
};


