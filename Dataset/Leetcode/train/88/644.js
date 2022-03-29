 var XXX = function(nums1, m, nums2, n) {
    nums1 = nums1.slice(0,m)
    nums2 = nums2.slice(0,n)
    let temp = [];
    while(nums1.length&&nums2.length){
        if(nums1[0]<nums2[0]){
            temp.push(nums1.shift());
        }else{
            temp.push(nums2.shift());
        }
    }
    temp = temp.concat(nums1,nums2)
    for (let i = 0; i < m + n; ++i) {
        nums1[i] = temp[i];
    }
};

