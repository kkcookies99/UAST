   public int XXX(String s) {
        if(s.trim().equals("") ){
            return 0;
        }
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }

