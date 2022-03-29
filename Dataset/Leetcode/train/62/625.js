var XXX = function(m, n) {
   return factorial(m + n - 2) / (factorial(m - 1) * factorial(n - 1)); 
};
// 定义阶乘函数
const factorial = n => n <= 1 ? 1 : n * factorial(n - 1);

