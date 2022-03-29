 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows<=1)
            return s;
        List<List<Character>> list=new ArrayList<>();
        StringBuilder SB=new StringBuilder();
        int index=0;
        boolean flag=true;
        for(int i=0;i<numRows;i++)
        {
            list.add(new ArrayList());
        }
        for(char c:s.toCharArray())
        {
            list.get(index).add(c);
            if(index==0)
                flag=true;
            if(index==numRows-1)
                flag=false;
            if(flag)
                index++;
            else
                index--;
        }
        for(List<Character> x:list)
        {
            for(char y:x)
                SB.append(y);
        }
        return SB.toString();
        
    }
}

