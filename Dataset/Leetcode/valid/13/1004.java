 class Solution {
    public int XXX(String s) {
        int[] map = new int[22];
        map[6] = 1;
        map[19] = 5;
        map[21] = 10;
        map[9] = 50;
        map[0] = 100;
        map[1] = 500;
        map[10] = 1000;
        int result = 0;
        final byte[] bytes = s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            int current = map[(int) bytes[i] - 67];
            if (i < bytes.length - 1) {
                int next = map[(int) bytes[i + 1] - 67];
                if (current < next) {
                    current = next - current;
                    i++;
                }
            }
            result += current;
        }
        return result;
    }
}

