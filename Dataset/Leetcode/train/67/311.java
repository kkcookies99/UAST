 class Solution {
    public String XXX(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuilder sb = new StringBuilder("");
        int flag = 0;
        for(;i>=0||j>=0; i--,j--){
            int temp = (i>=0?Integer.parseInt(a.substring(i,i+1)):0)+(j>=0?Integer.parseInt(b.substring(j,j+1)):0)+flag;
            sb.insert(0,String.valueOf(temp%2));
            flag = temp/2;
        }
        if(flag==1)
            sb.insert(0,"1");
        return sb.toString();
    }
}

