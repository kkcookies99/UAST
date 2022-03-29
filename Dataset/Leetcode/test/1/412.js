 var XXX = function(nums, target) {
   let arr = [];
   for(let i = 0; i < nums.length; i++){
       for(let j = 0; j < nums.length; j++){
           if(i !== (nums.length - 1)){
               if(j > i && j < nums.length){
                   if((nums[i] + nums[j]) === target){
                       arr.push(i);
                       arr.push(j);
                       break;
                   }
               }
           }
       }
       if(arr.length > 0){
           break;
       }
   }
   return arr;
};

