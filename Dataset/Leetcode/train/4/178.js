 var XXX = function(nums1, nums2) {
    //先合并
    let sumNums=nums1.concat(nums2);
    //升序排
    sumNums.sort((a,b)=>a-b);
    // console.log(sumNums);
    //判断最后一个下标
    //如果是偶数:[1,2,3]
    //             ↑
    //          (length-1)/2
    if((sumNums.length-1)%2===0){
        //那么他的下标为:sumNums.length/2
        // console.log(sumNums[(sumNums.length-1)/2]);
        return sumNums[(sumNums.length-1)/2];
    }else{
        //如果是奇数:[1,2,                3,4]
        //             ↑           +     ↑
        //           [(length)/2-1]+[length/2]
        //      那么  ------------------------
        //                      2 
        return (sumNums[(sumNums.length)/2-1]+sumNums[sumNums.length/2])/2;
    }
};

