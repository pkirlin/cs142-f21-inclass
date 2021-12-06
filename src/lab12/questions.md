# Lab 12: Linked Lists

## Names:
- Name 1
- Name 2
- Name 3

## Part A: The `Node` Class

Open `Node.java`.  This is a very simple class that represents
a "Node" in a linked list.

- What instance variables does this class have?  What are their
data types?

__Your answer here.__

This is the first time we have seen class that holds a reference
to another object of that same class as an instance variable.
This is an example of a *recursive data structure*: a class that 
holds a reference to another object of the same type.  Recursive
functions call themselves, while recursive data types are allowed
to contain references to themselves.

To make our lives easier, however, when drawing recursive data 
structures, we usually do not depict them as "containing" each other
or being "inside" each other.  In other words, even though a Node
object has a reference to another Node inside it, we normally do
not draw the second node inside the first one, but rather beside it.

Take a look at NodeDemo.java.  Look at demo1().   

- On your handout, draw a picture of node 1 in Box A (see the
code to know exactly what to draw.)

- Fill in boxes B and C with illustrations as the code directs you.

- Write lines of code as directed to print the 10, 20, and 30
as specified.  Run the code to verify it works.

- How many elements are in this linked list?  
(What is its size/length?)

__Your answer here.__

- Explain what distinguishes the last node in a linked list
from all other nodes in the list:

__Your answer here.__

## Part B: More Nodes

In main(), comment out the call to demo1() and uncomment the 
call to demo2().  Read through the demo2() code.

- Fill in the drawings in boxes D, E, F, and G as directed.

Normally, linked lists often are represented only by a single 
reference to the first node in the list, which is called the
*head* or sometimes the *front* of the list.  This is the `head`
variable here.

It is important to distinguish Node objects from the data instance
variable within the Node class.  A Node is the entire structure
(the two-element box we draw).  *Inside* that box are two variables,
the `data` variable (an integer here) and the `next` variable, 
which "points to" the following Node object.  Do not mix these up!  
For instance, it is very common to think that a `next` reference 
points to a `data` variable inside the following Node, but it
truly points to the entire box that represents the Node.

- If `head` points to the *first* node in the list, what does 
`head.next` point to?

__Your answer here.__

- What does `head.next.data` refer to?  How is this different from
`head.next`?

__Your answer here.__

Look over the block of code with the while loop towards the end
of demo2().  

- Before the loop begins, which node of the list does `curr`
point to?

__Your answer here.__

- In Box I, draw the entire linked list, along with the `head`
  and `curr` references, with arrows indicating the state of
  these variables before the loop begins.

- The line of code in the loop that says `curr = curr.next`
(obviously) changes the `curr` variable.  Which node of the
list does `curr` point to after the loop has completed one
iteration?

__Your answer here.__

- In Box I, draw the entire linked list, along with the `head`
and `curr` references, with arrows indicating the state of
these variables after the loop has completed one iteration
(so about to begin the second time through).

- The loop keeps going as long as `curr != null`.  So therefore
the loop *stops* when what is true?

__Your answer here.__

- What do you therefore know has happened when the loop ends?  
(This answer should be more abstract/at a higher level of 
knowledge than what you wrote for the two previous answers.
In other words, don't just talk about variables and their values.)

__Your answer here.__

- What do you think the loop does?  Specifically, what does 
the `i` variable hold after the loop finishes?  Add a print
statement to the code to verify your answer.

__Your answer here.__

The "canonical loop" that many linked list algorithms use
looks like this:

Node curr = head;            // initialize curr
while (curr != null) {       // while curr still points to a valid node
  // do something with curr
  curr = curr.next;          // move curr to point to the following node
}

This is called "traversing" the linked list.  It has the same
basic functionality as the "canonical loop" that we use to process
the elements in an ArrayList:

for (int i = 0; i < list.size(); i++) {
  // do something with list[i] or list.get(i)
}

Both loops have four basic pieces, though they are 
expressed differently depending on whether we are using
a linked list or arraylist:

(1) A piece to initialize our place in the list to the beginning:
    Either `Node curr = head` or `int i = 0`
(2) A piece to stop the loop at the right time:
    Either `curr != null` or `i < list.size()`
(3) A piece to advance the variable that keeps track of where we are:
    Either `curr = curr.next` or `i++`
(4) A piece to process an element in the list:
    Either doing something with `curr.data` or list[i] or list.get(i)

Notice that in the linked list version, the variable `curr` takes
the place of the variable `i` in the array version, and while they
have two different data types (a Node vs an int), they serve the
same purpose: they keep track of the "current position" within the 
list.

- Modify the loop to print all the numbers in the linked list.
When done, your code for demo2() should output `1 2 3 4` or 
or something very similar (line breaks are ok).

## Part C: The LinkedList class

Open LinkedList.java and LinkedListDemo.java.  Run LinkedListDemo.

- Why are the numbers added in the order 1, 2, 3, but printed
in reverse?

__Your answer here.__

- Look at the code for addFirst().  What is the big-oh time
of this algorithm?  Figure this out by looking at the code,
not running it or timing it by hand.

__Your answer here.__

- What was the big-oh time for adding an element at the 
beginning of an ArrayList?  Figure this out by looking at the code,
not running it or timing it by hand.

__Your answer here.__

- So if we only evaluated the choice between an ArrayList
and a linked list by the speed of the "add an element to the
front of the list" algorithm, which type of list should 
we pick?

__Your answer here.__

- Look at the code for get() in LinkedList.  
What is the big-oh time of this algorithm?  Figure this out 
by looking at the code, not running it or timing it by hand.

__Your answer here.__

- What was the big-oh time for getting a specific
element in an ArrayList?  Figure this out
by looking at the code, not running it or timing it by hand.

__Your answer here.__

- So if we only evaluated the choice between an ArrayList
and a linked list by the speed of the "retrieve the item
at a particular index" algorithm, which type of list should
we pick?

__Your answer here.__

- Based on these answers, when would you want to use
an arraylist versus a linked list?

__Your answer here.__

- Look at the code for addToBack(), and compare it to
addToFront().  What is the big-oh time of addToBack()?

__Your answer here.__

- Why does addToBack() have a loop in the `else` clause
but addToFront() does not?  Why is this loop necessary?

__Your answer here.__

- Following the model of the size(), contains(), and
toString() methods, add a method to the LinkedList class
that adds up all the elements in the list and returns
this sum.  The method declaration will look like:

public int sum() 

Test your method by adding code to LinkedListDemo.