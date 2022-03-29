 public List<List<Integer>> XXX(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
		if (numRows < 1) {
			return result;
		}
		List<Integer> lastList = new ArrayList<>(1);
		lastList.add(1);
		result.add(lastList);
		for (int i = 2; i <= numRows; i++) {
			List<Integer> list = new ArrayList<>(i);
			list.add(1);
			for (int j = 1; j < i - 1; j++) {
				list.add(lastList.get(j - 1) + lastList.get(j));
			}
			list.add(1);
			result.add(list);
			lastList = list;
		}
		return result;
    }

