 public boolean XXX(String s) {
        if(s == null){
            return true;
        }
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z'){
                char c = (char)(s.charAt(i) + 32);
                str.append(String.valueOf(c));
            }else{
                str.append(String.valueOf(s.charAt(i)));
            }
        }
        String res = str.toString();
        int l = 0, r = s.length() - 1;
        while(l < r){
            if( (('a' <= res.charAt(l) && res.charAt(l) <= 'z') 
                && ('a' <= res.charAt(r) && res.charAt(r) <= 'z'))){
                if(res.charAt(l) == res.charAt(r)){
                    l++;
                    r--;
                }else{
                    return false;
                }
            }else if('a' <= res.charAt(l) && res.charAt(l) <= 'z'){
                if(48 <= res.charAt(r) && res.charAt(r) <= 57){
                    return false;
                }
                r--;
            }else if('a' <= res.charAt(r) && res.charAt(r) <= 'z'){
                if(48 <= res.charAt(l) && res.charAt(l) <= 57){
                    return false;
                }
                l++;
            }else{
                if((48 <= res.charAt(l) && res.charAt(l) <= 57) && 
                    (48 <= res.charAt(r) && res.charAt(r) <= 57)){   
                    if(res.charAt(l) == res.charAt(r)){
                        l++;
                        r--;
                    }else {
                        return false;
                    }
                }else if(48 <= res.charAt(l) && res.charAt(l) <= 57){
                    r--;
                }else if(48 <= res.charAt(r) && res.charAt(r) <= 57){
                    l++;
                }else{
                    l++;
                    r--;
                }
            }
        }
        return true;
    }

