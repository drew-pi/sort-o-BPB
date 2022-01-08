import java.util.ArrayList;

public class Driver {

    // to do:
    // 1. change our sorting algorithms to clearly know when swaps are taking place using swap method (DONE)
    // 2. place counters near the swap methods to count how many swaps are done (not just loops, because boolean logic takes very little resources) (DONE)
    // -  can also add a bunch of counters and then choose which data to show (allows for flexibility) (DONE)
    // -  counters for each pass, comparisons, and swaps (DONE)
    // 3. set up driver to print out a nice summary (DONE)


    // 4. test a bunch of array list sizes to get a conclusion (UP TO THIS STEP)
    // 5. record everything in the readme (in results section)

    public static String stringRep(int[] a) {
        String s = "[";
        for (int num : a) {
            s += num + ",";
            System.out.println(num);
        }
        s += "]";
        return s;
    }

    public static void main(String[] args) {
        // new instance of Sorts class to run sorting algorithms
        Sorts s = new Sorts();

        // ArrayList<Comparable> test = new ArrayList<Comparable>();

        // test = s.populate(false,5);

        // System.out.println(test);

        // test = s.populate(true,10);
        // System.out.println(test);


        int interval = 2;

        // change interval variable to change by what it incraments
        for (int i = 10; i < 10_000; i = i*interval) {
            int size = i;
            int[] bubbleSortBest = s.bubbleSort(s.populate(true,size));
            int[] bubbleSortWorst = s.bubbleSort(s.populate(false,size));

            // test = s.populate(false,size);
            // s.bubbleSort(test);
            // System.out.println(s.isSorted(test));

            int[] selectionSortBest = s.selectionSort(s.populate(true,size));
            int[] selectionSortWorst = s.selectionSort(s.populate(false,size));

            // test = s.populate(false,size);
            // s.selectionSort(test);
            // System.out.println(s.isSorted(test));


            int[] insertionSortBest = s.insertionSort(s.populate(true,size));
            int[] insertionSortWorst = s.insertionSort(s.populate(false,size));

            // test = s.populate(false,size);
            // s.insertionSort(test);
            // System.out.println(s.isSorted(test));

            System.out.println("\n-----------------------------------------------------------------------------------------");
            System.out.println("Array size is: " + size);
            System.out.println("\nType of sort    |    Worst or Best  |  comparisonCounter  |  passCounter  |  swapCounter");
            System.out.println("Bubble Sort" + "             " + "Best" + "                 " + bubbleSortBest[0] + "                 " + bubbleSortBest[1] + "             " + bubbleSortBest[2]);
            System.out.println("Bubble Sort" + "             " + "Worst" + "                " + bubbleSortWorst[0] + "                " + bubbleSortWorst[1] + "           " + bubbleSortWorst[2]);
            System.out.println("Selection Sort" + "          " + "Best" + "                 " + selectionSortBest[0] + "               " + selectionSortBest[1] + "           " + selectionSortBest[2]);
            System.out.println("Selection Sort" + "          " + "Worst" + "                " + selectionSortWorst[0] + "              " + selectionSortWorst[1] + "             " + selectionSortWorst[2]);
            System.out.println("Insertion Sort" + "          " + "Best" + "                 " + insertionSortBest[0] + "                " + insertionSortBest[1] + "             " + insertionSortBest[2]);
            System.out.println("Insertion Sort" + "          " + "Worst" + "                " + insertionSortWorst[0] + "                " + insertionSortWorst[1] + "           " + insertionSortWorst[2]);
        }






    }
}
