 class Solution {
    public String XXX(String[] strs) {
        int len = strs[0].length();
        int idx = 0;
		
		//排序找出最短字符串
        Arrays.sort(strs, (x, y) -> x.length() - y.length());
       
        String comStr = strs[0];      //最短字符串

        StringBuilder pre = new StringBuilder();
        for (int i = 0; i < comStr.length(); i++) {
            char comChar = comStr.charAt(i);

            //从第一个字符开始遍历所有子串，存在不符合即返回
            for (String str : strs) {
                if (str.charAt(i) != comChar) {
                    return pre.toString();
                }
            }
            pre.append(comChar);
        }
        return pre.toString();
    }
}

