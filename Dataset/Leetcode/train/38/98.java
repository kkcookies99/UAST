class Solution {
    public String XXX(int n) {
        StringBuilder sb = new StringBuilder();
        StringBuilder temp;
        sb.append("1");
        for(int i = 1;i<n;i++){
            temp = new StringBuilder();
            int count = 1;
            for(int j = 0;j<sb.length();j++){
                if(j+1<sb.length() && sb.charAt(j) != sb.charAt(j+1)){
                    temp.append(Integer.toString(count));
                    temp.append(sb.charAt(j));
                    count = 1;
                }
                if(j == sb.length()-1){
                    temp.append(Integer.toString(count));
                    temp.append(sb.charAt(j));
                }
                if(j+1<sb.length() && sb.charAt(j) == sb.charAt(j+1))
                    count++;
            }
            sb = temp;
        }
        return sb.toString();
    }
}

