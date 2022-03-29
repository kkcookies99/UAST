 var XXX = function(nums1, nums2) {
	let arr = nums1.concat(nums2);
	arr.sort((a,b) => {
		return a - b;
	});
    return arr.length % 2 == 0 ? (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2 : arr[Math.floor(arr.length / 2)];
};

