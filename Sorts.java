import java.util.ArrayList;

public class Sorts {

  // ~~~~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  //swaps two items at specified indeces
  public static void swap(ArrayList<Comparable> al, int posLeft, int posRight) {
    // actual values
    Comparable rightItm = al.get(posRight);
    Comparable leftItm = al.get(posLeft);

    // placed previously right item in the place of the left item
    al.add(posLeft, rightItm);
    al.remove(posLeft+1);

    // places previously left item to the right
    al.add(posRight, leftItm);
    al.remove(posRight+1);
  }

  // checks if an array is sorted
  public static boolean isSorted(ArrayList<Integer> list) {

    for (int i = 1; i < list.size(); i++) {
      if (((int)list.get(i)) < ((int)list.get(i-1))) {
        return false;
      }
    }

    return true;
  }


  // populate
  public static ArrayList<Comparable> populate(ArrayList<Comparable> al){
    
  }

  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static int bubbleSort( ArrayList<Comparable> data )
  {
    int ComparisonCounter = 0;

    boolean noSwap = false;
    int i = 0;

    while ((noSwap == false)) { // while no swap is false and
        noSwap = true;
        for (int z = data.size()-1; z > i; z--) {
            ComparisonCounter += 1;

            Comparable val1 = data.get(z);
            Comparable val2 = data.get(z-1);

            if (val1.compareTo(val2) < 1) {
                noSwap = false;
                data.set(z, val2);
                data.set(z-1, val1);
            }
        }
        i ++;
    }
    return ComparisonCounter;
  }


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static int selectionSort( ArrayList<Comparable> data )
  {
    //note: this version places smallest value at "rightmost" end
    int ComparisonCounter = 0;

    Comparable minVal; // smallest value
    Comparable curVal; // current value at position z

    for(int i = 0; i < data.size(); i++) {
      minVal = data.get(i);

      // nested forloop
      for(int z = i + 1 ; z < data.size(); z++) {
        ComparisonCounter+=1;

        curVal = data.get(z);

        // when at the end of an array
        if (z == data.size()-1) {
          // when minVal is greater than curVal, minVal takes the value of curVal
          if (minVal.compareTo(curVal) > 0) {
            minVal = curVal;
          }
        } // end last value of list cases
        else {
          // when minVal is greater than curVal, minVal takes the value of curVal
          if (minVal.compareTo(curVal) > 0) {
            minVal = curVal;
          }
        } // end general cases

      } // end nested forloop

      data.remove(minVal);
      data.add(i, minVal);
    }

    return ComparisonCounter;
  }//end selectionSort


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static int insertionSort( ArrayList<Comparable> data )
  {
    int ComparisonCounter = 0;

    for(int i = 1; i <= data.size(); i++) {
      //partition marks first item in unsorted region

      //traverse sorted region from right to left
      for(int z = i-1; z > 0; z--) {
        ComparisonCounter += 1;

        Comparable rightItm = data.get(z);
        Comparable leftItm = data.get(z-1);
        // "walk" the current item to where it belongs
        // by swapping adjacent items

        // leftItm is greater than rightItm swap them
        if (leftItm.compareTo(rightItm) > 0) {
          swap(data,z-1,z);
        }
        else
          break;
      }
    }
    return ComparisonCounter;
  }//end insertionSortV


  public static void main(String[] args) {
    ArrayList<Comparable>
  }
}
