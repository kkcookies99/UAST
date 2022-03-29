 class Solution {
    public String XXX(String s, int numRows) {
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        // 若行数大于等于字符个数，那么直接输出原字符串即可
        if (numRows >= chars.length) {
            return s;
        }
        if (1 == numRows) {
            return s;
        }
        for (int i = 0; i < numRows; i++) {
            int index = i;
            res.append(chars[index]);
            int firstIndex = (numRows - 1 - i) * 2;
            int secondIndex = i * 2;
            while (index < chars.length) {
                if (0 != firstIndex) {
                    index += firstIndex;
                    if (index >= chars.length) {
                        break;
                    }
                    res.append(chars[index]);
                }
                if (0 != secondIndex) {
                    // secondIndex 为0则表示是第一排，所以就不进行append了
                    index += secondIndex;
                    if (index >= chars.length) {
                        break;
                    }
                    res.append(chars[index]);
                }
            }
        }
        return res.toString();
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


