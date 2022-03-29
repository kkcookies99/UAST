     public String XXX(String[] strs) {
        int index=0;
        String temp = strs[0];
        StringBuilder sb=new StringBuilder();
        try {
            while (true) {
                for (int i = 0; i < strs.length - 1; i++) {
                    if ((strs[i].charAt(index)) == strs[i + 1].charAt(index)) {
                        temp=strs[i];
                    } else {
                        return sb.toString();
                    }
                }
                sb.append(temp.charAt(index));
                index++;
            }
        }catch (Exception e){
            return sb.toString();
        }
    }

