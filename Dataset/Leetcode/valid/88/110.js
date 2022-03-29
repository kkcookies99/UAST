 var XXX = function(nums1, m, nums2, n) {
    const len = m + n
    for(let i = m;i<len;i++){
        nums1[i] = nums2.shift()
    }
    nums1.sort((a,b) => a-b)
};


