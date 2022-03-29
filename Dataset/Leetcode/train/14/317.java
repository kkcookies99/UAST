  public String XXX(String[] strs) {

        if(strs == null || strs.length == 0) {
            return "";
        }

        String comment = strs[0];
        boolean isEqual;
        int compareSize = comment.length();
        for(int i=1; i< strs.length; i++) {
            if(compareSize <= strs[i].length()){
                isEqual = strs[i].substring(0, compareSize).equals(comment);
                if(!isEqual){
                    if(compareSize > 1){
                        comment = strs[0].substring(0, --compareSize);
                        --i;
                    } else {
                        comment = "";
                    }
                }
            } else {
                compareSize = strs[i].length();
                comment = strs[0].substring(0, compareSize);
                --i;
            }
        }
        return comment;
    }

