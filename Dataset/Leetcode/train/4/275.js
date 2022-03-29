 var XXX = function(nums1, nums2) {
  const newArr = nums1.concat(nums2).sort((a,b) => a - b)
  return newArr.length % 2 ? newArr[Math.floor(newArr.length/2)] : (newArr[(newArr.length/2)-1]+newArr[(newArr.length/2)])/2
};

