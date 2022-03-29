class Solution {
    public String XXX(String a, String b) {
        if (a == null || b == null) {
            return "";
        }
        String str1 = "";
        String str2 = "";
        if (a.length() > b.length()) {
            str1 = a;
            str2 = b;
        } else {
            str1 = b;
            str2 = a;
        }

        for (int i = str2.length(); i < str1.length(); i++) {
            str2 = "0" + str2;
        }

        int index = str1.length()-1;
        int more = 0;
        StringBuilder sb = new StringBuilder();
        while (index >= 0) {
            int i1 = str1.charAt(index) - '0';
            int i2 = str2.charAt(index) - '0';
            char c = ' ';
            //more 0
            int sum = i1 + i2 + more;
            if (sum == 0) {
                c = '0';
                more = 0;
            } else if (sum == 1){
                c = '1';
                more = 0;
            } else if (sum == 2) {
                c = '0';
                more = 1;
            } else if (sum == 3) {
                c = '1';
                more = 1;
            }
            sb.append(c);
            index--;
        }

        if (more == 1) {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}

