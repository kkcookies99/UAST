 class Solution {
    public String XXX(String s, int numRows) {
        if(numRows==1) return s;
        int n = s.length(),base = 2*(numRows-1);
        StringBuilder sb = new StringBuilder();
        for(int l1=base,l2=0,i=0;i<numRows;++i,l1-=2,l2+=2){
            int[] l;
            if(l1==0){
                l=new int[]{l2};
            }else if(l2==0){
                l=new int[]{l1};
            }else{
                l=new int[]{l1,l2};
            }
            for(int index=i,j=0;index<n;index+=l[j],j=(j+1)%l.length){
                sb.append(s.charAt(index));
            }
        }
        return sb.toString();
    }
}

