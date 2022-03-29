 var XXX = function(nums1, m, nums2, n) {
    let point1 = m - 1;
    let point2 = n - 1;
    let curr = m + n - 1;
    while(curr >= 0) {
        if( nums2[point2] === undefined || nums1[point1] >= nums2[point2]) {
            nums1[curr] = nums1[point1];
            point1 --;
        } else {
            nums1[curr] = nums2[point2];
            point2 --;
        }
        curr --;
    }
};

