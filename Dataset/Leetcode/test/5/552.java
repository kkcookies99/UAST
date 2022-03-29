     public String XXX(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++){
            String so;
            String sr;
            for(int j = i+1+res.length(); j <= s.length(); j++){
                if(s.charAt(i) == s.charAt(j-1)){
                    so = s.substring(i,j);
                    sr = new StringBuilder(s.substring(i,j)).reverse().toString();
                    if(sr.equals(so)){
                        if(so.length()>res.length()){
                            res = so;
                        }
                    }
                }
            }
        }
        return res;
    }

