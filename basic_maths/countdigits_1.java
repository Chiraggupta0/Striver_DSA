// ques
// Given a positive integer n, count the number of digits in n that divide n evenly (i.e., without leaving a remainder). Return the total number of such digits.
// Input: n = 2446
// Output: 1
// Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.




// tc-o(d) where d in the no of digits in the number
//                      or
// tc-0(log n)
//  sc-o(1)



class Solution {
    static int evenlyDivides(int n) {
        int count=0;
        int original = n ;
        while(n>0)
        {
   
            int last_digit=n%10;
            if(last_digit!=0 && original%last_digit==0)
            {
                count++;
            }
            n=n/10;
        }
        
        return count;
        
    } 
}
class countdigits_1
{
    public static int main(String args[])
    {
        Solution obj = new Solution();
        int result=obj.evenlyDivides(2446);
        System.out.println(result);
        return 0;
    }
}