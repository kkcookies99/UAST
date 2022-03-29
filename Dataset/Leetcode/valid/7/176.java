	public static int XXX(int x) {
		String s = String.valueOf(x);
		char[] chars = s.toCharArray();
		// 判断输入整数是正数还是负数。正数则flag=false。
		boolean flag = chars[0] == '-' ? true : false;
		// 如果是负数最后一个是符号位，不用翻转！
		int end = flag ? 1 : 0;
		StringBuffer sb = new StringBuffer();// 保存翻转后的字符串
		for (int i = chars.length - 1; i >= end; i--) {
			sb.append(chars[i]);
		}

		int result = 0;// 保存结果
		try {
			result = Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) { // 如果反转后的整数溢出，则返回 0
			return 0;
		}
		result = flag ? (-result) : result;
		return result;
	}

