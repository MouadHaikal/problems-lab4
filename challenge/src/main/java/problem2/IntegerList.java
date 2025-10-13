package problem2;

public class IntegerList
{
    private int[] list; //values in the list

    private int integerCount;

    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];

        integerCount = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<integerCount; i++)
            list[i] = (int)(Math.random() * 100) + 1;
    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<integerCount; i++)
            System.out.println(i + ":\t" + list[i]);
    }

// ----------------------------------------------------------
    private void increaseSize(){
        int[] newList = new int[2 * list.length];

        for (int i = 0; i < integerCount; i++) {
            newList[i] = list[i];
        }

        list = newList;
    }

    public void addElement(int newVal){
        if (integerCount >= list.length) increaseSize();

        list[integerCount] = newVal;
        integerCount++;
    }

    public boolean removeFirst(int val){
        int idx=-1;

        for (int i = 0; i < integerCount; i++) {
            if (list[i] == val) {
                idx = i;
                break;
            }
        }

        if (idx == -1) return false;

        for (int i = idx+1; i < integerCount; i++) {
            list[i-1] = list[i];
        }

        integerCount--;
        return true;
    }

    public void removeAll(int val){
        while (removeFirst(val));
    }
}
