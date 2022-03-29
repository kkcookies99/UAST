 class Solution {
    public String XXX(int n) {
        String string = "1";

        for (int i = 0; i < n-1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < string.length(); j++) {
                if ( j + 1 < string.length() && string.charAt(j) != string.charAt(j + 1) ) {
                    stringBuilder.append(1);
                    stringBuilder.append(string.charAt(j));
                } else {
                    int count = 0;
                    int temp = j;
                    for (int k = j; k < string.length(); k++) {
                        if (string.charAt(temp) == string.charAt(k)) {
                            count++;
                            j++;
                        }else {
                            j--;
                            break;
                        }
                    }
                    stringBuilder.append(count);
                    stringBuilder.append(string.charAt(temp));
                }
            }
            string = stringBuilder.toString();
        }
        return string;
    }
}

