 var XXX = function(nums1, m, nums2, n) {
    if(n==0)return nums1;
    var i=m-1,j=n-1;
    var t=m+n-1;
    while(i>=0&&j>=0){
        if(nums1[i]>=nums2[j]){
            nums1[t]=nums1[i];
            --i;
        }
        else {
            nums1[t]=nums2[j];
            --j;
        }
        --t;
    }
    while(i>=0){
        nums1[t]=nums1[i];
        --t;--i;
    }
    while(j>=0){
        nums1[t]=nums2[j];
        --t;--j;
    }
    return nums1;
};

