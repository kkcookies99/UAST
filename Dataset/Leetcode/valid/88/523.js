 var XXX = function(nums1, m, nums2, n) {
  for(let i = 0;i<nums2.length;i++){
    nums1[m + i] = nums2[i]
  }
  return nums1.sort((a,b)=> a - b);
};

