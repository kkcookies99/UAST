 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle.length()==0) return 0;
        if(needle.length()>haystack.length()) return -1;
        char[] ch1 = haystack.toCharArray();
        char[] ch2 = needle.toCharArray();
        int[] nextArr = getNextArr(ch2);
        int i=0;
        int j=0;
        while (i<ch1.length&&j<ch2.length){

            if(ch1[i]==ch2[j]){
                i++;
                j++;
            }else if(nextArr[j]==-1){
                i++;
            }else {
                j=nextArr[j];
            }
        }
        return j==ch2.length?i-j:-1;
    }

      public static int [] getNextArr(char[] chs){
        if(chs.length==1)return new int []{-1};
        int [] next=new  int [chs.length];
        next[0]=-1;
        next[1]=0;
        int cn=0;
        int index=2;
        while (index<next.length){
            if(chs[cn]==chs[index-1]){
                next[index++]=++cn;
            }else if(cn!=0){
                cn=next[cn];
            }else {
                next[index++]=0;
            }
        }
        return  next;
    }
}

