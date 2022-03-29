    public int XXX(String haystack, String needle) {
       if(haystack.length()==0&&needle.length()==0) return 0;
        Map m=new HashMap<>();
        for(int i=0;i<(haystack.length()-needle.length()+1);i++){
            m.put(i,haystack.substring(i,i+needle.length()));
        }
        Set<Map.Entry<Integer,String>> sm=m.entrySet();
        for(Map.Entry<Integer,String> entry:sm){
            if(entry.getValue().equals(needle)){
                return entry.getKey();
            }
        }
        return -1;
    }

