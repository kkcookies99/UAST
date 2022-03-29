 public String XXX(String a, String b) {
        StringBuilder sbuilder = new StringBuilder();
        int al = a.length()-1;
        int bl = b.length()-1;
        int carry = 0;
        while(al >=0 || bl>=0 || carry >0){
            if(al >=0){
                carry += a.charAt(al--)-'0';
            }
            if(bl >= 0){
                carry += b.charAt(bl--)-'0';
            }
            sbuilder.append(carry%2);
            carry = carry / 2;
        }
        return sbuilder.reverse().toString();
    }

