 class Solution {
    public String XXX(String[] strs) {
        // 100%,89%
        // if(strs.length==0||strs==null)return "";
        // String str=strs[0];
        // int left=0,right=str.length();
        // for(int i=1;i<strs.length;++i){
        //     if(!strs[i].startsWith(str)){
        //         if(right-- == 0)return "";
        //         i--;
        //         str=strs[0].substring(0,right);
        //     }
        // }
        // return str;

        // 88.35%,98.90%
        if(strs.length==0||strs==null)return "";
        char[] chr=strs[0].toCharArray();
        int right=strs[0].length();
        
        for(int i=1;i<strs.length;++i){
            right=check(chr,strs[i],right);
            if(right==0)return "";
        }
        return new String(chr,0,right);
    }
    
    public int check(char[] ch,String str,int right){
        int i=0;
        for(i=0;i<right&&i<str.length();++i){
            if(ch[i]!=str.charAt(i))return i;
        }
        return i;
    }
}```

