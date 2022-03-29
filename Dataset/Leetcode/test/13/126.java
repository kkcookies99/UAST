public int XXX(String s) {
    Map<Character,Integer> romanMap = new HashMap<>();
    romanMap.put('I',1);
    romanMap.put('V',5);
    romanMap.put('X',10);
    romanMap.put('L',50);
    romanMap.put('C',100);
    romanMap.put('D',500);
    romanMap.put('M',1000);
    int res = 0;
    do {
        Character c1 = s.charAt(0);
        Character c2 = s.length()>1 ? s.charAt(1) : null;
        int len = 1;
        if (c2 != null && ((c1 == 'I' && (c2 == 'V' || c2 == 'X')) || (c1 == 'X' && (c2 == 'L'|| c2 == 'C')) || (c1 == 'C' && (c2 == 'D'|| c2 == 'M')))){
            len = 2;
        }

        if (len == 1){
            res += romanMap.get(c1);
        }else {
            res += romanMap.get(c2) - romanMap.get(c1);
        }
        s = s.substring(len,s.length());
    }while (s.length()>=1);
    return res;
}
