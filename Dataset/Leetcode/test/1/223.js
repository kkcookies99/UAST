 var XXX = function(nums, target) {
    var len = nums.length;
    var j;
  for (var i=0;i<len;i++){
       j = nums.indexOf(target - nums[i],i+1);
    if(j!==-1){
        return [i,j]
    }
  }
};

