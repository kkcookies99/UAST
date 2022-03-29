class Solution {
   public int XXX(String s) {
          s = s.trim();
        if (s .equals("")){
            return 0;
        }
        char[] ch = toCharArray(s);
        int length = ch.length;

        int flag = 1;
        long sum = 0;
      

        for (int i = 0; i < length; i++) {
            if (ch[i] == '-' && i == 0) {
                flag = -1;
                continue;
            }
            if (ch[i] == '+'&& i == 0) {
                flag = 1;
                continue;
            }
            if (ch[i] >= '0' && ch[i] <= '9') {
                sum = (ch[i] - '0') + sum * 10;
            } else break;

            if (-sum <= -2147483648 && ch[0] == '-') return -2147483648;
            if (sum >= 2147483647 && ch[0] != '-') return 2147483647;
        }


        return (int) sum * flag;

    }

    public char[] toCharArray(String s) {

        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        return ch;
    }
}

