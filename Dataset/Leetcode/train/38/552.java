 class Solution {
    public String XXX(int n) {
        List<String> list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String temp = "";
        char ch;
        int count;
        list.add("1");
        for(int i=2;i<=n;i++){
            temp = list.get(0);
            int len = temp.length();
            count = 1;
            for(int j=0;j<len;j++){
                ch = temp.charAt(j);
                while(j<len-1&&temp.charAt(j+1)==ch){
                    count++;
                    j++;
                }
                sb.append(count).append(ch);
                count = 1;
            }
            list.add(sb.toString());
            sb.setLength(0);
            list.remove(0);
        }
        return list.get(0);
    }
}

