 public boolean XXX(String s) {       
        if (s.length()==0) return true;
        char[] ch=s.toCharArray();
       // System.out.println(ch);
        List<Character> list=new ArrayList<Character>();
        for (char c:ch){
            if ((c-'0'>=0 && c-'9'<=0)|| (c-'A'>=0 && c-'Z'<=0)){
                list.add(c);
            }
            if (c-'a'>=0 && c-'z'<=0){
                list.add((char) (c-32));
            }
        }
        //System.out.println(list);
        int n=list.size();
        int m=n-1;
        for (int i=0;i<n;i++) {
            if (list.get(i) != list.get(m--)) {
                return false;
            }
        }
        return true;
    }

