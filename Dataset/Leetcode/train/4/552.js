 var XXX = function(nums1, nums2) {
  let arr = nums1.concat(nums2);
  let len = arr.length;
  arr.sort((a,b)=>a-b);
  let index = Math.floor(len / 2);
  if(len % 2 > 0){
    return arr[index]
  }else{
    return (arr[index]+arr[index-1])/2
  }
};

