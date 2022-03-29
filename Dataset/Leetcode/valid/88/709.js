 var XXX = function(nums1, m, nums2, n) {
    const s = nums1.slice(0, m)
    s.push(...nums2)
    s.sort((a,b) => a - b)
    return s
};

