 var XXX = function(nums1, m, nums2, n) {
    // 双指针
    let point1 = 0, point2 = 0;
    let sort = new Array(m + n).fill(0);
    while (point1 < m || point2 < n) {
        // nums1
        if (point1 == m) {
            sort[point1 + point2] = nums2[point2]
            point2++
        } else if (point2 == n) {
            sort[point1 + point2] = nums1[point1]
            point1++
        } else if (nums1[point1] < nums2[point2]) {
            sort[point1 + point2] = nums1[point1]
            point1++
        } else {
            sort[point1 + point2] = nums2[point2]
            point2++
        }
    }
    for (let i = 0; i < m + n; i++) {
        nums1[i] = sort[i]
    }
    return nums1
}```

