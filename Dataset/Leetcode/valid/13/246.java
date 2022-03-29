class Solution {
    public int XXX(String s) {
        char[] match = new char[256];
        match['I'] = 1;
        match['V'] = 5;
        match['X'] = 10;
        match['L'] = 50;
        match['C'] = 100;
        match['D'] = 500;
        match['M'] = 1000;
        int result = 0;
        char lastChar = 0;
        for(char c : s.toCharArray()) {
            if (lastChar == 0 || match[lastChar] >= match[c]) {
                lastChar = c;
                result += match[c];
            } else {
                result += (match[c] - 2 * match[lastChar]);
                lastChar = 0;
            }
        }
        return result;
    }
}

