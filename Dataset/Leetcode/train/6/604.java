 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows<=1){
            return s;
        }
        ArrayList<StringBuilder> a = new ArrayList<StringBuilder>();
        for(int i = 0;i<numRows;i++){
            a.add(new StringBuilder());
        }
        int j = 0;
        int min = -1;
        for(char b :s.toCharArray()){
            a.get(j).append(b);
            if(j == numRows-1||j == 0){
                min=-min;
            }
            j=j+min;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder c:a){
            res.append(c);
        }
        return res.toString();
    }
}

