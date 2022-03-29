 	public static double XXX(int[] nums1, int[] nums2) {
		List<Integer> list = new ArrayList<Integer>();
		for (int x = 0, y = 0; x < nums1.length || y < nums2.length;) {
			if (x < nums1.length && (y == nums2.length || nums1[x] < nums2[y])) {
				list.add(nums1[x]);
				x++;
			} else {
				list.add(nums2[y]);
				y++;
			}
		}
		double ans = 0;
		int p = list.size() / 2;
		if (list.size() % 2 == 1) {
			ans = list.get(list.size() / 2);
		} else if (list.size() > 1) {
			ans = (double) (list.get(p) + list.get(p - 1)) / 2;
		} else
			ans = list.get(p);

		return ans;
	}

