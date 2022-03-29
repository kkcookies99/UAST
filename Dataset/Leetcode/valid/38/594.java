 class Solution {
    public String XXX(int n) {
        String res = "1";
        while (n-- > 1) {
            res = count(res);
        }
        return res;
    }

    public String count(String str) {
        StringBuffer sb = new StringBuffer();
        char[] array = str.toCharArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (i + 1 >= array.length || array[i] != array[i + 1]) {
                sb.append(count);
                sb.append(array[i]);
                count = 0;
            }
        }
        return sb.toString();
    }
}

