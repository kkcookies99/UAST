 var XXX = function(nums1, nums2) {

    const t = [...nums1,...nums2] 
    let len = t.length
    let arr = t.sort((a,b)=>a-b);

    return len %2 === 0 ? (arr[len/2]+arr[len/2-1])/2 : arr[Math.floor(len/2)]
};

