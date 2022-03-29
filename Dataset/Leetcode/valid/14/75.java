 class Solution {
    public String XXX(String[] strs) {
        StringBuilder re = new StringBuilder();

        try {
            int flag = 0;
            boolean over = false;
            while (true) {
                char c = strs[0].charAt(flag);
                for (String s : strs) {
                    if (c != s.charAt(flag)) {
                        over = true;
                        break;
                    }
                }
                if(over) break;
                flag++;
                re.append(c);
            }
        } catch (Exception e) {

        }

        return re.toString();
        
    }
}

