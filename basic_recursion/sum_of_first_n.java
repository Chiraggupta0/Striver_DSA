//  this is not sum of first n numbers this is the sum of cube ot every no till n 
//  for eg -- 4 so 1^3+2^3+3^3+4^3
//  we have done it with respect to the question on sheet
//  tc,sc--o(n)
class Solution {
    int i = 1;
    int count = 0;

    int sumOfSeries(int n) {
        if (i > n) return count;  // base case, return final sum

        int res = (int)Math.pow(i, 3);  // cube of i
        count += res;                   // add to total
        i++;
        return sumOfSeries(n);          // recursive call
    }
}
class sum_of_first_n
{
    public static void main(String args[])
    {
        Solution obj = new Solution();
        int total =obj.sumOfSeries(3);
        System.out.println(total);
    }
}