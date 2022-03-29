 class Solution {
    public String XXX(String s, int numRows) {
       if(numRows==1) return s;
        //ArrayList<Character> [] a=new ArrayList[numRows]; 
        List<ArrayList<Character>> a=new ArrayList<ArrayList<Character>>();  
        for(int i=0;i<numRows;i++){
            a.add(new ArrayList<Character>());
        }    
        for(int i=0;i<s.length();i++){
            int remainder=i%(2*(numRows-1));
            if(remainder>numRows-1) remainder=2*(numRows-1)-remainder;
            a.get(remainder).add(s.charAt(i));
        }
        StringBuffer sb=new StringBuffer();
        for(ArrayList<Character> list:a){        
            for(Character c:list){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

