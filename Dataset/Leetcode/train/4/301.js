var XXX = function(nums1, nums2) {
    var num = [];
			nums1.concat(nums2)
			num = nums1.concat(nums2);
			num.sort(comparenumbers);
			if (num.length % 2 == 1)
				return num[(num.length - 1) / 2];
			else
				return (num[num.length / 2 - 1] + num[num.length / 2]) / 2;
};
function comparenumbers(a,b){
			return a-b;
}
