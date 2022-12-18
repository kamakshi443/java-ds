package MileStone2.Recursion1;
// First Index Of a Number in an Array - Question

// Send Feedback
// Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
// First index means, the index of first occurrence of x in the input array.
// Do this recursively. Indexing in the array starts from 0.
// Input Format :
// Line 1 : An Integer N i.e. size of array
// Line 2 : N integers which are elements of the array, separated by spaces
// Line 3 : Integer x
// Output Format :
// first index or -1
// Constraints :
// 1 <= N <= 10^3
// Sample Input :
// 4
// 9 8 10 8
// 8
// Sample Output :
// 1

public class FirstIndexOfNumInArr {

    public static int check(int input[], int si, int x) {
        if (si == input.length) {
            return -1;
        }
        if (input[si] == x) {
            return si;
        }
        return check(input, si + 1, x);
    }

    public static int firstIndex(int input[], int x) {

        return check(input, 0, x);
        // if(si == input.length) {
        // if(x != input[si]) {
        // return -1;

        // }
        // }

        // if(input[si] == x) {
        // return si;
        // }
        // si = si+1;
        // firstIndex(input , x);
        // index++;

        // return index;

        // int n=input.length;
        // if(n==0)
        // {
        // return -1;
        // }
        // if(input[0]==x)
        // {
        // return 0;
        // }
        // int smallArray[] = new int[n-1];
        // for(int i=1;i<n;i++)
        // {
        // smallArray[i-1]=input[i];
        // }
        // int ans=firstIndex(smallArray,x);
        // if(ans==-1){
        // return ans;
        // }
        // else
        // {
        // return ans+1;
        // }

    }
}
