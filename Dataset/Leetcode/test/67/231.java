     public String XXX(String a, String b) {
            int t = 0;
            int i = a.length() - 1;
            int j = b.length() - 1;
            StringBuilder builder = new StringBuilder();
            while(t != 0 || i >= 0 || j >= 0 ){
                if(i >= 0) t += a.charAt(i--) - '0'; 
                if(j >= 0 ) t += b.charAt(j--) - '0';
                builder.append(t % 2);
                t /= 2;
            }
        return builder.reverse().toString();
    }

