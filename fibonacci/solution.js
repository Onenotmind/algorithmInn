function Fibonacci(n)
{
  if(n == 0) {
    return 0;
  }else if(n == 1) {
    return 1;
  }
  var Fibona = [0,1];
  for(var i = 2; i <= n; i++) {
    Fibona.push(Fibona[i-1] + Fibona[i-2]);
  }
  return Fibona.pop();
}
module.exports = {
  Fibonacci : Fibonacci
};