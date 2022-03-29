 var XXX = function(nums1, nums2) {
    let nums3 = nums1.concat(nums2)
    nums3.sort((a,b) => {
        if(a > b) {return 1}
        else if (a < b) {return -1}
        else{ return 0}
    })

    if(nums3.length % 2 && nums3.length !== 1){
        return nums3[Math.floor(nums3.length / 2)]
    }else if(nums3.length === 1){
        return nums3[0]
    }
    else{
        let s1 = nums3[(nums3.length / 2) - 1]
        let s2 = nums3[nums3.length / 2]
        return (s1 + s2) / 2
    }
};

