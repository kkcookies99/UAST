 class Solution {
    public String XXX(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        int d = '0';
        int x=charsA.length-1,y=charsB.length-1;
        StringBuilder sb = new StringBuilder();
        while (x>=0&&y>=0){
            char ac = charsA[x];
            char bc = charsB[y];
            int addRe = addChar(ac,bc,d);
            sb.append(addRe%2);
            d= addRe/2+'0';
            
            x--;
            y--;
        }
        while (x>=0){
            char ac = charsA[x];
            int addRe = addChar(ac,'0',d);
            sb.append(addRe%2);
            d= addRe/2+'0' ;

            x--;
        }

        while (y>=0){
            char ac = charsB[y];
            int addRe = addChar(ac,'0',d);
            sb.append(addRe%2);
            d= addRe/2+'0';

            y--;
        }
                if (d>'0'){
            sb.append(1);
        }
        return sb.reverse().toString();
        
    }

    private int addChar(char ac, char bc, int d) {
        return (ac-'0')+(bc-'0')+(d-'0');
        
    }
}

