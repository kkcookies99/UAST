public String XXX(int n) {
        if(n == 1){
            return "1";
        }
        String str = XXX(n - 1);
        int count = 0;
        char ch = ' ';
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(count > 0 && ch != str.charAt(i)){
                sb.append(count).append(ch);
                ch = str.charAt(i);
                count = 1;
            }else if(ch != str.charAt(i)){
                ch = str.charAt(i);
                count = 1;
            }else{
                count++;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }

