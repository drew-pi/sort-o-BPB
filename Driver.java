import java.util.ArrayList;

public class Driver {

    // to do:
    // 1. change our sorting algorithms to clearly know when swaps are taking place using swap method
    // 2. place counters near the swap methods to count how many swaps are done (not just loops, because boolean logic takes very little resources)
    // -  can also add a bunch of counters and then choose which data to show (allows for flexibility)
    // 3. set up driver to print out a nice summary
    // 4. test a bunch of array list sizes to get a conclusion
    // 5. record everything in the readme (in results section)

    public static void main(String[] args) {
        Sorts s = new Sorts();

    ArrayList<Comparable> test = new ArrayList<Comparable>();

    test = s.populate(false,5);

    System.out.println(test);

    test = s.populate(true,10);
    System.out.println(test);

    int size = 4;

    int bubbleSortBest = s.bubbleSort(s.populate(true,size));
    int bubbleSortWorst = s.bubbleSort(s.populate(false,size));

    System.out.println(bubbleSortBest + " " + bubbleSortWorst);

    int selectionSortBest = s.selectionSort(s.populate(true,size));
    int selectionSortWorst = s.selectionSort(s.populate(false,size));

    System.out.println(selectionSortBest + " " + selectionSortWorst);


    int insertionSortBest = s.insertionSort(s.populate(true,size));
    int insertionSortWorst = s.insertionSort(s.populate(false,size));

    System.out.println(insertionSortBest + " " + insertionSortWorst);
    }
}