 	public String XXX(String[] strs) {

		// 定义一个StringBuffer用来存储相同的前缀
		StringBuffer resultString = new StringBuffer();
		// index为每个串的索引，num是strs的索引
		// num为1，就是从第二个串开始判断
                //第一个设为比较串（每个串都和第一个串进行比较）
		int index = 0, num = 1;

		// 判空
		if (strs == null || strs.length == 0) {
			return "";
		}

		// 如果长度为1就直接返回第一个
		if (strs.length == 1) {
			return strs[0];
		}

		// String里面的charAt()会进行角标越界判定
		char[] charArray = strs[0].toCharArray();

		// 根据比较串来进行索引的移动
		while (index < charArray.length) {
			// 每轮结束num都要指向strs里的第二个串
			num = 1;
			char charAt = 0;
			while (num < strs.length) {

				// 如果角标越界，就不用比较后面的串了，相同的前缀都找到了
				// 比如 aaaa 和 a 和 aaabb
				if (index >= strs[num].length()) {
					return resultString.toString();
				}
				char c = strs[num].charAt(index);
				// 和比较串中相同索引的字符进行比较
				if (c != charArray[index]) {
					// 不相同就直接返回了
					// aaa 和 aab 和 aaab
					return resultString.toString();
				}
				// 执行到这里就说明num指向的字符串和比较串，索引为index的字符相同，保存起来
				charAt = c;
				// 开始判定下一个字符串
				++num;
			}
			// 都没有问题添加到返回结果中
			resultString.append(charAt);
			// 开始进行下一个字符的判断
			++index;
		}

		return resultString.toString();
	}

