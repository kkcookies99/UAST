  public int XXX(String s) {
        Map<String,Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        map.put("A",4);
        map.put("B",9);
        map.put("Q",40);
        map.put("P",90);
        map.put("E",400);
        map.put("F",900);
        s=s.replace("IV","A").
                replace("IX","B").
                replace("XL","Q").
                replace("XC","P").
                replace("CD","E").
                replace("CM","F");
        Integer result=0;
        for(int i=0;i<s.length();i++){
            String temp=s.substring(i,i+1);
            result+=map.get(temp);
        }
        return result;
    }

