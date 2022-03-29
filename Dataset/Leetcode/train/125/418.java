  public boolean XXX(String s) {
         if (s == null) {
            return true;
        }
        boolean flag = true;
        for (int begin = 0, end = s.length() - 1; begin < s.length() && end >= 0 && begin < end; begin++, end--) {
            while (begin < s.length() && !Character.isLetterOrDigit(s.charAt(begin))) {
                begin++;
            }
            if (begin >= s.length()) {
                break;
            }
            while (end >= 0 && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (end < 0) {
                break;
            }
            if (Character.toLowerCase(s.charAt(begin)) != Character.toLowerCase(s.charAt(end))) {
                flag = false;
                break;
            }
        }
        return flag;
    }

