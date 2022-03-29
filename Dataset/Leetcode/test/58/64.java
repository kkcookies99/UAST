 public int XXX(String s) {
        if(s.trim().equals(""))
            return 0;
        String[] s1 = s.split(" ");
        String s2 = s1[s1.length - 1];
        return s2.length();
    }

