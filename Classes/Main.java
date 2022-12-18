package Classes;
/*
Auntie A has n apples from her garden, each apple has a weight wi given as an array.
Auntie A has lots of nephews and nieces and she wants to divide all the apples in two parts
- one for the nephews and one for the nieces such that the difference between the weights of apples
in both the groups is minimum. You have to tell the minimum possible weight.
Input:
5
3 2 7 4 1 // weights of the apples

<3,2,7> and <4,1> => 7
<2,7> and <4,3,1> => 1

Output:
1
 */
// 1 2 3 4 5  => 15
// 1,3,4 and 2,5 => 1

public class Main {

    // Math.abs => |-3| = 3
    static int minDifference = Integer.MAX_VALUE;
    static int arr1Final[];
    static int arr2Final[];
    public static void divideApples(int apples[], int ind, int sum1, int sum2, int arr1[], int arr2[])
    {
        // base case
        if(apples.length==ind)
        {
            int diff = Math.abs(sum1-sum2);
            if(minDifference > diff)
            {
                minDifference = diff;
                arr1Final = arr1;
                arr2Final = arr2;
            }
            return;
        }

        int curr = apples[ind];
        int arr1New[] = new int[arr1.length+1];
        for(int i=0; i<arr1.length; i++)
        {
            arr1New[i]=arr1[i];
        }
        arr1New[arr1.length]=curr;

        divideApples(apples, ind+1, sum1+curr, sum2, arr1New, arr2);

        int arr2New[] = new int[arr2.length+1];
        for(int i=0; i<arr2.length; i++)
        {
            arr2New[i]=arr2[i];
        }
        arr2New[arr2.length]=curr;
        divideApples(apples, ind+1, sum1, sum2+curr,arr1,arr2New);
    }


    public static boolean solve(int start, int target)
    {
        // corner case / edge case
        if(start>target)
        {
            return false;
        }

        // base case
        if(start==target)
        {
            return true;
        }

        boolean b1 = solve(start*10, target);
        boolean b2 = solve(start*20, target);
        return b1 || b2;

    //    return solve(start*10, target) || solve(start*20, target);
    }

    public static boolean isSafe(int x, int y, int n, int m)
    {
        return x<n && y<m; // x>=0 y>=0 && isInvalid[i][j] && arr[i][j]!=-1
    }
    // n*m
    // returns max sum path in going from i,j to n,m =>
    public static int maxSumPath(int arr[][], int i, int j, int n, int m)
    {
        // corner case (check if current cell is valid or not
        if(!isSafe(i,j,n,m))
        {
            return Integer.MIN_VALUE;
        }

        // base case
        if(i==n-1 && j==m-1)
        {
            return arr[i][j];
        }

        int right = maxSumPath(arr, i, j+1, n, m);
        int down = maxSumPath(arr, i+1, j, n, m);

        return Math.max(right, down) + arr[i][j];
    }

    public static void main(String[] args) {

        int arr[][] = {{5, 2, 4},
                {1, 3, 5},
                {9, 2, 7}};
        System.out.println(maxSumPath(arr, 0, 0, arr.length, arr[0].length));
        /*

        int apples[] = {1,5,4,3,2}; // <4,2,1> and <5,3>
        int arr1[] = new int[0];
        int arr2[] = new int[0];
        divideApples(apples, 0, 0, 0, arr1, arr2);
        System.out.println(minDifference);

        for(int i=0; i<arr1Final.length; i++)
            System.out.println(arr1Final[i]);

        System.out.println();

        for(int i=0; i<arr2Final.length; i++)
            System.out.println(arr2Final[i]);

        System.out.println(arr1Final);
        System.out.println(arr2Final);
        System.out.println("Hello world!"); */
    }
}

knapsack(weights[], values[], int ind, W)
{
    excl = knapsack(weights, values, ind+1, W);

    if(W-weights[ind]>=0)
        incl = knapsack(weights, values, ind+1, W-weights[ind]) + values[ind];
}

3 7
        3 30
        4 50
        5 60