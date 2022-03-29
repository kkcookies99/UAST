 class Solution {
    public int XXX(String s) {
        int[] roma = new int[128];
        roma['I'] = 1;
        roma['V'] = 5;
        roma['X'] = 10;
        roma['L'] = 50;
        roma['C'] = 100;
        roma['D'] = 500;
        roma['M'] = 1000;
        char[] str = s.toCharArray();
        int last = 0, result = 0;
        for(int i = 0; i < str.length; i++){
            int tmp = roma[str[i]];
            if(tmp > last){
                result -= 2 * last;
            }
            result += tmp;
            last = tmp;
        }
        return result;
    }
}

