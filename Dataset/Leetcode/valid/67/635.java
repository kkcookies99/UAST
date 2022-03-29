class Solution {
    public String XXX(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        char[] result = new char[Math.max(aLen, bLen)];
        int flag = 0;
        for (int i = aLen - 1, j = bLen - 1; i >= 0 || j >= 0; i--, j--) {
            int aNum = i >= 0 ? a.charAt(i) - '0' : 0;
            int bNum = j >= 0 ? b.charAt(j) - '0' : 0;
            int index = Math.max(i, j);
            result[index] = (char) ((aNum + bNum + flag) % 2 + '0');
            if (aNum + bNum + flag >= 2) {
                flag = 1;
            } else {
                flag = 0;
            }
        }
        if (flag == 1){
            return "1" + String.valueOf(result);
        }else return String.valueOf(result);
    }
}

