 class Solution {
    public List<String> XXX(int n) {
        List<String> res=new ArrayList<>();
        if(n==0){
            res.add("");
            return res;
        }
        if(n==1){
            res.add("()");
            return res;
        }
        for(int i=0;i<n;i++){
            List<String> list1=XXX(i);
            List<String> list2=XXX(n-i-1);
            for(int subi1=0;subi1<list1.size();subi1++){
                for(int subi2=0;subi2<list2.size();subi2++){
                    res.add("("+list2.get(subi2)+")"+list1.get(subi1));
                }
            }

        }
    return res;
    }
}

