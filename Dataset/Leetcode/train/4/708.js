 var XXX = function(nums1, nums2) {
  let arr=nums1.concat(nums2).sort((a,b)=>a-b)
  if((arr.length-1)%2===0){
    return arr[(arr.length-1)/2]
  }else{
    return (arr[arr.length/2]+arr[(arr.length-2)/2])/2
  }
};

