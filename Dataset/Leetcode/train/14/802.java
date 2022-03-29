 public String XXX(String[] strs) {
        int n = strs.length;
        String result = strs[0];
        for( int i = 1 ; i < n ; i++ ){
            if(result.length() > strs[i].length()){
                result = findPrefix(strs[i] , result);
            }else{
                result = findPrefix(result , strs[i]);
            }
            if(result.equals("")) return "";
        }
        return result;
    }
    public String findPrefix(String str1,String str2){
        int n = 0;
        for( int i = 0 ; i < str1.length() ; i++ ){
            if( str1.charAt(i) == str2.charAt(i) ){
                n++;
            }else{
                break;
            }
        }
        return str1.substring(0,n);
    }

