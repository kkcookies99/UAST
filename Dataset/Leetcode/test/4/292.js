 var XXX = function (nums1, nums2) {
  function findCenterNumber(nums) {
    return nums.length > 1
      ? nums.length % 2 === 0
        ? (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2
        : nums[(nums.length - 1) / 2]
      : nums[0];
  }
  if (nums1.length === 0) {
    return findCenterNumber(nums2).toFixed(5);
  } else if (nums2.length === 0) {
    return findCenterNumber(nums1).toFixed(5);
  }
  let smallArr, bigArr;
  nums1[0] >= nums2[0]
    ? ((bigArr = nums1), (smallArr = nums2))
    : ((bigArr = nums2), (smallArr = nums1));
  let arr = [];
  total = smallArr.length + bigArr.length;
  let double = total % 2 === 0;
  let half = total / 2;
  let i = (j = 0);

  // 总是选择两数组中值小的推入新数组中，然后移动该值小的数组的指针，若到尽头，就只移动另一个数组
  while (true) {
    if (smallArr[i] < bigArr[j] || bigArr[j] === undefined) {
      arr.push(smallArr[i++]);
    } else if (smallArr[i] >= bigArr[j] || smallArr[i] === undefined) {
      arr.push(bigArr[j++]);
    }
    if (arr.length > half) {
      if (!double) return arr.pop().toFixed(5);
      else return ((arr.pop() + arr.pop()) / 2).toFixed(5);
    }
  }
};

