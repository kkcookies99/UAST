//导入BigInteger类
 import java.math.BigInteger;
    class Solution {
        public ListNode XXX(ListNode l1, ListNode l2) {
            List<Integer> a = new ArrayList<>();
            List<Integer> b = new ArrayList<>();
            while (l1 != null) {
                a.add(l1.val);
                l1 = l1.next;
            }
            while (l2 != null) {
                b.add(l2.val);
                l2 = l2.next;
            }
            //倒序
            Collections.reverse(a);
            Collections.reverse(b);
            String num1 = "";
            String num2 = "";
            for (Integer a1 : a) {
                num1 += a1;
            }
            for (Integer a2 : b) {
                num2 += a2;
            }
            BigInteger bigInteger1 = new BigInteger(num1);
            BigInteger bigInteger2 = new BigInteger(num2);
            //add加法   结果
            BigInteger bigNum1 = bigInteger1.add(bigInteger2);
            //反转后的字符串
            String reverse = new StringBuffer(bigNum1.toString()).reverse().toString();
            String[] split = reverse.split("");
            //创建首节点
            ListNode newNode = new ListNode(Integer.parseInt(split[0]));
            ListNode newNodes = newNode;//声明一个变量用来在移动过程中指向当前节点
            for (int i = 1; i < split.length; i++) {
                ListNode node = new ListNode(Integer.parseInt(split[i]));
                newNodes.next = node;
                newNodes = newNodes.next;
            }
            return newNode;
        }
    }