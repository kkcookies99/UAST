 var XXX = function(nums1, m, nums2, n) {
    if(!nums1 || !nums2) {
        return 
    }
    return (nums1.splice(0, m)).push(...(nums2.splice(0, n))).sort((a,b) => {return a-b})
};

