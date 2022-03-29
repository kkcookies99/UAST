 public int XXX(String s) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.lastIndexOf(" ")==sb.length()-1) {
            sb.replace(sb.length()-1,sb.length(),"");
        }

        int index = sb.lastIndexOf(" ");
        int res = sb.length() - index - 1;
        return res;
    }

