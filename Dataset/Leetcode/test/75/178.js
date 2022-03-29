var XXX = function(nums) {
  if (nums.length == 1) return nums
  const quickSort = (nums, from, to) => {
    if (from < to) {
      let i = from, j = to, p = nums[from]
      while (i < j) {
        while (i < j && nums[j] >= p) j--
        if (i < j) {
          nums[i++] = nums[j]
        }
        while (i < j && nums[i] <= p) i++
        if (i < j) {
          nums[j--] = nums[i]
        }
      }
      nums[i] = p
      quickSort(nums, from, i - 1)
      quickSort(nums, i + 1, to)
    }
  }
  quickSort(nums, 0, nums.length - 1)
};
