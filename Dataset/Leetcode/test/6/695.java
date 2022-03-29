 public String XXX(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        int value=numRows*2-2;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            int v1=value-2*i;
            int v2=value-v1;
            int j=i;
            boolean flag=false;
            while(j<s.length()){
                char c=s.charAt(j);
                res.append(c);
                if(i==0||i==numRows-1){
                    j+=value;
                }else{
                    if(!flag){
                        j+=v1;
                    }else{
                        j+=v2;
                    }
                    flag=!flag;
                }
            }
        }
        return res.toString();
    }

