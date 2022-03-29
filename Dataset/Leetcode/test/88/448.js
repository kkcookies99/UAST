 var XXX = function(nums1, m, nums2, n) {
  nums1.splice(m, nums1.length - m, ...nums2)
  nums1.sort((a, b) => a-b)
};

