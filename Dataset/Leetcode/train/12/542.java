 class Solution {
    public String XXX(int num) {
        
        int len = ("" + num).length();
        int[] arr = new int[len];

        String res = "";
        String[][] list =
                {{"I", "V", "X"}, {"X", "L", "C"}, {"C", "D", "M"}, {"M", "", ""}};
        String[] listCur = null;
        String zero = "";
        String one = "";
        String five = "";
        String ten = "";
        int n = 1;
        for (int i = 0; i < len; i++, n *= 10) {
            arr[i] = num / n % 10;
            int curVal = num / n % 10;
            System.out.println(curVal);
            listCur = list[i];
            one = listCur[0];
            five = listCur[1];
            ten = listCur[2];
            listCur = list[i];
            String curRom = "";
            switch (curVal){
                case(1): curRom = one;break;
                case(2): curRom = one+one;break;
                case(3): curRom = one+one+one;break;
                case(4): curRom = one+five;break;
                case(5): curRom = five;break;
                case(6): curRom = five+one;break;
                case(7): curRom = five+one+one;break;
                case(8): curRom = five+one+one+one;break;
                case(9): curRom = one+ten;break;
            }
            res = curRom + res;
        }
        return res;
    }
}

