class Solution {
    public String XXX(int n) {
        if (n == 1){
            return "1";
        }
        return say(XXX(n-1));
    }

    private String say(String number){
        char[] items = number.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < items.length;){
            int index = 0;
            while (items[i] == items[i + index]){
                index++;
                if (i + index == items.length){
                    break;
                }
            }
            answer.append(index).append(items[i]);
            i += index;
        }
        return answer.toString();
    }
}

