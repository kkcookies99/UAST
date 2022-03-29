 class Solution {
    public int XXX(String haystack, String needle) {
        if(needle == null)
            return -1;
        if(needle.isEmpty())
            return 0;
        return kmp(haystack, needle);
    }

    private final static int TOP_OF_ASCII = 256;

    public static int kmp(String text, String pattern){
        int[][] dfa = new int[pattern.length()][TOP_OF_ASCII];
        int prevState = 0;
        dfa[0][pattern.charAt(0)] = 1;
        for(int j=1,length=pattern.length(); j<length; j++){
            for(int character=0; character<TOP_OF_ASCII; character++)
                dfa[j][character] = dfa[prevState][character];
            dfa[j][pattern.charAt(j)] = j + 1;
            prevState = dfa[prevState][pattern.charAt(j)];
        }
        int currentState = 0;
        for(int i=0, length=text.length(); i<length; i++){
            currentState = dfa[currentState][text.charAt(i)];
            if(currentState == pattern.length())
                return i + 1 - currentState;
        }
        return -1;
    }
}

