function jumpFloor(number)
{
  if(number <= 2) return number;
  var arr = [0,1,2];
  for(var i = 3; i <= number; i++){
    arr.push(arr[i-1] + arr[i-2]);
  }
  return arr.pop();
}
module.exports = {
  jumpFloor : jumpFloor
};