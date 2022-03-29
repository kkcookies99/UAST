 class Solution {
    public String XXX(int num) {
        HashMap<Integer, Character> map = new HashMap<>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        StringBuilder sb = new StringBuilder();
        int c = 1, count = 0;
        while(num != 0){
            int n = num % 10 * c;
            c *= 10;
            num = num / 10;
            if(n < c / 2){
                count = n / (c / 10);
                if(count == 4){
                    sb.append(map.get(c / 2));
                    sb.append(map.get(c / 10));
                } else{
                    for(int i = 0; i < count; ++i) sb.append(map.get(c / 10));
                }
            } else{
                count = 5 - (c - n) / (c / 10);
                if(count == 4){
                    sb.append(map.get(c));
                    sb.append(map.get(c / 10));
                } else{
                    for(int i = 0; i < count; ++i) sb.append(map.get(c / 10));
                    sb.append(map.get(c / 2));
                }
            }
        }
        return sb.reverse().toString();
    }
}
