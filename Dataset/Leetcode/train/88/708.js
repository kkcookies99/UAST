 var XXX = function(nums1, m, nums2, n) {
  for (let i = m, j = 0; i < m + n; i++, j++) {
    nums1[i] = nums2[j]
  }
  for (let k = 0; k < nums1.length - 1; k++) {
    for (let l = 0; l < nums1.length - 1 - k; l++) {
      if (nums1[l] > nums1[l + 1]) {
        let temp = nums1[l]
        nums1[l] = nums1[l + 1]
        nums1[l + 1] = temp
      }
    }
  }
}

