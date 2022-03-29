   public int XXX(String s) {
   
    if (s == null || s.length() == 0)    return -1;

    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    
    int len = s.length();
    int result = map.get(s.charAt(s.length()-1));//初始化第一个数为字符串最后一个字符
    for(int i = len - 2; i >=0 ; i--){//从倒数第二个字符开始遍历
        //如果当前字符代表的数字小于其后面的数字，则用总和 - 这个数字
        if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
            result -= map.get(s.charAt(i));
        }else {
            result += map.get(s.charAt(i));
        }
    }
    return result;
}

