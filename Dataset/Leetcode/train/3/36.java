 class Solution {
    public int XXX(String s) {
        char[] beans = s.toCharArray();
        int len = s.length();
        if (len <= 1)
            return len;
        List<Character> fattest = new ArrayList<>();
        for (int i = 0; i < beans.length - 1; i++) {    // 遍历到倒数第二位就好，为后面 j 作准备
            // 每个点都埋点一个吃豆人
            List<Character> eater = new ArrayList<>();
            // 首先吃掉当前的豆子
            eater.add(beans[i]);
            for (int j = i + 1; j < len; j++) {
                char curBean = beans[j];
                // 继续前进，只吃没吃过的豆子。如果发现没吃过的豆子就吃掉
                if (eater.contains(curBean) == false) {
                    char newBean = curBean;
                    eater.add(newBean);
                }
                // 否则就跳出不吃了
                else {
                    break;
                }
            }
            // 每个吃完豆子的人都要和原来 longest 的肚子比一下谁的更大，大的当老大
            if (eater.size() > fattest.size()) {
                fattest = eater;
            }
            //  由于每个点都埋点了一个吃豆人，所以就不会漏下任何一种情况了
        }
        return fattest.size();
        // 最后吃不同豆子吃得最多的就是最后的结果了
    }
}

