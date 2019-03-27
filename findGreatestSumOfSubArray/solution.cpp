class Solution {
public:
  int FindGreatestSumOfSubArray(vector<int> array) {
  if(array.empty()) return 0;
  int res = array[0]; //记录当前所有子数组的和的最大值
  int maxNum=array[0];   //包含array[i]的连续数组最大值
  for (int i = 1; i < array.size(); i++) {
    maxNum=max(maxNum+array[i], array[i]);
    res=max(maxNum, res);
  }
  return res;
  }
};