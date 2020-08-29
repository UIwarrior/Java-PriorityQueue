# Java-PriorityQueue


Priority Queue ADT has a class in java for it through which you can directly implement some functions like:
poll() : It returns the minimum element from the priority queue as it will have the highest priority and
then removes that element.
peek() : It returns the smallest element from the priority queue as it will have the highest priority .
add(T element) : It adds an element in the priority queue of type T.
isEmpty(), which returns true if the priority queue is empty and false otherwise.
size() which returns the size of the priority queue.


Consider structure of selling tickets on the basis of their priority and not in the order they came in is analogous
to an abstract data structure called “Priority Queue”. In a Priority queue, the element with the highest
priority will go out first and the one with least priority will go in last.

In computers the highest priority element is shown with least integral value of priority In case of tickets
club ticket will get a priority of 1 and counter ticket will get a priority of 4.

A Priority queue is therefore anything:
1. into which you remove (removeMin) things from the front of the queue.
2. that removes the highest priority element first from the queue.

Lists are not the most efficient way to implement Priority queue, as you can see in the above table. Overall
Big O for all operations is O(n). So, we have an alternative implementation for that known as Binary Heaps.
Heaps can implement all of the operations of Priority Queue in maximum O(log n) time

Binary Heap has two basic properties:
• They are complete binary trees
• Order property: They maintain a hierarchical (level-wise) order among the nodes of their trees.

 Also, there are two types of heaps:
• Min-heap
• Max-heap
In min-heap the minimum element is always at the root node. While in max-heap maximum element is
always at the root node. 

Addition or removal from a heap is done always from the last node. The minimum value, which is at the
root node, cannot be removed directly. First, it is swapped with the last node and then it is deleted from
the last node.
Any modifier operation( add or removeMin) performed on heap will lead to the disturbance of heap
property. So, we have to perform Heapify operation to restore the heap property:
There are two heapify operations:
• HeapifyUp is used during insertions
• HeapifyDown is used during deletions

Heap in Java is implemented as an array. In the array, the root node is the initial element of the array and
any child node’s index is 2*i or 2*i+1, if the parent’s index is i. In this implementation the array starts with
index 1.

Both addition and deletion in a heap takes O(log n) time.

Heap Sort

Initially on receiving an unsorted list, the first step in heap sort is to create a Heap data structure(MaxHeap or Min-Heap). Once heap is built, the first element of the Heap is either largest or
smallest(depending upon Max-Heap or Min-Heap), so we put the first element of the heap in our array.
Then we again make heap using the remaining elements, to again pick the first element of the heap and
put it into the array. We keep on doing the same repeatedly untill we have the complete sorted list in our
array. So, Priority Queues can be implemented using a heap to better its performance. Heap sort is not a
Stable sort, and requires a constant space for sorting a list. 

There are many uses of priority queues and heaps. Some of them are:
• Event-driven simulation: customers in a line
• Collision detection: "next time of contact" for colliding bodies
• Data compression: Huffman coding
• Graph searching: Dijkstra's algorithm, Prim's algorithm
• AI Path Planning: A* search
• Statistics: maintain largest M values in a sequence
• Operating systems: load balancing, interrupt handling
• Discrete optimization: bin packing, scheduling
• Spam filtering: Bayesian spam filter