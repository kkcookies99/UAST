 var XXX = function(nums, target) {
  let temp = []
  for (let i = 0; i < nums.length; i++) {
    let dif = target-nums[i]
    if (temp[dif] !== undefined) {
      return [temp[dif], i]
    }
    temp[nums[i]] = i;
  }
};

