 var XXX = function(nums1, m, nums2, n) {
    var i=0, j=0;
    nums1.splice(m);
    while(j<n) {
        if(i === nums1.length) {
            nums1.push(nums2[j++]);
            i++;
        } else {
            if (nums1[i]>nums2[j]) {
                nums1.splice(i,0,nums2[j]);
                i++;
                j++;
            } else {
                i++;
            }
        }
    }
};

