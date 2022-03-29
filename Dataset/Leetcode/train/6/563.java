     public String XXX(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
         if(n <= 1 || numRows==1) return s;
        for (int j = 0; j < numRows; j++) {
            int i = j;
            while(i<n){
                sb.append(s.charAt(i));
                i += (2*numRows-2);
                if(i-2*j < n && j !=0 && j!=numRows-1) sb.append(s.charAt(i-2*j));
            }
        }
        return sb.toString();
    }

