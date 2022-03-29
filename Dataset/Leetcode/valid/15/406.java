 	public List<List<Integer>> XXX(int[] nums) { 
		if (nums.length < 3) return Collections.emptyList(); 
		List<List<Integer>> res = new ArrayList<>(); 
		int minValue = Integer.MAX_VALUE; 
		int maxValue = Integer.MIN_VALUE; 
		int negSize = 0, posSize = 0; 
		int zeroSize = 0; 
		for (int v : nums) { 
			if (v < minValue) minValue = v; 
			if (v > maxValue) maxValue = v; 
			if (v > 0) posSize++; 
			else if (v < 0) negSize++; 
			else zeroSize++; 
		}
		if (zeroSize >= 3) res.add(Arrays.asList(0, 0, 0));//输出 三个 0 的情况 
		if (negSize == 0 || posSize == 0) return res;
		if (minValue * 2 + maxValue > 0) maxValue = -minValue * 2; 
		//同理更新minValue
		else if (maxValue * 2 + minValue < 0) minValue = -maxValue * 2;
		//自己构建一个hashmap，值表示元素重复次数，注意java数组默认值为 0
		int[] map = new int[maxValue - minValue + 1];
		int[] negs = new int[negSize];
		int[] poses = new int[posSize];
		negSize = 0;
		posSize = 0;
		for (int v : nums) {
			if (v >= minValue && v <= maxValue) {//只保留在[minValue,maxValue]区间内的元素
				if (map[v - minValue]++ == 0) {//计数加去重
					if (v > 0) poses[posSize++] = v;//poses数组存所有去重后的正值
					else if (v < 0) negs[negSize++] = v;//negs数组存所有去重后的负值 
				}
			}
		}
		//正负数两数组排序
		Arrays.sort(poses, 0, posSize);
		Arrays.sort(negs, 0, negSize);
		int basej = 0;
		for (int i = negSize - 1; i >= 0; i--) {//负数数组从后往前遍历
			int nv = negs[i];//nv为当前负数值
			int minp = (-nv) >>> 1;
			while (basej < posSize && poses[basej] < minp) basej++;//定位到正数数组中值刚好小于平均值的元素
			for (int j = basej; j < posSize; j++) {//正数数组从大于等于平均值的元素开始遍历
				int pv = poses[j];//pv 为当前正数值
				int cv = 0 - nv - pv;//cv 为要寻找的另一个值
				if (cv >= nv && cv <= pv) {
					if (cv == nv) {
						if (map[nv - minValue] > 1)//两个相同的负数和一个正数的情况
							res.add(Arrays.asList(nv, nv, pv));
					} else if (cv == pv) {
						if (map[pv - minValue] > 1)//两个相同的正数和一个负数的情况
							res.add(Arrays.asList(nv, pv, pv));
					} else {
						if (map[cv - minValue] > 0)//三个不同元素的情况
							res.add(Arrays.asList(nv, cv, pv));
					}
				} else if (cv < nv) break;//如果 cv 小于 nv了，表明这种情况已经找过了，跳出循环
			}
		}
		return res;
	}

