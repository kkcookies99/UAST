 public String XXX(String s, int numRows) {
		int n = s.length();
		if (n <= 2 || numRows == 1) {
			return s;
		}
		int batchNum = (numRows<<1) - 2;
		char[] z = new char[n];
		int zIndex = 0;
		int index = 0;
		int indexZ = 0;
		// 分组的思路（每numRows + numRows - 2个数为一组）
		// 可以理解为二维数组，按规律每几列划分为一组。每组来看的话，一行其实最多两个元素
		int batchs = n / batchNum;
		if (n % batchNum != 0) {
			batchs++;
		}
		for (int i = 0; i < numRows; i++) {
			for (int batch = 0; batch < batchs; batch++) {
				// 每次遍历，知道numRows和对应分组序号batch，就可以计算出该位置应该取s的第几个元素
				index = i + batch * batchNum;
				if (index < n) {
					z[zIndex++] = s.charAt(index);
				} 
				// 遍历到行尾，跳出循环，减少循环次数
				if (i == numRows - 1 && (i + (batch + 1) * batchNum) >= n) {
					break;
				}
				// 中间几行，每次还需要向查找它后面的一个在组内独立一列出现的字符
				if (i > 0 && i < numRows - 1) {
					indexZ = batchNum * (batch + 1) - i;
					if (indexZ < n) {
						z[zIndex++] = s.charAt(indexZ);
					} 
					// 遍历到行尾，跳出循环，减少循环次数
					if ((i + (batch + 1) * batchNum) >= n) {
						break;
					}
				}
			}
		}
		return String.valueOf(z);
    }

