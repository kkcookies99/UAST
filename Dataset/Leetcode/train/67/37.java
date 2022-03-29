 class Solution {
    public String XXX(String a, String b) {
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;
        int k = 0;
        String result = "";

        while (Math.max(aIndex,bIndex) >= 0){
            if (aIndex >= 0 && bIndex < 0){
                if ( k == 0){
                    result = a.substring(0,aIndex + 1) + result;
                    aIndex = 0;
                } else {
                    if (a.charAt(aIndex) == '1'){
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                        k = 0;
                    }
                }
            } else if (aIndex < 0 && bIndex >= 0) {
                if ( k == 0){
                    result = b.substring(0,bIndex + 1) + result;
                    bIndex = 0;
                } else {
                    if (b.charAt(bIndex) == '1'){
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                        k = 0;
                    }
                }
            } else {
                if (a.charAt(aIndex) == '0' && b.charAt(bIndex) == '0'){
                    // a=0 b=0
                    if (k == 0){
                        result = "0" + result;
                    } else {
                        result = "1" + result;
                        k = 0;
                    }
                }else if (a.charAt(aIndex) == '0'){
                    if (k == 0){
                        result = "1" + result;
                    } else {
                        result = "0" + result;
                    }
                }else if (b.charAt(bIndex) == '0'){
                    // a=1 b=0
                    if (k == 0){
                        result = "1" + result;
                    } else {
                        result = "0" + result;
                    }
                }else{
                    if (k == 0){
                        result = "0" + result;
                        k ++;
                    } else {
                        result = "1" + result;
                    }
                }
            }
             aIndex--;
             bIndex--;
        }

        if ( k > 0){
            result = "1" + result;
            k = 0;
        }
        return result;
    }
}

