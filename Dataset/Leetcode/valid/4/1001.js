 var XXX = function(nums1, nums2) {
    let nums3 = [...nums1,...nums2].sort((a,b)=>{return a-b})
    let len = nums3.length
    if(len%2===0){
        return ((nums3[len/2] + nums3[len/2 -1])/2).toFixed(5)
    }else{
        return nums3[parseInt(len/2)].toFixed(5)
    }
};

