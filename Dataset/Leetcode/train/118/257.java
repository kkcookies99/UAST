     public List<List<Integer>> XXX(int numRows) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        ArrayList<List<Integer>> ret=new ArrayList<>();
        int i=1,j;
        while(i!=numRows+1) {
            i++;
            ret.add((List<Integer>)a);
            ArrayList<Integer> b=new ArrayList<>();
            for(j=-1;j<a.size();j++) {
                if(j==-1) {
                    b.add(1);
                }
                else if(j!=-1&&j+1!=a.size()) {
                    b.add(a.get(j)+a.get(j+1));
                }
                else if(j+1==a.size()) {
                    b.add(1);
                }
            }
            a=b;
        }
        return ret;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


