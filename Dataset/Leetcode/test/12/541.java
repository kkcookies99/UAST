 class Solution {
    public String XXX(int num) {
        
        int len = ("" + num).length();
        String res = "";
        String[][] list =
                {{"I", "V", "X"}, {"X", "L", "C"}, {"C", "D", "M"}, {"M", "", ""}};
        String[] listCur = null;
        String zero = "";
        String one = "";
        String five = "";
        String ten = "";
        String curRom = "";
        int n = 1;
        for (int i = 0; i < len; i++, n *= 10) {
            
            int curVal = num / n % 10;
            listCur = list[i];
            one = listCur[0];
            five = listCur[1];
            ten = listCur[2];
            
            switch (curVal){
                case(0):curRom = zero;break;
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

