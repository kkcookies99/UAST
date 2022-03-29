 class Solution {
    public String XXX(int num) {
        Map<Integer,String> map=new TreeMap<>((o1, o2) -> {
            return o2-o1;
        });
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
        StringBuilder sb=new StringBuilder();
        for (Map.Entry<Integer,String> m:map.entrySet()
             ) {
            int val = m.getKey();
            while(num>=val){
                num-=val;
                sb.append(m.getValue());
            }
        }
        return sb.toString();
    }
}

