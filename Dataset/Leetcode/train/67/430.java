class Solution {
    public String XXX(String a, String b) {
        if (a.equals("0"))
            return b;
        if (b.equals("0"))
            return a;

        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        StringBuilder result = new StringBuilder();
        boolean next = false;
        while (true) {
            if (aIndex < 0 && bIndex < 0) break;

            int intA = 0;
            int intB = 0;
            if (aIndex >= 0) {
                intA = Integer.parseInt(String.valueOf(a.charAt(aIndex)));
                aIndex--;
            }
            if (bIndex >= 0) {
                intB = Integer.parseInt(String.valueOf(b.charAt(bIndex)));
                bIndex--;
            }

            int r = intA + intB + (next ? 1 : 0);
            if (r == 2) {
                r = 0;
                next = true;
            } else if (r == 3) {
                r = 1;
                next = true;
            } else {
                next = false;
            }

            result.insert(0, r);
        }
        if (next) {
            result.insert(0, 1);
        }

        return result.toString();
    }

}


