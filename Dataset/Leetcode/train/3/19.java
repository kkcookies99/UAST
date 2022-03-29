 class Solution {
    public int XXX(String s) {
        int length = 0;
        int begin = 0;
        int tempLength = 0;
        int index = 0;
        int size = s.length();
        Map<Character, Integer> map = new HashMap<>();
        while (index < size) {
            char point = s.charAt(index);
            if (map.containsKey(point)) {
                int mapindex = map.get(point);
                if (mapindex >= begin) {
                    tempLength = index - mapindex;
                    begin = mapindex + 1;
                    if (begin + length > size) {
                        break;
                    }
                } else {
                    tempLength++;
                    if (length < tempLength) {
                        length = tempLength;
                    }
                }
            } else {
                tempLength++;
                if (length < tempLength) {
                    length = tempLength;
                }
            }
            map.put(point, index);
            index++;
        }

        return length;
    }
}

