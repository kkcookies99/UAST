 public double XXX(int[] nums1, int[] nums2) {
        List<Integer> dataList = new ArrayList<>();
		if (nums1.length > 0) {
			for (int i : nums1) {
				dataList.add(i);
			}
		}
		if (nums2.length > 0) {
			for (int i : nums2) {
				dataList.add(i);
			}
		}
		Collections.sort(dataList);
		return getMidNum(dataList);
    }

    private static double getMidNum(List<Integer> dataList) {
		int len = dataList.size();
		if (len % 2 == 0) {
			int var = dataList.get(len / 2 - 1) + dataList.get(len / 2);
			if (var != 0) {
				return var / 2.0;
			} else {
				return 0;
			}
		} else {
			return dataList.get((len - 1)/2);
		}
	}

