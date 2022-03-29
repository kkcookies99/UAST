public int XXX(int x) {
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str);
        if(x!=0 && str.charAt(str.length()-1)=='0'){
            builder.delete(str.length()-1,str.length());
        }
        builder.XXX();
        if(x<0){
            builder.delete(builder.length()-1,builder.length());
            builder.insert(0,'-');
        }
        long t = Long.parseLong(builder.toString());
        if(t<Math.pow(-2,31)|| t>(Math.pow(2,31)-1)){
            return 0;
        }
        return Integer.parseInt(builder.toString());
    }

