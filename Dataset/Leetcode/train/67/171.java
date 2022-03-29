 class Solution {
    public String XXX(String a, String b) {
        //创建一个Map集合，存储字符对应数字
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		map.put('0', 0);
		map.put('1', 1);
		map.put((char) ('0'+'1'), 1);
		map.put((char) ('1'+'1'), 2);
		
		//首先比较两者长度，给短的那个在前面补0
		int aSize = a.length();
		int bSize = b.length();
		
		if (aSize > bSize) {
			StringBuilder sb = new StringBuilder(b);
			for (int i = 0; i < aSize - bSize; i++) {
				sb.insert(0, '0');
			}
			b = sb.toString();
		}
		
		if (aSize < bSize) {
			StringBuilder sb = new StringBuilder(a);
			for (int i = 0; i < bSize - aSize; i++) {
				sb.insert(0, '0');
			}
			a = sb.toString();
		}
		
		//将ab转成字符数组形式，便于调用
		char[] charA = a.toCharArray();
		char[] charB = b.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		//遍历两个字符数组
		for (int i = charB.length - 1; i >= 0; i--) {
			int sum = map.get(charA[i]) + map.get(charB[i]);
            sb.insert(0, sum % 2);
			if (sum > 1) {
				if (i != 0) {
					charA[i-1] += '1';
				} else {
					sb.insert(0, 1);
				}
			} 
		}
        return sb.toString();
    }
}

