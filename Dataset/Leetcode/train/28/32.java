 public int XXX(String haystack, String needle) {
        int needleLength = needle.length();
        if (needleLength == 0) {
            return 0;
        }
        int haystackLength = haystack.length();
        if (haystackLength == 0) {
            return -1;
        }
        if(haystackLength < needleLength) {
            return -1;
        }
        int haystackPoint = 0;
        int needlePoint = 0;
        while (haystackPoint < haystackLength) {
            if (haystack.charAt(haystackPoint) == needle.charAt(needlePoint)) {
                haystackPoint++;
                needlePoint++;
                if (needlePoint == needleLength) {
                    return haystackPoint - needlePoint;
                }
            } else {
                haystackPoint = haystackPoint - needlePoint + 1;
                needlePoint = 0;
            }
        }
        return -1;
    }

