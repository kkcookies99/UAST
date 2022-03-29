public String XXX(int n) {
        if(n == 1)
            return "1";
        else{
            String str = XXX(n - 1);
            StringBuffer sb = new StringBuffer();
            char pre = '0';
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != pre){
                    sb.append(count);
                    sb.append(pre);
                    count = 0;
                    pre = str.charAt(i);
                }
                count ++;
            }
            sb.append(count);
            sb.append(pre);

            return sb.substring(2);
        }
    }

