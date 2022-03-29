     public String XXX(int num) {
        Map<Integer,Character> map = new HashMap<>();
        map.put(1,'I');
        map.put(5,'V');
        map.put(10,'X');
        map.put(50,'L');
        map.put(100,'C');
        map.put(500,'D');
        map.put(1000,'M');
        StringBuffer sb = new StringBuffer();
        int step = 1;
        while(num>0){
            int x = num % 10;
            if(x!=0){
                x *= step;
                while(x!=0){
                    if(map.containsKey(x)){
                        sb.append(map.get(x));
                        x = 0;
                    }else if(map.containsKey(x+step)){
                        sb.append(map.get(x+step));
                        sb.append(map.get(step));
                        x = 0;
                    }else{
                        sb.append(map.get(step));
                        x -= step;
                    }
                }

            }
            num /= 10;
            step *= 10;
        }
        return sb.reverse().toString();
    }

