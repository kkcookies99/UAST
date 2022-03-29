     public String XXX(String s) {
        if(s==null||s.length()==0)return "";
        String res = "";
        for(int i=0;i<s.length();i++){
            String temp1 = searchStr(s,i,i);
            String temp2 = searchStr(s,i,i+1);
            if(temp1.length()>temp2.length()){
                temp2 = temp1;
            }
            if(temp2.length()>res.length()){
                res = temp2;
            }
        }
        return res;
    }

    public String searchStr(String s,int left,int right){
        while(left>=0&&right<s.length()){
            if(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
            }else{
                break;
            }
        }
        return s.substring(left+1,right);
    }

