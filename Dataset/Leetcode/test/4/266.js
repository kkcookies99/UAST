 var XXX = function(nums1, nums2) {
  let temp = nums1.concat(nums2).sort((a, b)=> {return a > b});
  console.log(temp)
  if(temp.length % 2 === 1) {
    return temp[temp.length / 2 - 0.5]
  } else {
    let prev = temp[temp.length / 2 - 1];
    let next = temp[temp.length / 2];
    return (prev + next) / 2
  }
};

