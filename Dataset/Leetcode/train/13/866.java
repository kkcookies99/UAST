 class Solution {
    public int XXX(String s) {
        int res = 0;
        res += s.charAt(s.length()-1) == 'I' ? 1 : 0;
        res += s.charAt(s.length()-1) == 'V' ? 5 : 0;
        res += s.charAt(s.length()-1) == 'X' ? 10 : 0;
        res += s.charAt(s.length()-1) == 'L' ? 50 : 0;
        res += s.charAt(s.length()-1) == 'C' ? 100 : 0;
        res += s.charAt(s.length()-1) == 'D' ? 500 : 0;
        res += s.charAt(s.length()-1) == 'M' ? 1000 : 0;
        for(int i = 0; i < s.length() - 1; i++){
            switch(s.charAt(i)){
                case 'I': if(s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'){res -= 1;}else{res += 1;}break;
                case 'V': res += 5;break;
                case 'X': if(s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'){res -= 10;}else{res += 10;}break;
                case 'L': res += 50;break;
                case 'C': if(s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'){res -= 100;}else{res += 100;}break;
                case 'D': res += 500;break;
                case 'M': res += 1000;break;
            }
        }
        return res;
    }
}

