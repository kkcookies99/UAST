public boolean XXX(int x) {
        if(x < 0){
            return false;
        }
        String xStr = String.valueOf(x);
        int xStrLen = xStr.length();
        String leftStr = xStr.substring(0, xStrLen / 2);
        String rightStr = xStr.substring(xStrLen % 2 == 0 ? xStrLen / 2 : xStrLen / 2 + 1, xStrLen);
        if(leftStr.length() != rightStr.length()){
            return false;
        }
        for (int i = 0; i < leftStr.length(); i++) {
            if(leftStr.charAt(i) != rightStr.charAt(rightStr.length() -1 - i)){
                return false;
            }
        }
        return true;
    }

