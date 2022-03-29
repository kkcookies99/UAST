 public int XXX(String s) {
        int length = 0;
        StringBuffer sb = new StringBuffer();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (sb.indexOf(String.valueOf(aChar)) >= 0) {
                if (sb.length() > length) {
                    length = sb.length();
                }
                sb = new StringBuffer(sb.substring(sb.indexOf(String.valueOf(aChar))+1));
            }
            sb.append(aChar);
        }
        return sb.length() > length ? sb.length() : length;
    }

