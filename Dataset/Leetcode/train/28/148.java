 class Solution {
    public int XXX(String haystack, String needle) {       
        int m = needle.length();
        if(m==0) return 0;
        int n = haystack.length();
        int i=0;
        int[] bc = buildBC(needle);
        while(i+m<=n){
            int j = m-1;
            while(haystack.charAt(i+j)==needle.charAt(j)){
                if(--j<0) break;
            }
            if(j<0) break;
            else{
                int tmp = j-bc[haystack.charAt(i+j)-'a'];
                i += tmp>0?tmp:1;
            }
        }
        return i>n-m?-1:i;
    }
    int[] buildBC(String t){
        int len = t.length();
        char[] c = t.toCharArray();
        int[] bc = new int[26];
        Arrays.fill(bc,-1);
        for(int i=0;i<len;i++){
            bc[c[i]-'a']=i;
        }
        return bc;
    }
}

