 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle==null || needle.length()==0) {
            return 0;
        }
        else if(haystack==null || haystack.length()==0) {
            return -1;
        }
        return KmpSearch(haystack, needle);
    }

    public int KmpSearch(String T, String P) {
        int[] perfixTable = BuildPrefixTable(P);
        int n = T.length(), m = P.length();
        int i = 0, j = 0;
        while(i<n && j<m) {
            if(T.charAt(i)==P.charAt(j)) {
                i++; j++;
            }
            else {
                j = perfixTable[j];
                if(j<0) {
                    i++; j++;
                }
            }
        }
        return j<m? -1: i-j;
    }

    public int[] BuildPrefixTable(String P) {
        int m = P.length();
        int[] perfixTable = new int[m];
        perfixTable[0] = 0;
        int len = 0, i = 1;
        while(i<m) {
            if(P.charAt(len)==P.charAt(i)) 
                perfixTable[i++] = ++len;
            else {
                if(len>0) len = perfixTable[len-1];
                else perfixTable[i++] = len;
            }
        }
        for(i=m-1; i>0; i--) 
            perfixTable[i] = perfixTable[i-1];
        perfixTable[0] = -1;
        return perfixTable;
    }
}

