 class Solution {
    public String XXX(int n) {
        List<String> list = new ArrayList<>();
        list.add("1");
        if(n == 1)
            return list.get(n-1);
        else {
            for (int i = 2; i <= n; i++) {
                String str = list.get(i-2);
                if(str.length() == 0){
                    list.add("1"+str);
                }else {
                    StringBuilder sb = new StringBuilder();
                    int len = 1;
                    for(int k = 1;k<str.length();k++){
                        if(str.charAt(k) == str.charAt(k-1))
                            len++;
                        else {
                            sb.append(len);
                            sb.append(str.charAt(k-1));
                            len = 1;
                        }
                    }
                    sb.append(len);
                    sb.append(str.charAt(str.length() -1));
                    list.add(sb.toString());
                }
            }
            return list.get(n-1);
            
        }
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


