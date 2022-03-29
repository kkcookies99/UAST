 var XXX = function(nums1, m, nums2, n) {
  var len = m + n - 1;

  while(len >= 0) {
      if(m < 1) {
          nums1[len--] = nums2[--n];
          continue
      }
      if(n < 1) {
          nums1[len--] = nums1[--m];
          continue
      }
      if(nums1[m - 1] > nums2[n - 1]) {
          nums1[len--] = nums1[--m];
      }else {
          nums1[len--] = nums2[--n];
      }
  }

  return nums1;
};

