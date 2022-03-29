 class Solution {
    public String XXX(int num) {
        int nl = String.valueOf(num).length();
        Map<Integer, String> map = new HashMap<>();
        map.put(1000, "M");
        map.put(500, "D");
        map.put(100, "C");
        map.put(50, "L");
        map.put(10, "X");
        map.put(5, "V");
        map.put(1, "I");
        int ys = num;
        int pow = (int) Math.pow(10, nl);
        StringBuilder sb = new StringBuilder();
        while (ys > 0) {
            pow /= 10;
            int c = ys / pow;
            ys = ys % pow;
            if (c + 1 == 10) {
                sb.append(map.get(pow));
                sb.append(map.get(pow * 10));
                continue;
            }
            if (c + 1 == 5) {
                sb.append(map.get(pow));
                sb.append(map.get(pow * 5));
                continue;
            }
            if (c >= 5) {
                sb.append(map.get(pow * 5));
                c -= 5;
            }
            while (c > 0) {
                sb.append(map.get(pow));
                c--;
            }
        }
        return sb.toString();
    }
}

