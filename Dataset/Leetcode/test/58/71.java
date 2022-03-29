     public int XXX(String s) {
        s=s.trim();
        if (s.length()==0)return 0;
        return s.length()-1-s.lastIndexOf(" ");
    }

