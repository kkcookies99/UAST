class Solution {
    public String XXX(String a, String b) {
        if (null == a) {
            return b;
        }
        if (null == b) {
            return a;
        }
        int m = a.length();
        int n = b.length();
        char[] array1 = new StringBuilder(a).reverse().toString().toCharArray();
        char[] array2 = new StringBuilder(b).reverse().toString().toCharArray();
        StringBuffer sb = new StringBuffer();
        int nextTag = 0; // 记录下一位是否加1
        int index = 0;
        while (index < m && index < n) {
            if (nextTag == 0) {                    
                if (array1[index] == array2[index] && array1[index] == '1') {
                    sb.append("0");
                    nextTag = 1;
                } else if (array1[index] == array2[index] && array1[index] == '0') {
                    sb.append("0");
                    nextTag = 0;
                } else {
                    sb.append("1");
                    nextTag = 0;
                }
                index ++;
                continue;
            } 
            // nextTag = 1
            if (array1[index] == array2[index] && array1[index] == '1') {
                sb.append("1");
                nextTag = 1;
            } else if (array1[index] == array2[index] && array1[index] == '0') {
                sb.append("1");
                nextTag = 0;
            } else {
                sb.append("0");
                nextTag = 1;
            }
            index ++;
        }
        while (index < m) {
            if (nextTag == 0) {
                if (array1[index] == '1') {
                    sb.append("1");
                    nextTag = 0;
                } else {
                    sb.append("0");
                    nextTag = 0;
                }
            } else {
                if (array1[index] == '1') {
                    sb.append("0");
                    nextTag = 1;
                } else {
                    sb.append("1");
                    nextTag = 0;
                }
            }    
            index++;        
        }
        while (index < n) {
            if (nextTag == 0) {
                if (array2[index] == '1') {
                    sb.append("1");
                    nextTag = 0;
                } else {
                    sb.append("0");
                    nextTag = 0;
                }
            } else {
                if (array2[index] == '1') {
                    sb.append("0");
                    nextTag = 1;
                } else {
                    sb.append("1");
                    nextTag = 0;
                }
            }    
            index++;        
        }
        if (nextTag == 1) {            
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}

