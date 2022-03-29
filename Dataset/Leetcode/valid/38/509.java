 class Solution {
    public String XXX(int n) {
        if(n == 1) {
            return "1";
        }

        String str = XXX(n - 1);
        int len = str.length();
        int i = 0;
        StringBuilder strB = new StringBuilder();
        int count = 1;

        while(i < len) {
            if(i + 1 < len && str.charAt(i + 1) == str.charAt(i)) {
                count++;
                if(i + 1 == len - 1) {
                    char c = (char) (count + '0');
                    strB.append(c);
                    strB.append(str.charAt(i));
                    break;
                }
                i++;
            } else {
                char c = (char) (count + '0');
                strB.append(c);
                strB.append(str.charAt(i));
                count = 1; //这一步很关键，执行else部分时，count需要置1，重新开始计数
                i++; 
            }
        }

        return strB.toString();
    }
}

