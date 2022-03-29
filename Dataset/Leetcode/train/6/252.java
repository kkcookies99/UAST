 class Solution {
    public String XXX(String s, int numRows) {
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0; i < sbs.length; i++)
            sbs[i] = new StringBuilder();
        int idx = 0;
        int next = 1;
        for (int i = 0; i < s.length(); i++) {
            sbs[idx].append(s.charAt(i));
            if (idx == numRows - 1)
                next = -1;
            else if (idx == 0)
                next = 1;
            idx = idx + next;
            idx = Math.max(0, idx);
            idx = Math.min(numRows - 1, idx);
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sbs.length; i++)
            res.append(sbs[i]);
        return res.toString();
    }
}

