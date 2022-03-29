 public String XXX(String[] strs) {
        if(strs.length==0) return "";
        Arrays.sort(strs);
        StringBuffer buffer = new StringBuffer();
        for(int i=0;i<strs[0].length();i++){
            if(strs[0].charAt(i)==strs[strs.length-1].charAt(i)){
                buffer.append(strs[0].charAt(i));
            }else{
                break;
            }
        }
        return buffer.toString();
    }

