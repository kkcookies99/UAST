 class Solution {
    public String XXX(String[] strs) {
int minL = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            if (minL > strs[i].length()) {
                minL = strs[i].length();
            }
        }
        StringBuilder summary = new StringBuilder();
        for (int i = 0; i < minL; i++) {
            String head = String.valueOf(strs[0].charAt(i));
            boolean same = true;
            for (String str : strs) {

                // CountDownLatch count = new CountDownLatch(strs.length);
                FutureTask<String> task = new FutureTask<>(new Job(String.valueOf(str.charAt(i))));
                new Thread(task).start();
                // count.countDown();
                try {
                    if (!head.equals(task.get())) {
                        same = false;
                    }
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }

            }
            if (same) {
                summary.append(head);
            }else{
                break;
            }

        }
        return summary.toString();
    }
}

class Job implements Callable<String> {

    String str;

    public Job(String str) {
        this.str = str;
    }

    @Override
    public String call() throws Exception {
        return str;
    }
}

