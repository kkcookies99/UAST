 var XXX = function(nums1, m, nums2, n) {
    var _nums1 = nums1.slice(0,m)
    var _nums2 = nums2.slice(0,n)
    nums1 = [..._nums1, ..._nums2].sort((a, b) => a -b)
};

