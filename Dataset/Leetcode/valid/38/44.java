class Solution {
    public String XXX(int n) {
        return solution(n - 1, "1");
    }

    public String solution(int index, String preString){
        StringBuilder ret = new StringBuilder();
        if(index <=0){
            return preString;
        }
        int count = 0;
        char tmp = preString.charAt(0);
        char[] pre = preString.toCharArray();
        for(char elem : pre){
            if(elem == tmp){
                count++;
                continue;
            }
            ret.append(count).append(tmp);
            count = 1;
            tmp = elem;
        }
        ret.append(count).append(tmp);
        return solution(index - 1, ret.toString());
    }
}

