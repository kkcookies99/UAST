 public int XXX(String s) {
        if(s.length() == 0){
            return 0;
        }
        if(s.startsWith("M")){
            return 1000 + XXX(s.substring(1));
        }
        if(s.startsWith("CM")){
            return 900 + XXX(s.substring(2));
        }
        if(s.startsWith("D")){
            return 500 + XXX(s.substring(1));
        }
        if(s.startsWith("CD")){
            return 400 + XXX(s.substring(2));
        }
        if(s.startsWith("C")){
            return 100 + XXX(s.substring(1));
        }
        if(s.startsWith("XC")){
            return 90 + XXX(s.substring(2));
        }
        if(s.startsWith("L")){
            return 50 + XXX(s.substring(1));
        }
        if(s.startsWith("XL")){
            return 40 + XXX(s.substring(2));
        }
        if(s.startsWith("X")){
            return 10 + XXX(s.substring(1));
        }
        if(s.startsWith("IX")){
            return 9 + XXX(s.substring(2));
        }
        if(s.startsWith("V")){
            return 5 + XXX(s.substring(1));
        }
        if(s.startsWith("IV")){
            return 4 + XXX(s.substring(2));
        }
        return 1 + XXX(s.substring(1));
    }

