public int XXX(int x) {
       StringBuffer sb = new StringBuffer();
       String str = sb.append(String.valueOf(x < 0 ? x * -1 : x)).XXX().toString();
        try{
            return x < 0 ? Integer.parseInt(str) * -1 : Integer.parseInt(str);    
        }catch(Exception e){
            return 0;
        }
    }

