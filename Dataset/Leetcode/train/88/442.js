 var XXX = function(nums1, m, nums2, n) {
    let k = m + n - 1;
    let i = m - 1;
    let j = n - 1;
    while(k >=0,i>=0,j>=0){
        if(nums1[i] > nums2[j] ){
            nums1[k] = nums1[i];
            k--;
            i--;
        }else{
            nums1[k] = nums2[j];
            k--;
            j--;
        }
    }
    // console.log(nums1);
    return nums1
};

