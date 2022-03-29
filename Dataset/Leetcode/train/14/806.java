 public String XXX(String[] strs) {
       String maxPre = "";int max=0;
        if (strs.length<1){
            return "";
        }
        if (strs.length==1){
            return strs[0];
        }
        for (String str:strs){
             if (str.length()==0){
                return "";
            }
            if (maxPre.length()==0){
                maxPre = str;
                max = str.length();
                continue;
            }else{
                if (str.equals(maxPre)){
                    max = maxPre.length();
                    continue;
                }
                int maxL = 0;
                for (int i=0;i<str.length();i++){
                    if (i<maxPre.length() && str.startsWith(maxPre.substring(0,i+1))  ){
                        maxL = Math.min(max, i + 1);
                        if (i==str.length()-1){
                            maxPre = maxPre.substring(0,i+1);
                            max = maxL;
                        }
                        continue;
                    }
                    if (i!=0){
                        max = maxL;
                        maxPre = maxPre.substring(0,i);
                        break;
                    }else{
                        return "";
                    }
                }
            }
        }
        return max>0?strs[0].substring(0,max):"";
    }

