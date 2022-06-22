package util;

import java.util.*;

public class WordReversals {

    public static void main (String[] argv)
    {
        // Fetch the dictionary.
        String[] words ={"sha","kar","kal","ash"};
        

        // Compare a tree data structure with ArrayList and LinkedList.
      findReversalsUsingTree (words);
       findReversalsUsingArrayList (words);
        findReversalsUsingLinkedList (words);
    }
    
    static void findReversalsUsingTree (String[] words)
    {
        long startTime = System.currentTimeMillis();

        // Count such words.
        int count = 0;

        // First put all words into a tree.
        TreeSet wordSet = new TreeSet ();
        for (int i=0; i < words.length; i++) {
            wordSet.add (words[i]);
        }
        
        // Now perform the search for reversals.
        for (int i=0; i < words.length; i++) {
            String reverseStr = reverse (words[i]);
            if (wordSet.contains (reverseStr)) {
                count ++;
                System.out.println (words[i]);
            }
        }

        // How much time has elapsed?
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println ("Using a tree: count=" + count + "  timeTaken=" + timeTaken);
    }



    static void findReversalsUsingArrayList (String[] words)
    {
        // ... similar except that we use an ArrayList ...
    	long startTime = System.currentTimeMillis();

        // Count such words.
        int count = 0;

        // First put all words into a tree.
        ArrayList<String> tensWordsAl=new ArrayList<String>();
        tensWordsAl.add("asa");
        
        ArrayList wordSet = new ArrayList ();
        for (int i=0; i < words.length; i++) {
            wordSet.add (words[i]);
        }
        
        // Now perform the search for reversals.
        for (int i=0; i < words.length; i++) {
            String reverseStr = reverse (words[i]);
            if (wordSet.contains (reverseStr)) {
                count ++;
                System.out.println (words[i]);
            }
        }

        // How much time has elapsed?
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println ("Using a tree: count=" + count + "  timeTaken=" + timeTaken);
    }


    static void findReversalsUsingLinkedList (String[] words)
    {
        // ... similar except that we use a LinkedList ...
    	long startTime = System.currentTimeMillis();

        // Count such words.
        int count = 0;

        // First put all words into a tree.
        LinkedList wordSet = new LinkedList();
        for (int i=0; i < words.length; i++) {
            wordSet.add (words[i]);
        }
        
        // Now perform the search for reversals.
        for (int i=0; i < words.length; i++) {
            String reverseStr = reverse (words[i]);
            if (wordSet.contains (reverseStr)) {
                count ++;
                System.out.println (words[i]);
            }
        }

        // How much time has elapsed?
        long timeTaken = System.currentTimeMillis() - startTime;
        System.out.println ("Using a tree: count=" + count + "  timeTaken=" + timeTaken);
    }

/*
public static void reverse(List list) {
    int size = list.size();
    if (size < REVERSE_THRESHOLD || list instanceof RandomAccess) {
        for (int i=0, mid=size>>1, j=size-1; i<mid; i++, j--)
            swap(list, i, j);
    } else {
        ListIterator fwd = list.listIterator();
        ListIterator rev = list.listIterator(size);
        for (int i=0, mid=list.size()>>1; i<mid; i++) {
            Object tmp = fwd.next();
            fwd.set(rev.previous());
            rev.set(tmp);
        }
    }*/
}

}
