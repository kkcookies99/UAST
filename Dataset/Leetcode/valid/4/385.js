var XXX = function(nums1, nums2) {
    const len = nums1.length + nums2.length;
    const center = parseInt(len / 2);
    const center2 = center - (1 - len % 2);
    
    // 你甚至可以简化为这样...
    const arr = [...nums1, ...nums2].sort((a, b) => {
        return a - b;
    });
    
    return (arr[center] + arr[center2]) / 2;
};

