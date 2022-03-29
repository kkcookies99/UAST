 class Solution {
    public String XXX(String[] strs) {
        int len=strs.length;
        if(len==0)return "";
        if(len==1)return strs[0];
        int min=0,max=0;
        for(int i=1;i<len;++i){
            if(strs[min].equals("")){
                return "";
            }
            if(strs[i].compareTo(strs[min])<0){
                min=i;
            }
            if(strs[i].compareTo(strs[max])>0){
                max=i;
            }
        }
        for(int i=strs[min].length();i>0;--i){
            String sub=strs[min].substring(0,i);
            if(strs[max].indexOf(sub)==0){
                return sub;
            }
        }
        return "";
    }
}

