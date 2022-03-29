 class Solution {
    public int[][] XXX(int[][] intervals) {
        if(intervals.length == 0) {
			return new int[0][0];
		}
		List<int []> resultList = new ArrayList<>();
		// 先对原数组进行排序
		// 调用Arrays.sort方法，自行实现比较器
		Arrays.sort(intervals, new Comparator<int[]>() {
			public int compare(int[] intervals1, int[] intervals2) {
				return intervals1[0] - intervals2[0];
			}
		});
		// 挨个比较区间
		resultList.add(intervals[0]);
		int k = 0;  // 记录当前list中有几个区间
		for(int i = 1; i < intervals.length; i++) {
			// 若新加入最小值 > 已有最大值，则直接加入resultList
			if(intervals[i][0] > resultList.get(k)[1]) {
				resultList.add(intervals[i]);
				k++;
			}
			// 否则，更新已有区间的最大值为两个区间最大值较大的一个数
			else {
				int max = Math.max(resultList.get(k)[1], intervals[i][1]);
				resultList.get(k)[1] = max;
			}
		}
		return resultList.toArray(new int[resultList.size()][] );
    }
}

