 class Solution {
    public int[] XXX(int[] digits) {
        int[] arr = new int[digits.length + 1];//辅助数组，记录进位情况
	arr[digits.length] = 1;
        //将进位情况放进数组中
	for (int i = digits.length - 1; i >= 0; i--) {
		if ((digits[i] + arr[i + 1]) == 10) {
			arr[i] = 1;
		}
	}
	if (arr[0] == 1) {//说明后面有进位到第一位上面--表面现在数组扩充，使用定义的数组
		for (int i = 0; i < digits.length; i++) {
			arr[i+1] = (digits[i] + arr[i + 1] == 10) ? 0 : digits[i] + arr[i + 1];
		}
			return arr;
	}
        //正常情况，数组和进位值相加并将改变进位后的结果
	for (int i = 0; i < digits.length; i++) {
		digits[i] = (digits[i] + arr[i + 1] == 10) ? 0 : digits[i] + arr[i + 1];
		}
	return digits;
    }
}

