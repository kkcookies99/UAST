 var XXX = function(nums1, m, nums2, n) {
  let k = m + n 
  
  while (n > 0) {
    nums1[--k] = (m > 0 && nums1[m - 1] > nums2[n - 1]) 
      ? nums1[--m] : nums2[--n]
  }
};

