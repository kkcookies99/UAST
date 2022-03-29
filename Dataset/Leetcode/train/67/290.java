  public String XXX(String a, String b) {
                StringBuilder ans = new StringBuilder();
                    int i = a.length() - 1;
                    int j = b.length() - 1;
                    int carry = 0;
                    while (i >= 0 || j >= 0) {
                        int num1 = i >= 0 ? a.charAt(i) - 48 : 0;
                        int num2 = j >= 0 ? b.charAt(j) - 48 : 0;
                        int sum = num1 + num2 + carry;
                        carry = 0;
                        if (sum >= 2) {
                            sum = sum % 2;
                            carry = 1;
                        }
                        ans.insert(0, sum);
                        i--;
                        j--;

                    }
                    if (carry == 1) {
                        ans.insert(0, 1);
                    }
                    return ans.toString();
    }

