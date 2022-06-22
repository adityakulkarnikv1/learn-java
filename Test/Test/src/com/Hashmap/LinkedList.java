package com.Hashmap;
Save This PageHome » openjdk-7 » java » util » [javadoc | source]     1   /*
2    * Copyright (c) 1997, 2011, Oracle and/or its affiliates. All rights reserved.
3    * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
4    *
5    * This code is free software; you can redistribute it and/or modify it
6    * under the terms of the GNU General Public License version 2 only, as
7    * published by the Free Software Foundation.  Oracle designates this
8    * particular file as subject to the "Classpath" exception as provided
9    * by Oracle in the LICENSE file that accompanied this code.
10    *
11    * This code is distributed in the hope that it will be useful, but WITHOUT
12    * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
13    * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
14    * version 2 for more details (a copy is included in the LICENSE file that
15    * accompanied this code).
16    *
17    * You should have received a copy of the GNU General Public License version
18    * 2 along with this work; if not, write to the Free Software Foundation,
19    * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
20    *
21    * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
22    * or visit www.oracle.com if you need additional information or have any
23    * questions.
24    */
25   
26   package java.util;
27   
28   /**
29    * Doubly-linked list implementation of the {@code List} and {@code Deque}
30    * interfaces.  Implements all optional list operations, and permits all
31    * elements (including {@code null}).
32    *
33    * <p>All of the operations perform as could be expected for a doubly-linked
34    * list.  Operations that index into the list will traverse the list from
35    * the beginning or the end, whichever is closer to the specified index.
36    *
37    * <p><strong>Note that this implementation is not synchronized.</strong>
38    * If multiple threads access a linked list concurrently, and at least
39    * one of the threads modifies the list structurally, it <i>must</i> be
40    * synchronized externally.  (A structural modification is any operation
41    * that adds or deletes one or more elements; merely setting the value of
42    * an element is not a structural modification.)  This is typically
43    * accomplished by synchronizing on some object that naturally
44    * encapsulates the list.
45    *
46    * If no such object exists, the list should be "wrapped" using the
47    * {@link Collections#synchronizedList Collections.synchronizedList}
48    * method.  This is best done at creation time, to prevent accidental
49    * unsynchronized access to the list:<pre>
50    *   List list = Collections.synchronizedList(new LinkedList(...));</pre>
51    *
52    * <p>The iterators returned by this class's {@code iterator} and
53    * {@code listIterator} methods are <i>fail-fast</i>: if the list is
54    * structurally modified at any time after the iterator is created, in
55    * any way except through the Iterator's own {@code remove} or
56    * {@code add} methods, the iterator will throw a {@link
57    * ConcurrentModificationException}.  Thus, in the face of concurrent
58    * modification, the iterator fails quickly and cleanly, rather than
59    * risking arbitrary, non-deterministic behavior at an undetermined
60    * time in the future.
61    *
62    * <p>Note that the fail-fast behavior of an iterator cannot be guaranteed
63    * as it is, generally speaking, impossible to make any hard guarantees in the
64    * presence of unsynchronized concurrent modification.  Fail-fast iterators
65    * throw {@code ConcurrentModificationException} on a best-effort basis.
66    * Therefore, it would be wrong to write a program that depended on this
67    * exception for its correctness:   <i>the fail-fast behavior of iterators
68    * should be used only to detect bugs.</i>
69    *
70    * <p>This class is a member of the
71    * <a href="{@docRoot}/../technotes/guides/collections/index.html">
72    * Java Collections Framework</a>.
73    *
74    * @author  Josh Bloch
75    * @see     List
76    * @see     ArrayList
77    * @since 1.2
78    * @param <E> the type of elements held in this collection
79    */
80   
81   public class LinkedList<E>
82       extends AbstractSequentialList<E>
83       implements List<E>, Deque<E>, Cloneable, java.io.Serializable
84   {
85       transient int size = 0;
86   
87       /**
88        * Pointer to first node.
89        * Invariant: (first == null && last == null) ||
90        *            (first.prev == null && first.item != null)
91        */
92       transient Node<E> first;
93   
94       /**
95        * Pointer to last node.
96        * Invariant: (first == null && last == null) ||
97        *            (last.next == null && last.item != null)
98        */
99       transient Node<E> last;
100   
101       /**
102        * Constructs an empty list.
103        */
104       public LinkedList() {
105       }
106   
107       /**
108        * Constructs a list containing the elements of the specified
109        * collection, in the order they are returned by the collection's
110        * iterator.
111        *
112        * @param  c the collection whose elements are to be placed into this list
113        * @throws NullPointerException if the specified collection is null
114        */
115       public LinkedList(Collection<? extends E> c) {
116           this();
117           addAll(c);
118       }
119   
120       /**
121        * Links e as first element.
122        */
123       private void linkFirst(E e) {
124           final Node<E> f = first;
125           final Node<E> newNode = new Node<>(null, e, f);
126           first = newNode;
127           if (f == null)
128               last = newNode;
129           else
130               f.prev = newNode;
131           size++;
132           modCount++;
133       }
134   
135       /**
136        * Links e as last element.
137        */
138       void linkLast(E e) {
139           final Node<E> l = last;
140           final Node<E> newNode = new Node<>(l, e, null);
141           last = newNode;
142           if (l == null)
143               first = newNode;
144           else
145               l.next = newNode;
146           size++;
147           modCount++;
148       }
149   
150       /**
151        * Inserts element e before non-null Node succ.
152        */
153       void linkBefore(E e, Node<E> succ) {
154           // assert succ != null;
155           final Node<E> pred = succ.prev;
156           final Node<E> newNode = new Node<>(pred, e, succ);
157           succ.prev = newNode;
158           if (pred == null)
159               first = newNode;
160           else
161               pred.next = newNode;
162           size++;
163           modCount++;
164       }
165   
166       /**
167        * Unlinks non-null first node f.
168        */
169       private E unlinkFirst(Node<E> f) {
170           // assert f == first && f != null;
171           final E element = f.item;
172           final Node<E> next = f.next;
173           f.item = null;
174           f.next = null; // help GC
175           first = next;
176           if (next == null)
177               last = null;
178           else
179               next.prev = null;
180           size--;
181           modCount++;
182           return element;
183       }
184   
185       /**
186        * Unlinks non-null last node l.
187        */
188       private E unlinkLast(Node<E> l) {
189           // assert l == last && l != null;
190           final E element = l.item;
191           final Node<E> prev = l.prev;
192           l.item = null;
193           l.prev = null; // help GC
194           last = prev;
195           if (prev == null)
196               first = null;
197           else
198               prev.next = null;
199           size--;
200           modCount++;
201           return element;
202       }
203   
204       /**
205        * Unlinks non-null node x.
206        */
207       E unlink(Node<E> x) {
208           // assert x != null;
209           final E element = x.item;
210           final Node<E> next = x.next;
211           final Node<E> prev = x.prev;
212   
213           if (prev == null) {
214               first = next;
215           } else {
216               prev.next = next;
217               x.prev = null;
218           }
219   
220           if (next == null) {
221               last = prev;
222           } else {
223               next.prev = prev;
224               x.next = null;
225           }
226   
227           x.item = null;
228           size--;
229           modCount++;
230           return element;
231       }
232   
233       /**
234        * Returns the first element in this list.
235        *
236        * @return the first element in this list
237        * @throws NoSuchElementException if this list is empty
238        */
239       public E getFirst() {
240           final Node<E> f = first;
241           if (f == null)
242               throw new NoSuchElementException();
243           return f.item;
244       }
245   
246       /**
247        * Returns the last element in this list.
248        *
249        * @return the last element in this list
250        * @throws NoSuchElementException if this list is empty
251        */
252       public E getLast() {
253           final Node<E> l = last;
254           if (l == null)
255               throw new NoSuchElementException();
256           return l.item;
257       }
258   
259       /**
260        * Removes and returns the first element from this list.
261        *
262        * @return the first element from this list
263        * @throws NoSuchElementException if this list is empty
264        */
265       public E removeFirst() {
266           final Node<E> f = first;
267           if (f == null)
268               throw new NoSuchElementException();
269           return unlinkFirst(f);
270       }
271   
272       /**
273        * Removes and returns the last element from this list.
274        *
275        * @return the last element from this list
276        * @throws NoSuchElementException if this list is empty
277        */
278       public E removeLast() {
279           final Node<E> l = last;
280           if (l == null)
281               throw new NoSuchElementException();
282           return unlinkLast(l);
283       }
284   
285       /**
286        * Inserts the specified element at the beginning of this list.
287        *
288        * @param e the element to add
289        */
290       public void addFirst(E e) {
291           linkFirst(e);
292       }
293   
294       /**
295        * Appends the specified element to the end of this list.
296        *
297        * <p>This method is equivalent to {@link #add}.
298        *
299        * @param e the element to add
300        */
301       public void addLast(E e) {
302           linkLast(e);
303       }
304   
305       /**
306        * Returns {@code true} if this list contains the specified element.
307        * More formally, returns {@code true} if and only if this list contains
308        * at least one element {@code e} such that
309        * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
310        *
311        * @param o element whose presence in this list is to be tested
312        * @return {@code true} if this list contains the specified element
313        */
314       public boolean contains(Object o) {
315           return indexOf(o) != -1;
316       }
317   
318       /**
319        * Returns the number of elements in this list.
320        *
321        * @return the number of elements in this list
322        */
323       public int size() {
324           return size;
325       }
326   
327       /**
328        * Appends the specified element to the end of this list.
329        *
330        * <p>This method is equivalent to {@link #addLast}.
331        *
332        * @param e element to be appended to this list
333        * @return {@code true} (as specified by {@link Collection#add})
334        */
335       public boolean add(E e) {
336           linkLast(e);
337           return true;
338       }
339   
340       /**
341        * Removes the first occurrence of the specified element from this list,
342        * if it is present.  If this list does not contain the element, it is
343        * unchanged.  More formally, removes the element with the lowest index
344        * {@code i} such that
345        * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
346        * (if such an element exists).  Returns {@code true} if this list
347        * contained the specified element (or equivalently, if this list
348        * changed as a result of the call).
349        *
350        * @param o element to be removed from this list, if present
351        * @return {@code true} if this list contained the specified element
352        */
353       public boolean remove(Object o) {
354           if (o == null) {
355               for (Node<E> x = first; x != null; x = x.next) {
356                   if (x.item == null) {
357                       unlink(x);
358                       return true;
359                   }
360               }
361           } else {
362               for (Node<E> x = first; x != null; x = x.next) {
363                   if (o.equals(x.item)) {
364                       unlink(x);
365                       return true;
366                   }
367               }
368           }
369           return false;
370       }
371   
372       /**
373        * Appends all of the elements in the specified collection to the end of
374        * this list, in the order that they are returned by the specified
375        * collection's iterator.  The behavior of this operation is undefined if
376        * the specified collection is modified while the operation is in
377        * progress.  (Note that this will occur if the specified collection is
378        * this list, and it's nonempty.)
379        *
380        * @param c collection containing elements to be added to this list
381        * @return {@code true} if this list changed as a result of the call
382        * @throws NullPointerException if the specified collection is null
383        */
384       public boolean addAll(Collection<? extends E> c) {
385           return addAll(size, c);
386       }
387   
388       /**
389        * Inserts all of the elements in the specified collection into this
390        * list, starting at the specified position.  Shifts the element
391        * currently at that position (if any) and any subsequent elements to
392        * the right (increases their indices).  The new elements will appear
393        * in the list in the order that they are returned by the
394        * specified collection's iterator.
395        *
396        * @param index index at which to insert the first element
397        *              from the specified collection
398        * @param c collection containing elements to be added to this list
399        * @return {@code true} if this list changed as a result of the call
400        * @throws IndexOutOfBoundsException {@inheritDoc}
401        * @throws NullPointerException if the specified collection is null
402        */
403       public boolean addAll(int index, Collection<? extends E> c) {
404           checkPositionIndex(index);
405   
406           Object[] a = c.toArray();
407           int numNew = a.length;
408           if (numNew == 0)
409               return false;
410   
411           Node<E> pred, succ;
412           if (index == size) {
413               succ = null;
414               pred = last;
415           } else {
416               succ = node(index);
417               pred = succ.prev;
418           }
419   
420           for (Object o : a) {
421               @SuppressWarnings("unchecked") E e = (E) o;
422               Node<E> newNode = new Node<>(pred, e, null);
423               if (pred == null)
424                   first = newNode;
425               else
426                   pred.next = newNode;
427               pred = newNode;
428           }
429   
430           if (succ == null) {
431               last = pred;
432           } else {
433               pred.next = succ;
434               succ.prev = pred;
435           }
436   
437           size += numNew;
438           modCount++;
439           return true;
440       }
441   
442       /**
443        * Removes all of the elements from this list.
444        * The list will be empty after this call returns.
445        */
446       public void clear() {
447           // Clearing all of the links between nodes is "unnecessary", but:
448           // - helps a generational GC if the discarded nodes inhabit
449           //   more than one generation
450           // - is sure to free memory even if there is a reachable Iterator
451           for (Node<E> x = first; x != null; ) {
452               Node<E> next = x.next;
453               x.item = null;
454               x.next = null;
455               x.prev = null;
456               x = next;
457           }
458           first = last = null;
459           size = 0;
460           modCount++;
461       }
462   
463   
464       // Positional Access Operations
465   
466       /**
467        * Returns the element at the specified position in this list.
468        *
469        * @param index index of the element to return
470        * @return the element at the specified position in this list
471        * @throws IndexOutOfBoundsException {@inheritDoc}
472        */
473       public E get(int index) {
474           checkElementIndex(index);
475           return node(index).item;
476       }
477   
478       /**
479        * Replaces the element at the specified position in this list with the
480        * specified element.
481        *
482        * @param index index of the element to replace
483        * @param element element to be stored at the specified position
484        * @return the element previously at the specified position
485        * @throws IndexOutOfBoundsException {@inheritDoc}
486        */
487       public E set(int index, E element) {
488           checkElementIndex(index);
489           Node<E> x = node(index);
490           E oldVal = x.item;
491           x.item = element;
492           return oldVal;
493       }
494   
495       /**
496        * Inserts the specified element at the specified position in this list.
497        * Shifts the element currently at that position (if any) and any
498        * subsequent elements to the right (adds one to their indices).
499        *
500        * @param index index at which the specified element is to be inserted
501        * @param element element to be inserted
502        * @throws IndexOutOfBoundsException {@inheritDoc}
503        */
504       public void add(int index, E element) {
505           checkPositionIndex(index);
506   
507           if (index == size)
508               linkLast(element);
509           else
510               linkBefore(element, node(index));
511       }
512   
513       /**
514        * Removes the element at the specified position in this list.  Shifts any
515        * subsequent elements to the left (subtracts one from their indices).
516        * Returns the element that was removed from the list.
517        *
518        * @param index the index of the element to be removed
519        * @return the element previously at the specified position
520        * @throws IndexOutOfBoundsException {@inheritDoc}
521        */
522       public E remove(int index) {
523           checkElementIndex(index);
524           return unlink(node(index));
525       }
526   
527       /**
528        * Tells if the argument is the index of an existing element.
529        */
530       private boolean isElementIndex(int index) {
531           return index >= 0 && index < size;
532       }
533   
534       /**
535        * Tells if the argument is the index of a valid position for an
536        * iterator or an add operation.
537        */
538       private boolean isPositionIndex(int index) {
539           return index >= 0 && index <= size;
540       }
541   
542       /**
543        * Constructs an IndexOutOfBoundsException detail message.
544        * Of the many possible refactorings of the error handling code,
545        * this "outlining" performs best with both server and client VMs.
546        */
547       private String outOfBoundsMsg(int index) {
548           return "Index: "+index+", Size: "+size;
549       }
550   
551       private void checkElementIndex(int index) {
552           if (!isElementIndex(index))
553               throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
554       }
555   
556       private void checkPositionIndex(int index) {
557           if (!isPositionIndex(index))
558               throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
559       }
560   
561       /**
562        * Returns the (non-null) Node at the specified element index.
563        */
564       Node<E> node(int index) {
565           // assert isElementIndex(index);
566   
567           if (index < (size >> 1)) {
568               Node<E> x = first;
569               for (int i = 0; i < index; i++)
570                   x = x.next;
571               return x;
572           } else {
573               Node<E> x = last;
574               for (int i = size - 1; i > index; i--)
575                   x = x.prev;
576               return x;
577           }
578       }
579   
580       // Search Operations
581   
582       /**
583        * Returns the index of the first occurrence of the specified element
584        * in this list, or -1 if this list does not contain the element.
585        * More formally, returns the lowest index {@code i} such that
586        * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
587        * or -1 if there is no such index.
588        *
589        * @param o element to search for
590        * @return the index of the first occurrence of the specified element in
591        *         this list, or -1 if this list does not contain the element
592        */
593       public int indexOf(Object o) {
594           int index = 0;
595           if (o == null) {
596               for (Node<E> x = first; x != null; x = x.next) {
597                   if (x.item == null)
598                       return index;
599                   index++;
600               }
601           } else {
602               for (Node<E> x = first; x != null; x = x.next) {
603                   if (o.equals(x.item))
604                       return index;
605                   index++;
606               }
607           }
608           return -1;
609       }
610   
611       /**
612        * Returns the index of the last occurrence of the specified element
613        * in this list, or -1 if this list does not contain the element.
614        * More formally, returns the highest index {@code i} such that
615        * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>,
616        * or -1 if there is no such index.
617        *
618        * @param o element to search for
619        * @return the index of the last occurrence of the specified element in
620        *         this list, or -1 if this list does not contain the element
621        */
622       public int lastIndexOf(Object o) {
623           int index = size;
624           if (o == null) {
625               for (Node<E> x = last; x != null; x = x.prev) {
626                   index--;
627                   if (x.item == null)
628                       return index;
629               }
630           } else {
631               for (Node<E> x = last; x != null; x = x.prev) {
632                   index--;
633                   if (o.equals(x.item))
634                       return index;
635               }
636           }
637           return -1;
638       }
639   
640       // Queue operations.
641   
642       /**
643        * Retrieves, but does not remove, the head (first element) of this list.
644        *
645        * @return the head of this list, or {@code null} if this list is empty
646        * @since 1.5
647        */
648       public E peek() {
649           final Node<E> f = first;
650           return (f == null) ? null : f.item;
651       }
652   
653       /**
654        * Retrieves, but does not remove, the head (first element) of this list.
655        *
656        * @return the head of this list
657        * @throws NoSuchElementException if this list is empty
658        * @since 1.5
659        */
660       public E element() {
661           return getFirst();
662       }
663   
664       /**
665        * Retrieves and removes the head (first element) of this list.
666        *
667        * @return the head of this list, or {@code null} if this list is empty
668        * @since 1.5
669        */
670       public E poll() {
671           final Node<E> f = first;
672           return (f == null) ? null : unlinkFirst(f);
673       }
674   
675       /**
676        * Retrieves and removes the head (first element) of this list.
677        *
678        * @return the head of this list
679        * @throws NoSuchElementException if this list is empty
680        * @since 1.5
681        */
682       public E remove() {
683           return removeFirst();
684       }
685   
686       /**
687        * Adds the specified element as the tail (last element) of this list.
688        *
689        * @param e the element to add
690        * @return {@code true} (as specified by {@link Queue#offer})
691        * @since 1.5
692        */
693       public boolean offer(E e) {
694           return add(e);
695       }
696   
697       // Deque operations
698       /**
699        * Inserts the specified element at the front of this list.
700        *
701        * @param e the element to insert
702        * @return {@code true} (as specified by {@link Deque#offerFirst})
703        * @since 1.6
704        */
705       public boolean offerFirst(E e) {
706           addFirst(e);
707           return true;
708       }
709   
710       /**
711        * Inserts the specified element at the end of this list.
712        *
713        * @param e the element to insert
714        * @return {@code true} (as specified by {@link Deque#offerLast})
715        * @since 1.6
716        */
717       public boolean offerLast(E e) {
718           addLast(e);
719           return true;
720       }
721   
722       /**
723        * Retrieves, but does not remove, the first element of this list,
724        * or returns {@code null} if this list is empty.
725        *
726        * @return the first element of this list, or {@code null}
727        *         if this list is empty
728        * @since 1.6
729        */
730       public E peekFirst() {
731           final Node<E> f = first;
732           return (f == null) ? null : f.item;
733        }
734   
735       /**
736        * Retrieves, but does not remove, the last element of this list,
737        * or returns {@code null} if this list is empty.
738        *
739        * @return the last element of this list, or {@code null}
740        *         if this list is empty
741        * @since 1.6
742        */
743       public E peekLast() {
744           final Node<E> l = last;
745           return (l == null) ? null : l.item;
746       }
747   
748       /**
749        * Retrieves and removes the first element of this list,
750        * or returns {@code null} if this list is empty.
751        *
752        * @return the first element of this list, or {@code null} if
753        *     this list is empty
754        * @since 1.6
755        */
756       public E pollFirst() {
757           final Node<E> f = first;
758           return (f == null) ? null : unlinkFirst(f);
759       }
760   
761       /**
762        * Retrieves and removes the last element of this list,
763        * or returns {@code null} if this list is empty.
764        *
765        * @return the last element of this list, or {@code null} if
766        *     this list is empty
767        * @since 1.6
768        */
769       public E pollLast() {
770           final Node<E> l = last;
771           return (l == null) ? null : unlinkLast(l);
772       }
773   
774       /**
775        * Pushes an element onto the stack represented by this list.  In other
776        * words, inserts the element at the front of this list.
777        *
778        * <p>This method is equivalent to {@link #addFirst}.
779        *
780        * @param e the element to push
781        * @since 1.6
782        */
783       public void push(E e) {
784           addFirst(e);
785       }
786   
787       /**
788        * Pops an element from the stack represented by this list.  In other
789        * words, removes and returns the first element of this list.
790        *
791        * <p>This method is equivalent to {@link #removeFirst()}.
792        *
793        * @return the element at the front of this list (which is the top
794        *         of the stack represented by this list)
795        * @throws NoSuchElementException if this list is empty
796        * @since 1.6
797        */
798       public E pop() {
799           return removeFirst();
800       }
801   
802       /**
803        * Removes the first occurrence of the specified element in this
804        * list (when traversing the list from head to tail).  If the list
805        * does not contain the element, it is unchanged.
806        *
807        * @param o element to be removed from this list, if present
808        * @return {@code true} if the list contained the specified element
809        * @since 1.6
810        */
811       public boolean removeFirstOccurrence(Object o) {
812           return remove(o);
813       }
814   
815       /**
816        * Removes the last occurrence of the specified element in this
817        * list (when traversing the list from head to tail).  If the list
818        * does not contain the element, it is unchanged.
819        *
820        * @param o element to be removed from this list, if present
821        * @return {@code true} if the list contained the specified element
822        * @since 1.6
823        */
824       public boolean removeLastOccurrence(Object o) {
825           if (o == null) {
826               for (Node<E> x = last; x != null; x = x.prev) {
827                   if (x.item == null) {
828                       unlink(x);
829                       return true;
830                   }
831               }
832           } else {
833               for (Node<E> x = last; x != null; x = x.prev) {
834                   if (o.equals(x.item)) {
835                       unlink(x);
836                       return true;
837                   }
838               }
839           }
840           return false;
841       }
842   
843       /**
844        * Returns a list-iterator of the elements in this list (in proper
845        * sequence), starting at the specified position in the list.
846        * Obeys the general contract of {@code List.listIterator(int)}.<p>
847        *
848        * The list-iterator is <i>fail-fast</i>: if the list is structurally
849        * modified at any time after the Iterator is created, in any way except
850        * through the list-iterator's own {@code remove} or {@code add}
851        * methods, the list-iterator will throw a
852        * {@code ConcurrentModificationException}.  Thus, in the face of
853        * concurrent modification, the iterator fails quickly and cleanly, rather
854        * than risking arbitrary, non-deterministic behavior at an undetermined
855        * time in the future.
856        *
857        * @param index index of the first element to be returned from the
858        *              list-iterator (by a call to {@code next})
859        * @return a ListIterator of the elements in this list (in proper
860        *         sequence), starting at the specified position in the list
861        * @throws IndexOutOfBoundsException {@inheritDoc}
862        * @see List#listIterator(int)
863        */
864       public ListIterator<E> listIterator(int index) {
865           checkPositionIndex(index);
866           return new ListItr(index);
867       }
868   
869       private class ListItr implements ListIterator<E> {
870           private Node<E> lastReturned = null;
871           private Node<E> next;
872           private int nextIndex;
873           private int expectedModCount = modCount;
874   
875           ListItr(int index) {
876               // assert isPositionIndex(index);
877               next = (index == size) ? null : node(index);
878               nextIndex = index;
879           }
880   
881           public boolean hasNext() {
882               return nextIndex < size;
883           }
884   
885           public E next() {
886               checkForComodification();
887               if (!hasNext())
888                   throw new NoSuchElementException();
889   
890               lastReturned = next;
891               next = next.next;
892               nextIndex++;
893               return lastReturned.item;
894           }
895   
896           public boolean hasPrevious() {
897               return nextIndex > 0;
898           }
899   
900           public E previous() {
901               checkForComodification();
902               if (!hasPrevious())
903                   throw new NoSuchElementException();
904   
905               lastReturned = next = (next == null) ? last : next.prev;
906               nextIndex--;
907               return lastReturned.item;
908           }
909   
910           public int nextIndex() {
911               return nextIndex;
912           }
913   
914           public int previousIndex() {
915               return nextIndex - 1;
916           }
917   
918           public void remove() {
919               checkForComodification();
920               if (lastReturned == null)
921                   throw new IllegalStateException();
922   
923               Node<E> lastNext = lastReturned.next;
924               unlink(lastReturned);
925               if (next == lastReturned)
926                   next = lastNext;
927               else
928                   nextIndex--;
929               lastReturned = null;
930               expectedModCount++;
931           }
932   
933           public void set(E e) {
934               if (lastReturned == null)
935                   throw new IllegalStateException();
936               checkForComodification();
937               lastReturned.item = e;
938           }
939   
940           public void add(E e) {
941               checkForComodification();
942               lastReturned = null;
943               if (next == null)
944                   linkLast(e);
945               else
946                   linkBefore(e, next);
947               nextIndex++;
948               expectedModCount++;
949           }
950   
951           final void checkForComodification() {
952               if (modCount != expectedModCount)
953                   throw new ConcurrentModificationException();
954           }
955       }
956   
957       private static class Node<E> {
958           E item;
959           Node<E> next;
960           Node<E> prev;
961   
962           Node(Node<E> prev, E element, Node<E> next) {
963               this.item = element;
964               this.next = next;
965               this.prev = prev;
966           }
967       }
968   
969       /**
970        * @since 1.6
971        */
972       public Iterator<E> descendingIterator() {
973           return new DescendingIterator();
974       }
975   
976       /**
977        * Adapter to provide descending iterators via ListItr.previous
978        */
979       private class DescendingIterator implements Iterator<E> {
980           private final ListItr itr = new ListItr(size());
981           public boolean hasNext() {
982               return itr.hasPrevious();
983           }
984           public E next() {
985               return itr.previous();
986           }
987           public void remove() {
988               itr.remove();
989           }
990       }
991   
992       @SuppressWarnings("unchecked")
993       private LinkedList<E> superClone() {
994           try {
995               return (LinkedList<E>) super.clone();
996           } catch (CloneNotSupportedException e) {
997               throw new InternalError();
998           }
999       }
1000   
1001       /**
1002        * Returns a shallow copy of this {@code LinkedList}. (The elements
1003        * themselves are not cloned.)
1004        *
1005        * @return a shallow copy of this {@code LinkedList} instance
1006        */
1007       public Object clone() {
1008           LinkedList<E> clone = superClone();
1009   
1010           // Put clone into "virgin" state
1011           clone.first = clone.last = null;
1012           clone.size = 0;
1013           clone.modCount = 0;
1014   
1015           // Initialize clone with our elements
1016           for (Node<E> x = first; x != null; x = x.next)
1017               clone.add(x.item);
1018   
1019           return clone;
1020       }
1021   
1022       /**
1023        * Returns an array containing all of the elements in this list
1024        * in proper sequence (from first to last element).
1025        *
1026        * <p>The returned array will be "safe" in that no references to it are
1027        * maintained by this list.  (In other words, this method must allocate
1028        * a new array).  The caller is thus free to modify the returned array.
1029        *
1030        * <p>This method acts as bridge between array-based and collection-based
1031        * APIs.
1032        *
1033        * @return an array containing all of the elements in this list
1034        *         in proper sequence
1035        */
1036       public Object[] toArray() {
1037           Object[] result = new Object[size];
1038           int i = 0;
1039           for (Node<E> x = first; x != null; x = x.next)
1040               result[i++] = x.item;
1041           return result;
1042       }
1043   
1044       /**
1045        * Returns an array containing all of the elements in this list in
1046        * proper sequence (from first to last element); the runtime type of
1047        * the returned array is that of the specified array.  If the list fits
1048        * in the specified array, it is returned therein.  Otherwise, a new
1049        * array is allocated with the runtime type of the specified array and
1050        * the size of this list.
1051        *
1052        * <p>If the list fits in the specified array with room to spare (i.e.,
1053        * the array has more elements than the list), the element in the array
1054        * immediately following the end of the list is set to {@code null}.
1055        * (This is useful in determining the length of the list <i>only</i> if
1056        * the caller knows that the list does not contain any null elements.)
1057        *
1058        * <p>Like the {@link #toArray()} method, this method acts as bridge between
1059        * array-based and collection-based APIs.  Further, this method allows
1060        * precise control over the runtime type of the output array, and may,
1061        * under certain circumstances, be used to save allocation costs.
1062        *
1063        * <p>Suppose {@code x} is a list known to contain only strings.
1064        * The following code can be used to dump the list into a newly
1065        * allocated array of {@code String}:
1066        *
1067        * <pre>
1068        *     String[] y = x.toArray(new String[0]);</pre>
1069        *
1070        * Note that {@code toArray(new Object[0])} is identical in function to
1071        * {@code toArray()}.
1072        *
1073        * @param a the array into which the elements of the list are to
1074        *          be stored, if it is big enough; otherwise, a new array of the
1075        *          same runtime type is allocated for this purpose.
1076        * @return an array containing the elements of the list
1077        * @throws ArrayStoreException if the runtime type of the specified array
1078        *         is not a supertype of the runtime type of every element in
1079        *         this list
1080        * @throws NullPointerException if the specified array is null
1081        */
1082       @SuppressWarnings("unchecked")
1083       public <T> T[] toArray(T[] a) {
1084           if (a.length < size)
1085               a = (T[])java.lang.reflect.Array.newInstance(
1086                                   a.getClass().getComponentType(), size);
1087           int i = 0;
1088           Object[] result = a;
1089           for (Node<E> x = first; x != null; x = x.next)
1090               result[i++] = x.item;
1091   
1092           if (a.length > size)
1093               a[size] = null;
1094   
1095           return a;
1096       }
1097   
1098       private static final long serialVersionUID = 876323262645176354L;
1099   
1100       /**
1101        * Saves the state of this {@code LinkedList} instance to a stream
1102        * (that is, serializes it).
1103        *
1104        * @serialData The size of the list (the number of elements it
1105        *             contains) is emitted (int), followed by all of its
1106        *             elements (each an Object) in the proper order.
1107        */
1108       private void writeObject(java.io.ObjectOutputStream s)
1109           throws java.io.IOException {
1110           // Write out any hidden serialization magic
1111           s.defaultWriteObject();
1112   
1113           // Write out size
1114           s.writeInt(size);
1115   
1116           // Write out all elements in the proper order.
1117           for (Node<E> x = first; x != null; x = x.next)
1118               s.writeObject(x.item);
1119       }
1120   
1121       /**
1122        * Reconstitutes this {@code LinkedList} instance from a stream
1123        * (that is, deserializes it).
1124        */
1125       @SuppressWarnings("unchecked")
1126       private void readObject(java.io.ObjectInputStream s)
1127           throws java.io.IOException, ClassNotFoundException {
1128           // Read in any hidden serialization magic
1129           s.defaultReadObject();
1130   
1131           // Read in size
1132           int size = s.readInt();
1133   
1134           // Read in all elements in the proper order.
1135           for (int i = 0; i < size; i++)
1136               linkLast((E)s.readObject());
1137       }
1138   }

Save This PageHome » openjdk-7 » java » util » [javadoc | source] 