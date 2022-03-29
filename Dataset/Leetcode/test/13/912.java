 class Solution {
    public int XXX(String s) {
        HashMap<Character,Integer> maps = new HashMap<Character,Integer>(); 
        maps.put('I',1);
        maps.put('V',5);
        maps.put('X',10);
        maps.put('L',50);
        maps.put('C',100);
        maps.put('D',500);
        maps.put('M',1000);
        int sum = 0;
        for(int i = 0;i < s.length()-1;i++){
            if (maps.get(s.charAt(i)) < maps.get(s.charAt(i+1))){
                sum -= maps.get(s.charAt(i));
            }else{
                sum += maps.get(s.charAt(i));
            }
        };
        sum += maps.get(s.charAt(s.length()-1));
        return sum;
    }
}

