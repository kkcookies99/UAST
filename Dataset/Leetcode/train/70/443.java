    public int XXX(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int[] dpTable = new int[n + 1];
        dpTable[0] = 1;
        dpTable[1] = 1;
        for (int i = 2; i < dpTable.length; i++) {
            dpTable[i] = dpTable[i - 1] + dpTable[i - 2];
        }
        return dpTable[dpTable.length - 1];
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


