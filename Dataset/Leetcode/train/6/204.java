 class Solution {
    public String XXX(String s, int numRows) {
        if(s.length()==1||numRows==1||numRows==0||s.length()==0)return s;
         ArrayList<Character> ls[]= new ArrayList[numRows];
            for(int i=0;i<numRows;i++)
                ls[i] = new ArrayList();
            char[] sc= s.toCharArray();
            int l = 2*numRows-2;
            int m = 0;
            for(int i=0; i<sc.length; i++){
                m = i%(l);
                if (m<numRows) ls[m].add(sc[i]);
                else ls[l-m].add(sc[i]);
            }
            StringBuilder sb= new StringBuilder();
            for(List<Character> lss:ls){
                for(char lssc:lss){
                    sb.append(lssc);
                }
            }
            return sb.toString();
    }
}

