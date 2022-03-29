  public String XXX(String[] strs) {

        String res = "";
        int curIndex = 0;
        Set<Character> set = new HashSet<>();

        while(true){
            for(int i=0;i<strs.length;i++){
                if(curIndex > strs[i].length()-1){
                    return res;
                }
                set.add(strs[i].charAt(curIndex));
            }

            if(set.size() == 1){
                res += String.valueOf(set.toArray()[0]);
                set.clear();
            }else{
                return res;
            }
            curIndex++;
        }

        
    }

