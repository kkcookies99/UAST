 var XXX = function(nums1, m, nums2, n) {
    return nums1.slice(0,m).concat(nums2.slice(0,n)).sort((a,b)=>(a-b>0))
};

