 public String XXX(int num) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1000,"M");map.put(900,"CM");map.put(500,"D");
        map.put(400,"CD");map.put(100,"C");map.put(90,"XC");
        map.put(50,"L");map.put(40,"XL");map.put(10,"X");
        map.put(9,"IX");map.put(5,"V");map.put(4,"IV");map.put(1,"I");

        List<Integer> list = List.of(1000,900,500,400,100,90,50,40,10,9,5,4,1);
        int i =0;
        StringBuilder str = new StringBuilder();
        while(true){
            if(num>=list.get(i)){
                str.append(map.get(list.get(i)));
                num-=list.get(i);
                continue;
            }else{i++;}
            if(i==list.size()){
                break;
            }
        }
        return str.toString();
    }

