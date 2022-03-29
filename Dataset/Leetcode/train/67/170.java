     public String XXX(String a, String b) {
        char[] ac = a.toCharArray();
        char[] bc = b.toCharArray();
        int i = ac.length - 1, j = bc.length - 1;
        int carry = 0; // 表示进位，可以是0或1
        int k;
        char[] res;
        if (i > j) {
            res = ac;
            k = i;
        } else {
            res = bc;
            k = j;
        }
        while (i >= 0 && j >= 0) {
            int sum = carry + (ac[i] - '0') + (bc[j] - '0');
            if (sum < 2) {
                res[k] = (char) (sum + '0');
                carry = 0;
            } else {
                res[k] = (char) (sum % 2 + '0');
                carry = 1;
            }
            i--;
            j--;
            k--;
        }
        while (k >= 0) {
            int sum = carry + res[k] - '0';
            if (sum < 2) {
                res[k] = (char) (sum + '0');
                return new String(res); // 如果剩余部分不再进位
            } else {
                res[k] = (char) (sum % 2 + '0');
                carry = 1;
            }
            k--;
        }
        // 如果最后仍然需要进位
        if (carry == 1) {
            return "1" + new String(res);
        }
        return new String(res);
    }

