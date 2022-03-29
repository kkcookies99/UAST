  /**
     * Manacher Main
     *
     * @param str
     * @return
     */
    private int[] maxLcpsLength(String str) {
        char[] chas = manacherString(str);
        int[] pArr = new int[chas.length];
        int pR = -1;
        int index = 0;
        int max = Integer.MIN_VALUE;
        int center = 0;
        for (int i = 0; i < chas.length; i++) {
            pArr[i] = pR > i ? Math.min(pR - i, pArr[2 * index - i]) : 1;
            while (i + pArr[i] < chas.length && i - pArr[i] > -1) {
                if (chas[i + pArr[i]] == chas[i - pArr[i]]) {
                    pArr[i]++;
                } else {
                    break;
                }
            }
            if (i + pArr[i] > pR) {
                pR = i + pArr[i];
                index = i;
            }
            if (pArr[i] > max) {
                max = pArr[i];
                center = i;
            }
        }
        return new int[]{center, max - 1};
    }

    /**
     * 生成带符号的字符char[] bcbaa-->#b#c#b#a#a#
     *
     * @param str
     * @return
     */
    private char[] manacherString(String str) {
        char[] chas = str.toCharArray();
        char[] resChar = new char[chas.length * 2 + 1];
        int index = 0;
        for (int i = 0; i < resChar.length; i++) {
            resChar[i] = (i & 1) == 0 ? '#' : chas[index++];
        }
        return resChar;
    }


    public String XXX(String str) {

        char[] chas = manacherString(str);
        int[] params = maxLcpsLength(str);
        StringBuilder sb = new StringBuilder();
        for (int i = params[0] - params[1]; i <= params[0] + params[1]; i++) {
            if (chas[i] == '#') {
                continue;
            }
            sb.append(chas[i]);
        }

        return sb.toString();
    }

