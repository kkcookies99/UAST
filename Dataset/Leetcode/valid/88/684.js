 var XXX = function(nums1, m, nums2, n) {
    let [i, j, cur] = [m-1, n-1, m+n-1];
    while(cur >= 0) {
        if (i < 0 || j >= 0 && nums1[i] < nums2[j]) 
            nums1[cur--] = nums2[j--];
        else 
            nums1[cur--] = nums1[i--];
    }
};

