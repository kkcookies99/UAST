 public boolean XXX(String s) {
         if (s.equals(""))
            return true;
        while (true) {
            int length = s.length();
            s = s.replace("()", "");
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            if (length == s.length())
                break;
        }
        return s.length() == 0;
    }

