 var XXX = function(nums) {
  const len = nums.length
  if(len<=1) return len
  let slow = 0
  for(let fast=1;fast<len;fast++){
    // 不相同，可交换
    if(nums[slow]!==nums[fast]){
      nums[++slow] = nums[fast]
    }
  }
  // 更新新数组长度
  nums.length = slow + 1
  return nums.length
};

