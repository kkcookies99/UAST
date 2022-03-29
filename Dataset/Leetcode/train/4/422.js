 /**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var XXX = function(nums1, nums2) {
  const newArr = [];
  let i, j;
  for (i = 0, j = 0; i < nums1.length && j < nums2.length;) {
      if (nums1[i] < nums2[j]) {
          newArr.push(nums1[i++]);
      } else {
          newArr.push(nums2[j++]);
      }
  }
  if (i < nums1.length) {
      newArr.push(...nums1.slice(i));
  } else {
      newArr.push(...nums2.slice(j));
  }
  const mid = newArr.length / 2;
  if (newArr.length % 2 === 0) {
      return (newArr[mid] + newArr[mid - 1]) / 2;
  }
  return newArr[Math.floor(mid)];
};

