  public int XXX(int x) {
        final int right = Integer.MAX_VALUE / 10;
        final int left = Integer.MIN_VALUE / 10;
        int result = 0;
        while (x != 0) {
            final int i = x % 10;
            if ((result > 0 && result > right) || (result < 0 && result < left)) {
                return 0;
            }
            result = result * 10 + i;
            x = x / 10;
        }
        return result;
    }

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


