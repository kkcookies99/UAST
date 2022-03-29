 public int XXX(String s) {
    Map<Character, Integer> map = new HashMap<>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);

    int num = 0;
    // 全部直接加起来
    for(int i = 0; i < s.length(); i++){
        num += map.get(s.charAt(i));
    }

    //两倍扣除回去
    for(int i = 0; i < s.length() - 1; i++){
        char c = s.charAt(i);
        char c_next = s.charAt(i + 1);
        if((c == 'I' && c_next == 'V') || (c == 'I' && c_next == 'X')){
            num -= 2;
        }else if((c == 'X' && c_next == 'L') || (c == 'X' && c_next == 'C')){
            num -= 20;
        }else if((c == 'C' && c_next == 'D') || (c == 'C' && c_next == 'M')){
            num -= 200;
        }
    }

    return num;
}

