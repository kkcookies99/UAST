 public String XXX(String a, String b) {
        char[] str1 = a.toCharArray();
        char[] str2 = b.toCharArray();
        int len;
        int carryBit = 0;
        int num;
        StringBuilder sb = new StringBuilder();
        char[] temp;
        if(str1.length > str2.length) {
            len = str1.length;
            temp = str2;
            str2 = new char[str1.length];
            for(int i = str2.length - 1, j = temp.length-1; i >= 0; i--) {
                if(j >= 0) {
                    str2[i] = temp[j--];
                } else {
                    str2[i] = '0';
                }
            }
        } else {
            len = str2.length;
            temp = str1;
            str1 = new char[str2.length];
            for(int i = str1.length - 1, j = temp.length-1; i >= 0; i--) {
                if(j >= 0) {
                    str1[i] = temp[j--];
                } else {
                    str1[i] = '0';
                }
            }
        }
        for(int i = len - 1; i >= 0; i--) {
            num = (str1[i] - '0') + (str2[i] - '0') + carryBit;
            carryBit = num / 2;
            sb.append(num % 2);
        }
        if(carryBit == 1)
            sb.append(1);
        return sb.reverse().toString();
    }

