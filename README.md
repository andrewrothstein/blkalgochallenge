BLK Algo Challenge by Ryan Witko
================
Challenge 5
Consider a circular ring with N evenly-spaced nodes around the edge.  Imagine there is one ant placed on each node, numbered in order from 0 to N-1.  At each time step, each ant either moves left or right along the ring.  On the first time step, the prime-numbered ants move left while all the others move right (0 and 1 are not prime).  To begin, each ant has a speed of one node per time step.  However, if two or more ants arrive at the same node at the same time, their speeds each increase by one node per time step.

We’ll call a ring balanced if each node has one and only one ant on it.  So a ring starts balanced but becomes unbalanced once the ants start moving.  For a ring of size 5, it takes 9 iterations until the ring again becomes balanced.  For a ring of size 7 it takes 115 iterations before becoming balanced again.  How many iterations does it take until a ring of size 11 becomes balanced again?

0 -> 1 (2)
1 -> 2 (2)
2 -> 1 (2)
3 -> 2 (2)
4 -> 0