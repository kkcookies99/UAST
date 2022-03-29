 var XXX = function(nums, target) {
  const arr = []
  for(i in nums) {
    if(nums[i] == undefined) continue
    for(i2 in nums) {
      if(nums[i2] == undefined || i == i2) continue
      if(nums[i] + nums[i2] == target) {
        arr.push(i)
        arr.push(i2)
        delete nums[i]
        delete nums[i2]
      }
    }
  }
  return arr
};

