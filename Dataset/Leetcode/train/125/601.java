 class Solution {
    public boolean XXX(String s) {
        String str = s.toLowerCase();
        int low = 0, high = str.length() - 1;
        while (low < high)
        {
            while (low < high &&
                 !(Character.isLetter(str.charAt(low)) || Character.isDigit(str.charAt(low))))    low++;
            while (low < high &&
                 !(Character.isLetter(str.charAt(high)) || Character.isDigit(str.charAt(high))))    high--;
            if (str.charAt(low) != str.charAt(high))    return false;
            low++;
            high--;
        }

        return true;
    }
}

