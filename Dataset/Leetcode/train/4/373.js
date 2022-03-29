var XXX = function(nums1, nums2) {
    if(nums1.length==0){
        return findMedian(nums2);
    }
    if(nums2.length==0){
        return findMedian(nums1);
    }
    return (findMedian(nums1)+findMedian(nums2))/2;

    function findMedian(nums){
        var middle=nums.length/2;
        
        if(nums.length%2==0){//长度为偶 1,2,3,4
            return (nums[middle-1]+nums[middle])/2;
        }
        else{
            return nums[Math.floor(middle)];
        }
    }
};

