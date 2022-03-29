 var XXX = function(nums1, nums2) {
    let a = [...nums1, ...nums2].sort((a, b) => a - b);
    return (a[a.length / 2 | 0] + a[a.length - (a.length / 2 | 0) - 1]) / 2;
};

