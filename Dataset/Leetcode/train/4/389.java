 public double find(int[] nums1, int len1s, int len1e, int[] nums2, int len2s, int len2e) {
	int len1 = len1e - len1s;
	int len2 = len2e - len2s;
    int cut2 = len2/2;
	if (len1 == 0) {
		if (len2 % 2 == 1) {
			return nums2[len2s + cut2];
		} else {
			return (nums2[len2s + cut2 - 1] + nums2[len2s + cut2]) / 2.0;
		}
	} else if (len1 == 1) {
		return findZ(nums1[len1s], nums2, len2s, len2e);
	} else {
		int cut = len1 / 2;
		double mid;
		if (len1 % 2 == 1) {
			mid = nums1[len1s + cut];
		} else {
			mid = (nums1[len1s + cut - 1] + nums1[len1s + cut]) / 2.0;
		}
		int m1 = nums2[len2s + cut];
		int m2 = nums2[len2e - cut];
		int len2sn, len2en, len1sn, len1en;
		if (m1 <= mid) {
			len2sn = len2s + cut;
			len1en = len1e - cut;
			return find(nums1, len1s, len1en, nums2, len2sn, len2e);
		}
		if (m2 >= mid) {
			len2en = len2e - cut;
			len1sn = len1s + cut;
			return find(nums1, len1sn, len1e, nums2, len2s, len2en);
		}

	}

	return 0;
}

public double findZ(int n, int[] nums2, int len2s, int len2e) {
	int len2 = len2e - len2s;
    int cut2 = len2 /2 ;
	if (len2 == 1) {
		return (n + nums2[len2s + cut2]) / 2.0;
	}
	if (len2 % 2 == 1) {
		if (n > nums2[len2s + cut2]) {
			if (n > nums2[len2s + cut2 + 1]) {
				return (nums2[len2s + cut2 + 1] + nums2[len2s +cut2]) / 2.0;
			} else {
				return (n + nums2[len2s + cut2]) / 2.0;
			}

		} else {
			if (n < nums2[len2s + cut2 - 1]) {
				return (nums2[len2s + cut2 - 1] + nums2[len2s + len2 / 2]) / 2.0;
			} else {
				return (n + nums2[len2s + cut2]) / 2.0;
			}
		}
	}
	else
	{
		if (n > nums2[len2s + cut2 - 1]) {
			if (n > nums2[len2s + cut2]) {
				return nums2[len2s + cut2];
			} else {
				return n;
			}
		} else {
			return nums2[len2s + cut2 - 1];
		}
	}
}

