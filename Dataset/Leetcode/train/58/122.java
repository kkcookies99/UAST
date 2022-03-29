 public int XXX(String s) {
        if(s == null || s.length() == 0 || " ".equals(s) ){
            return 0;
        }
        
        String[] sA = s.split(" ");
         if(sA.length == 0){
            return 0;
        }
        return sA[sA.length-1].length();
    }

