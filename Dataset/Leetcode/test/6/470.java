 class Solution {
    public String XXX(String s, int numRows) {
        if(s.length()<2 || numRows==1){
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        int flag=1;
        for(int i=0;i<numRows;i++){
            StringBuilder sb = new StringBuilder();
            list.add(sb);
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            list.get(j).append(s.charAt(i));
            if(i%(numRows-1)==0&&i!=0){
                flag=-flag;
            }
            j=j+flag;
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<list.size();i++){
            res.append(list.get(i));
        }
        return res.toString();

    }
}

