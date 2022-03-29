 class Solution {
    public boolean XXX(String s) {
        char []arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char b = arr[start];
            char e = arr[end];
            if (    !(b >= '0' && b <= '9')
                && !(b >= 'a' && b <= 'z')
                && !(b >= 'A' && b <= 'Z')
            ) {
                // 下一个
                start ++; 
                continue;
            }
            if (    !(e >= '0' && e <= '9')
                && !(e >= 'a' && e <= 'z')
                && !(e >= 'A' && e <= 'Z')
            ) {
                // 下一个
                end --; 
                continue;
            }
            
            // 到了一个需要判断的位置
            if (b >= 'A' && b <= 'Z') {
                b = (char)(b - ('A' - 'a'));
            }
            if (e >= 'A' && e <= 'Z') {
                e =  (char)(e - ('A' - 'a'));
            }
            if (b != e) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}

