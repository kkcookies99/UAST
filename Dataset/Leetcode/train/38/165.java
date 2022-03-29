class Solution {
        public String XXX(int n) {
            if (n == 1) return "1";
            if (n == 2) return "11";
            String s = XXX(n-1);
            return handle(s);
        }

        private String handle(String s) {
            StringBuilder sb = new StringBuilder();
            char[] chars = s.toCharArray();
            boolean f = false;
            int n = 1;
            int i = 0;
            while (i < chars.length-1) {
                while (i < chars.length-1 && chars[i] == chars[i+1] ){
                    n++;
                    i++;
                }
                sb.append(n);
                sb.append(chars[i]);
                n=1;
                if (i == chars.length-1) break;
                i++;
            }
            if (chars[i] != chars[i-1]){
                sb.append(1);
                sb.append(chars[i]);
            }
            return sb.toString();
        }
    }

