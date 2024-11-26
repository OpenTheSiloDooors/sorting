public class App {
    
//Jacob Aaron Espinoza @ jacob.espinoza@malad.us
//for CTE software development 1
//instructor Mr. Gross

    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
                int temp;
    temp=arrayToSwap[lowerIndex];
    arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
    arrayToSwap[lowerIndex+1]=temp;
    return arrayToSwap;
    }
    public static void main(String[] args){
    int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
    for (int z=0;z<arrayToSort.length;z++){
        System.out.print(arrayToSort[z]+" ");
        }
    for (int x=0;x<arrayToSort.length-1;x++){
        for (int y=0;y<arrayToSort.length-1-x;y++){
            if (arrayToSort [y]>arrayToSort [y+1]){
                arrayToSort=swapTwoArrayElements(arrayToSort, y);
                }
            }
        }
    System.out.println("\nThe sorted numbers are ");
    for (int z=0;z<arrayToSort.length;z++){
        System.out.print(arrayToSort[z]+" ");
        }
    }
}