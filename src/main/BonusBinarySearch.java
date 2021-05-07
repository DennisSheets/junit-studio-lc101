package main;

public class BonusBinarySearch {

    /**
     * A binary search implementation for integer arrays.
     *
     * Info about binary search: https://www.geeksforgeeks.org/binary-search/
     *
     * @param sortedNumbers - must be sorted from least to greatest
     * @param n - number to search for
     * @return index of search item if it's found, -1 if not found
     *
     */
//  search for  n=5         mid-n
//      r=9 l=0     mid=4.5 (4)     i4=5 5>5     r=5
//      r=5 l=0     mid=2.5 (2)     i3=4 4<5     l=3
//      r=5 l=3     mid=4           i4=5 5=5     return 4  as in i4 which is a value of 5

//  search for  n=7
//      r=9 l=0    mid=4.5 (4)     mid4=6 6<7  l=4
//      r=9 l=5    mid=(7)     mid7=8 8>7  r=7
//      r=7 l=5    mid=(6)     mid6=8 8>7  r=6
//      r=6 l=5    mid=

//  search for n=10
//      r=9 l=0    mid=4.5 (4)  mid4=5  6<7 l=4
//      r=9 l=4    mid=(6)  mid6=8   8<10  l=6
//      r=9 l=6    mid=(7)   mid7=8  8<10  l=7
//      r=9 l=7    mid=(8)   mid8=9  9<10  l=8
//      r=9 l=8    mid=(8)   mid8=9  9<10  l=8

    public static int binarySearch(int[] sortedNumbers, int n) {      // int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 15}    length of 10
        int right = sortedNumbers.length - 1;                         // 9              0  1  2  3  4  5  6  7  8  9
        int left = 0;
        int x = 0;


        while (right - left > 1) {
            System.out.println("      " + right +" - "+ left +" > " + x + ": " + (right - left > x));

                int mid = left + ((right - left) / 2);              // 0 + (( 9 + 0) / 2 )    mid = 4.5     5
                if ( n == sortedNumbers[sortedNumbers.length -1]){
                    System.out.println("            " + n + " = " + sortedNumbers[(sortedNumbers.length - 1)] + " returned last index:" + (sortedNumbers.length - 1)  + "\n");
                    return sortedNumbers.length -1;
                }else if ( n == sortedNumbers[0]){
                System.out.println("            " + n + " = " + sortedNumbers[0] + " returned first index:" + (0)  + "\n");
                return 0;
            }

                else if (sortedNumbers[mid] > n) {
                    right = mid;
                    System.out.println("l=" + left +  " r=" + right + " mid=" + mid + " array[mid]" + sortedNumbers[mid] + " > n=" + n);

                } else if (sortedNumbers[mid] < n) {
                    left = mid;
                    System.out.println("l=" + left + " r=" + right + " mid=" + mid + " array[mid]" + sortedNumbers[mid] + " < n=" + n);


                } else {
                    System.out.println("l=" + left +  " r=" + right + " mid=" + mid + " array[mid]" + sortedNumbers[mid] + " = n=" + n);
                    System.out.println("            " + n + " = " + sortedNumbers[mid] + " returned mid:" + mid  + "\n");
                    return mid;

               }


            }
        System.out.println("return: -1 (While failed)");
        System.out.println("            " + n + " can't be found between " + sortedNumbers[left] + " and " + sortedNumbers[right] + "\n");
        return -1;
    }

}
