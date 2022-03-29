 public int XXX(String haystack, String needle) {
        if(needle==null || needle.equals("")){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        List<Integer> list = new ArrayList<>();
        char temp = needle.charAt(0);
        for(int i=0 ; i<haystack.length() ; i++){
            if((haystack.length() - i)<needle.length()){
                break;
            }
            if(haystack.charAt(i)==temp){
                list.add(i);
            }
        }
        while(list.size()!=0){
            int index = list.remove(0);
            int next = 1;
            boolean flag = true;
            for(int j=index+1 ; j<haystack.length() && next<needle.length() ; j++){
                if(haystack.charAt(j)!=needle.charAt(next)){
                    flag = false;
                    break;
                }
                next++;
            }
            if(flag){
                return index;
            }
        }
        return -1;
    }

