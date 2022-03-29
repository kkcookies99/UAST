 class Solution {
    public  String XXX(int num) {
        char[] arr = String.format("%04d", num).toCharArray();
        char[][] chars = new char[][]{
                {'C', 'D', 'M'},
                {'X', 'L', 'C'},
                {'I', 'V', 'X'}
        };
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Integer.valueOf(arr[0] - '0'); i++) {
            sb.append("M");
        }
        for (int i = 0; i < 3; i++) {
            dealWith(Integer.valueOf(arr[i + 1] - '0'), chars[i], sb);
        }
        return sb.toString();

    }

    /**
     * 处理一位数
     *
     * @param n
     * @param chars
     * @param sb
     */
    public static void dealWith(int n, char[] chars, StringBuilder sb) {
        if (n <= 3) {
            for (int i = 0; i < n; i++) {
                sb.append(chars[0]);
            }
        } else if (n <= 5) {
            for (int i = 0; i < 5 - n; i++) {
                sb.append(chars[0]);
            }
            sb.append(chars[1]);
        } else if (n <= 8) {
            sb.append(chars[1]);
            for (int i = 0; i < n - 5; i++) {
                sb.append(chars[0]);
            }
        } else {
            for (int i = 0; i < n - 8; i++) {
                sb.append(chars[0]);
            }
            sb.append(chars[2]);
        }
    }
}

