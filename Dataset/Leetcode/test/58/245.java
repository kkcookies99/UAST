 public int XXX(String s) {
        s = s.trim();
        int index = s.lastIndexOf(" ");
        return index != -1 ? s.substring(index+1).length() : s.length();
    }

