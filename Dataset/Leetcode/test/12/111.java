 class Solution {
    public String XXX(int num) {
        TreeMap<Integer,String> map = new TreeMap<>((a,b)->(b-a));
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(1000,"M");
        
        StringBuilder sb = new StringBuilder();
        for (Integer i:map.keySet()) {
            while (num-i>=0) {
                num-=i;
                sb.append(map.get(i));
            }
        }
        return sb.toString();
    }
}

