class Solution {
    public String XXX(String a, String b) {
        char[] aChars = a.toCharArray();
        char[] bChars = b.toCharArray();
        StringBuilder sb = new StringBuilder();
        int aIndex = aChars.length - 1, bIndex = bChars.length - 1;
        char preValue = '0';
        while (aIndex >= 0 || bIndex >= 0) {
            int count = 0;
            count += preValue == '1' ? 1 : 0;
            if (aIndex == -1) {
                count += bChars[bIndex--] == '1' ? 1 : 0;
            } else if (bIndex == -1) {
                count += aChars[aIndex--] == '1' ? 1 : 0;
            } else {
                count += aChars[aIndex--] == '1' ? 1 : 0;
                count += bChars[bIndex--] == '1' ? 1 : 0;
            }
            if (count == 0) {
                preValue = '0';
                sb.append(0);
            } else if (count == 1) {
                preValue = '0';
                sb.append(1);
            } else if (count == 2) {
                preValue = '1';
                sb.append(0);
            } else {
                preValue = '1';
                sb.append(1);
            }
        }
        if (preValue == '1') {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}

