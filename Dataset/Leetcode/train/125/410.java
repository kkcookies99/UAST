 public boolean XXX(String s) {
        String tmp = "";
        for(int i = 0;i < s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                tmp += s.charAt(i);
            }
        }
        tmp = tmp.toUpperCase();
        for (int i = 0;i < tmp.length()/2;i++){
            if (tmp.charAt(i) != tmp.charAt(tmp.length()-1-i)){
                return false;
            }
        }
        return true;
    }


