class Solution {
    public String XXX(int n) {
        String[] array = new String[n + 1];
        array[1] = "1";
        for (int i = 2; i <= n; i++) {
            String number = array[i - 1];
            int len = number.length();
            StringBuilder str = new StringBuilder();
            int num = 1;
            for (int j = 0; j < len; j++) {
                if (j + 1 < len && number.charAt(j) == number.charAt(j + 1)) {
                    num++;
                } else {
                    str.append(num).append(number.charAt(j));
                    num = 1;
                }
            }
            array[i] = str.toString();
        }
        return array[n];
    }
}

