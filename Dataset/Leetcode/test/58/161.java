 public int XXX(String s) {
        int len = 0;
        boolean flag = false;
        for (int i=s.length()-1; i>=0; i--) {

            if (flag && s.charAt(i) == ' ') {
                break;
            }

            if (s.charAt(i) != ' ') {
                flag = true;
                len++;
            }
        }
        return len;
}

