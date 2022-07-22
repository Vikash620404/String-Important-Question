Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.

  
  
  
  
  
  class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
for(int i=0;i<operations.length();i++){
if(operations[i].charAt(1)=="-") ans--;
else
ans++;
}
return ans;
    }
}






//O(n)
