 class Solution {
    public String XXX(String[] strs) {
        ArrayList<Object> list = new ArrayList<>();
        String s= "";
        char temp;
//        boolean Flag = true;
        int min=strs[0].length();
        int min_i=0;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length()<min){
                min=strs[i].length();
                min_i=i;
            }
        }
        outer:
        while (true) {
            for(int w=0;w<strs[min_i].length();w++){
                temp = strs[min_i].charAt(w);
                for (int i = 0; i < min_i; i++) {
                    if (temp != strs[i].charAt(w)) {
                        break outer;
                    }
                }
                for(int i=min_i+1;i<strs.length;i++){
                    if (temp != strs[i].charAt(w)) {
                        break outer;
                    }
                }
                list.add(temp);
            }
            break;
        }
        for(Object s1:list){
            s=s+s1;
        }
        return s;
    }

}

