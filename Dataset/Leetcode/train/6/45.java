 class Solution {
    public String XXX(String s, int numRows) {
        //判断特殊情况
		if (numRows == 1 || numRows >= s.length()) {
			return s;
		}
        //声明结果数组
		char[] res = new char[s.length()];
        //代表结果数组的下标
		int index = 0;
        //分行循环搜索
		for (int i = 0; i < numRows; i++) {
            //下一个字符的检索  true下false上
			boolean direction = i != numRows - 1;
            //搜索用的指针
			int num = i;
            //循环直到超出长度
			while (num < s.length()) {
                //搜索到的字符放到结果数组中
				res[index] = s.charAt(num);
                //第一行、最后一行、中间行  分开处理
                //如何计算下一个   找规律    小学生最擅长
				if (i == 0) {
					num += (numRows * 2 - 2);
				} else if (i == numRows - 1) {
					num += (numRows * 2 - 2);
				} else {
					if (direction) {
						num += ((numRows - i) * 2 - 2);
					} else {
						num += ((i + 1) * 2 - 2);
					}
                    //改变搜索方向
					direction = !direction;
				}
                //结果数组下标移动
				index++;
			}
		}
		return new String(res);
    }
}

