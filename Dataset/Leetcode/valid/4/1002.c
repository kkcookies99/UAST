 double XXX(int* nums1, int nums1Size, int* nums2, int nums2Size){
	int i = 0, j = 0, m = strlen(nums1), n = strlen(nums2);
	int count = 0;
	int num3[999] = { 0 };
	while (i != n&&j != m){
		if (nums1[i] < nums2[j]) {
			num3[count++] = nums1[i++];
		}
		else {
			num3[count++] = nums2[j++];
		}
	}

	while (j != n) {
		num3[count++] = nums2[j++];
	}
	while (i != m) {
		num3[count++] = nums1[i++];
	}
	count = m + n;
	if (count % 2 == 0){
		return (num3[count / 2] + num3[count / 2 - 1])/2.0;
	}
	else{
		return num3[count/2];
	}
}

