 public boolean XXX(String s) {
        if (s == null){
            return false;
        }
        char[] chars = s.toCharArray();
        int i = 0,j=chars.length-1;
        while(i<j){

            char a = chars[i];
            if (!Character.isLetterOrDigit(a)){
                i++;
                continue;
            }
            char b = chars[j];
            if (!Character.isLetterOrDigit(b)){
                j--;
                continue;
            }

            if (Character.toUpperCase(a) != Character.toUpperCase(b)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

