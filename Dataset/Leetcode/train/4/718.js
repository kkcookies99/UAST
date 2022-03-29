 var XXX = function(nums1, nums2) {
    const nums = nums1.concat(nums2).sort(function(a, b) { return a - b })
      const len = nums.length
      if (len % 2 === 0) {
        return ((nums[len / 2 - 1] + nums[len / 2]) / 2).toFixed(5)
      } else {
        return nums[Math.ceil(len / 2) - 1].toFixed(5)
      }
};

