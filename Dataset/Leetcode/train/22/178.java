 public List<String> XXX(int n) {
        List<String> list = new ArrayList<>();

        autoGen("",0,0,n,list);
        return list;
    }

    public void autoGen(String str,int i,int j,int n,List<String> list){
        if (j > i){
            return;
        }
        if (i == n){
            int len = 2*n - str.length();
            for (int k = 0;k<len;k++){
                str+=")";
            }
            list.add(str);
        }else {
            autoGen(str+"(",i+1,j,n,list);
            autoGen(str+")",i,j+1,n,list);
        }
    }

