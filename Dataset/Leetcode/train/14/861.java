  public String XXX(String[] strs) {
        int min=Integer.MAX_VALUE;
        for(String str:strs){
            min=Math.min(min,str.length());
        }
        StringBuilder sb=new StringBuilder();
        c:
        for(int i=0;i<min;i++){
            char ch=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=ch){
                    break c;
                }
            }       
            sb.append(strs[0].charAt(i));           
        }
        return sb.toString();
    }

