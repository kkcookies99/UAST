 class Solution {
    public boolean XXX(String s) {
        if (s.isEmpty()) {
            return true;
        }

        Map<Character, Set<Character>> map = new HashMap<>();
        for (char i = 'a'; i <= 'z'; i++) {
            map.computeIfAbsent(i, k -> new HashSet<>());
            map.computeIfAbsent((char) (i - 32), k -> new HashSet<>());

            map.get(i).add((char) (i - 32));
            map.get(i).add(i);
            map.get((char) (i - 32)).add(i);
            map.get((char) (i - 32)).add((char) (i - 32));
        }
        System.out.println(map);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (checkIfLetter(s.charAt(i)) || checkIfNumber(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }
        int len = sb.length() / 2 - 1;
        for (int i = 0; i <= len; i++) {
            if (checkIfNumber(sb.charAt(i))) {
                if (sb.charAt(i) != sb.charAt(sb.length() - i - 1)) {
                    return false;
                }
            } else {
                if (!map.get(sb.charAt(i)).contains(sb.charAt(sb.length()-i-1))) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkIfLetter(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }

        return c >= 'a' && c <= 'z';
    }

    private boolean checkIfNumber(char c) {
        return c >= '0' && c <= '9';
    }
}

