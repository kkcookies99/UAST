 public String XXX(int num) {
        
        StringBuilder sb = new StringBuilder();

        num = get("M","C",1000,900,num,sb);
        num = get("D","C",500,400,num,sb);
        num = get("C","X",100,90,num,sb);
        num = get("L","X",50,40,num,sb);
        num = get("X","I",10,9,num,sb);
        num = get("V","I",5,4,num,sb);
        num = get("I","I",1,2,num,sb);
        return sb.toString();
        
    }

    public int get(String c1 ,String c2,Integer count,Integer spec,int num,StringBuilder sb){
         int a2 = num / count;
        for(int i = 0;i<a2 ; i++){
            sb.append(c1);
        }
        num = num % count;
        if(num>=spec){
            num = num - spec;
            sb.append(c2).append(c1);
        }
        return num;
    }

