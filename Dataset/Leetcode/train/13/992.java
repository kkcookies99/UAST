 public int XXX(String s) {
        char c[] = s.toCharArray();
        int len=c.length;
        int sum=0;
        HashMap<String,Integer> hs=new HashMap<>();
        hs.put("I",1);
        hs.put("V",5);
        hs.put("X",10);
        hs.put("L",50);
        hs.put("C",10);
        hs.put("D",500);
        hs.put("M",1000);
        for (int i=0;i<=len;i++){
            if (hs.get(String.valueOf(c[i]))>=hs.get(String.valueOf(c[i+1]))){
                sum+=hs.get(String.valueOf(c[i]));
            }else{
                int x = hs.get(String.valueOf(c[i+1]));
                int y = hs.get(String.valueOf(c[i]));
                sum += x-y;
                i++;
            }
        }
        return sum;
    }

