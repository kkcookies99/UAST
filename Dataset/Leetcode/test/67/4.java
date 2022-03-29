 class Solution {
    public String XXX(String a, String b) {
        // 进位标志
        int flag = 0;
        StringBuilder stringbuilder = new StringBuilder();
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        while (indexA >= 0 || indexB >= 0) {
            int A = indexA < 0 ? 0 : a.charAt(indexA) - '0';
            int B = indexB < 0 ? 0 : b.charAt(indexB) - '0';
            stringbuilder.append(A ^ B ^ flag);
            flag = (A & B) | ((A | B) & flag);
            indexB--;indexA--;
        }
        if (flag == 1) {
            stringbuilder.append('1');
        }
        return stringbuilder.reverse().toString();
    }
}

