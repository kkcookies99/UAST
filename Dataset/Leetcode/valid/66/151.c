 int* XXX(int* digits, int digitsSize, int* returnSize){
    int carry = 0;
    int sum = 0;
    sum = digits[digitsSize - 1] + 1;
    *returnSize = digitsSize;
    if (sum > 9) {
        carry = 1;
        digits[digitsSize - 1] = 0;
    } else {
        digits[digitsSize - 1] = sum;
    }
    for (int i = digitsSize - 2; i >= 0; i--) {
        sum = digits[i] + carry;
        if (sum <= 9) {
            carry = 0;
            digits[i] = sum;
        } else {
            carry = 1;
            digits[i] = 0;
        }
    }
    int *res = malloc(sizeof(int) * (digitsSize + 1));
    if (carry == 1) {
        res[0] = 1;
        *returnSize = digitsSize + 1;
        for (int i = 0; i < digitsSize; i++) {
            res[i + 1] = digits[i]; 
        }
    } else {
        for (int i = 0; i < digitsSize; i++) {
            res[i] = digits[i]; 
        }
    }
    return res;
}

