 var singleNumber = function(nums) {
  for(let i=1;i<nums.length;i++){
    nums[0]^=nums[i]
  }
  return nums[0]
};

