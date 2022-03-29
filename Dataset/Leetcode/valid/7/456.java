  public int XXX(int x) {
       StringBuilder sb = new StringBuilder(new Integer(x).toString());
        try {
            if(x<0){
                sb.deleteCharAt(0);
                sb.XXX();
                return Integer.parseInt("-"+sb.toString());
            }else{
                sb.XXX();
                return Integer.parseInt(sb.toString());
            }
        } catch (Exception e){
            return 0;
        }
    }

