 class Solution {
    public String XXX(int num) {
        byte[] bytes = Integer.toString(num).getBytes();
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (bytes[i] - 48);
        }
        Map<Integer, String> XXXMap = new HashMap<>();
        XXXMap.put(1, "I");      XXXMap.put(5, "V");
        XXXMap.put(10, "X");     XXXMap.put(50, "L");
        XXXMap.put(100, "C");    XXXMap.put(500, "D");
        XXXMap.put(1000, "M");   XXXMap.put(4, "IV");
        XXXMap.put(9, "IX");     XXXMap.put(40, "XL");
        XXXMap.put(90, "XC");    XXXMap.put(400, "CD");
        XXXMap.put(900, "CM");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            int level = (int) Math.pow(10, bytes.length - i - 1);  // 数量级别
            if (bytes[i] == 4 || bytes[i] == 9) {
                stringBuilder.append(XXXMap.get(bytes[i] * level));
            } else if (bytes[i] < 4) {
                for (byte j = 0; j < bytes[i]; j++) {
                    stringBuilder.append(XXXMap.get(level));
                }
            } else if (bytes[i] < 9) {
                stringBuilder.append(XXXMap.get(5 * level));
                for (byte j = 0; j < bytes[i] - 5; j++) {
                    stringBuilder.append(XXXMap.get(level));
                }
            }
        }
        return stringBuilder.toString();
    }
}

