 class Solution {
    public String XXX(int n) {
        if(n==1){
            return "1";
        }

        String [] data=new String[n];
        data[0]="1";
        data[1]="11";
        for(int i=2;i<n;i++){
            int left=0;
            StringBuilder sb=new StringBuilder();
            for(int j=1;j<data[i-1].length();j++){
                if(data[i-1].charAt(j)!=data[i-1].charAt(j-1)){
                    sb.append(j-left);
                    sb.append(data[i-1].charAt(j-1));
                    left=j;
                }
                
                if(j==data[i-1].length()-1){
                    sb.append(j-left+1);
                    sb.append(data[i-1].charAt(j));
                }
            }
            data[i]=sb.toString();
            // System.out.println(data[i]);
        }

        return data[n-1];
    }
}

