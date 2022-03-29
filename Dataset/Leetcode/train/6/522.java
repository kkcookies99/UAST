 class Solution {
    public String XXX(String s, int numRows) {
        if(s == null || s.length() == 0 || numRows == 1) return s;
        List<StringBuilder> res = new ArrayList();
        for(int i = 0 ; i < numRows ; i++){
            res.add(new StringBuilder());
        }
        int index = 0;
        char[] ch = s.toCharArray();
        int line = 0;
        boolean down = true;
        while(index < ch.length) {
            if(down){
                res.get(line).append(ch[index]);
                index++;
                if(line == numRows - 1){
                    down = false;
                    line--;
                    continue;
                }
                line++;
            }else{
                res.get(line).append(ch[index]);
                index++;
                if(line == 0){
                    down = true;
                    line++;
                    continue;
                }
                line--;
            }
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder sb : res){
            result.append(sb);
        }
        return result.toString();
    }
}

