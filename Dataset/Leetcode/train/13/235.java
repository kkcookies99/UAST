public int XXX(String s) {
    Map<Character, Integer> dict = new HashMap<>();
    dict.put('I', 1);
    dict.put('V', 5);
    dict.put('X', 10);
    dict.put('L', 50);
    dict.put('C', 100);
    dict.put('D', 500);
    dict.put('M', 1000);
    
    int prev = 0, sum = 0;
    for(int i = s.length() - 1; i >= 0; i--){
        int val = dict.get(s.charAt(i));
        if(val >= prev || sum == 0)
            sum += val; //加
        else
            sum -= val; //减
        prev = val;
    }
    return sum;
}
