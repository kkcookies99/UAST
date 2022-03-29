class Solution {
    public String XXX(String a, String b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean added = false;
        while (true) {
            int ai = a.length() - 1 - i;
            int bi = b.length() - 1 - i;
            if (ai >= 0 || bi >= 0) {
                char ac = '0', bc = '0';
                if (ai >= 0) {
                    ac = a.charAt(ai);
                }
                if (bi >= 0) {
                    bc = b.charAt(bi);
                }
                added = cal(ac, bc, added, sb);
            } else {
                if (added) {
                    sb.append('1');
                }
                break;
            }
            i++;
        }
        return sb.reverse().toString();
    }

    private boolean cal(char ac, char bc, boolean added, StringBuilder sb) {
        if (ac == '1' && bc == '1') {
            sb.append(added ? '1' : '0');
            return true;
        } else if (ac == '1' || bc == '1') {
            sb.append(added ? '0' : '1');
            return added;
        } else {
            sb.append(added ? '1' : '0');
            return false;
        }
    }
}

