 var XXX = function(nums1, m, nums2, n) {
    let final = m+n-1
    m--
    n--
    while(m>=0 || n>=0){
        if(n<0 || nums1[m]>nums2[n]){
            nums1[final] = nums1[m]
            m--
        }else{
            nums1[final] = nums2[n]
            n--
        }
        final --
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


