 public int XXX(String s) {

    Map<String,Integer> indexMap=new HashMap<>();
    indexMap.put("I",1);
    indexMap.put("V",5);
    indexMap.put("X",10);
    indexMap.put("L",50);
    indexMap.put("C",100);
    indexMap.put("D",500);
    indexMap.put("M",1000);

    char[] c=s.toCharArray();
    boolean continueCheck=false;
    int sum=0;
    for(int i=0;i<c.length;i++){
        if(continueCheck){
            continueCheck=false;
            continue;
        }
        String str=String.valueOf(c[i]);
        int number=indexMap.get(str);
        int nextLen=i+1;
        if(c.length>nextLen){
            String nextStr=String.valueOf(c[nextLen]);
            int nextNumber=indexMap.get(nextStr);
            if(nextNumber>number){
                number=nextNumber-number;
                continueCheck=true;
            }
        }
        sum+=number;
    }

    return sum;
}

