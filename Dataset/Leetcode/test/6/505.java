 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1){
            return s;
        }
        List<StringBuffer> list=new LinkedList<>();
        for(int i=0;i<Math.min(s.length(),numRows);i++){
            list.add(new StringBuffer());
        }
        char[] ch=s.toCharArray();
        int index=0;
        int flag=1;
        for(int i=0;i<ch.length;i++){
            list.get(index).append(ch[i]);
            if(i!=0 && i%(numRows-1)==0){
                flag*=-1;
            }
            index+=flag;
        }
        String r="";
        for(int i=0;i<list.size();i++){
            r+=list.get(i).toString();
        }
        return r;
    }
}

