public class Solution {
  public int FindGreatestSumOfSubArray(int[] array) {
    if(array.length <= 0) return 0;
    int res = array[0]; //记录当前所有子数组的和的最大值
    int max=array[0];   //包含array[i]的连续数组最大值
    for (int i = 1; i < array.length; i++) {
      max=Math.max(max+array[i], array[i]);
      res=Math.max(max, res);
    }
    return res;
  }
}