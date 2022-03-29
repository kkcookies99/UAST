 var XXX = function(nums, target) {
  let lookupTable = []

  for (let i = 0; i < nums.length; i++) {
    if (lookupTable[target - nums[i]] != null) {
      return [i, lookupTable[target - nums[i]]]
    }

    lookupTable[nums[i]] = i
  }
};

