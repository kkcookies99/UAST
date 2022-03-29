public String XXX(int n) {
        if (n <= 1) {
            return "1";
        }
        String count = XXX(n-1);
        char target = count.charAt(0);
        int countNum = 1;
        StringBuffer result = new StringBuffer();
        for(int i=1; i<count.length(); i++) {
            char temp = count.charAt(i);
            if (target == temp) {
                countNum++;
            } else {
                result.append(countNum).append(target);
                target = temp;
                countNum = 1;
            }
        }
        result.append(countNum).append(target);
        return result.toString();
    }