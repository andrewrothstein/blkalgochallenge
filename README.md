BLK Algo Challenge by Ryan Witko
================
Challenge 5
Consider a circular ring with N evenly-spaced nodes around the edge.  Imagine there is one ant placed on each node, numbered in order from 0 to N-1.  At each time step, each ant either moves left or right along the ring.  On the first time step, the prime-numbered ants move left while all the others move right (0 and 1 are not prime).  To begin, each ant has a speed of one node per time step.  However, if two or more ants arrive at the same node at the same time, their speeds each increase by one node per time step.

We’ll call a ring balanced if each node has one and only one ant on it.  So a ring starts balanced but becomes unbalanced once the ants start moving.  For a ring of size 5, it takes 9 iterations until the ring again becomes balanced.  For a ring of size 7 it takes 115 iterations before becoming balanced again.  How many iterations does it take until a ring of size 11 becomes balanced again?

Challenge 6
Consider a 5x5 square of integers spiraling counterclockwise from the middle, where each new layer begins to the immediate left of the last element of the previous layer:

25 24 23 22 21
10 09 08 07 20
11 02 01 06 19
12 03 04 05 18
13 14 15 16 17

The sum of the elements on the two diagonals is 101 (the center is only counted once).

Now consider a 5x5x5 cube consisting of five 5x5 spirals stacked from bottom to top:

Bottom:                                                             Top:
25 24 23 22 21   50 49 48 47 46   75 74 73 72 71  100 99 98 97 96   125 124 123 122 121
10 09 08 07 20   35 34 33 32 45   60 59 58 57 70   85 84 83 82 95   110 109 108 107 120
11 02 01 06 19   36 27 26 31 44   61 52 51 56 69   86 77 76 81 94   111 102 101 106 119
12 03 04 05 18   37 28 29 30 43   62 53 54 55 68   87 78 79 80 93   112 103 104 105 118
13 14 15 16 17   38 39 40 41 42   63 64 65 66 67   88 89 90 91 92   113 114 115 116 117

The sum of the elements on the 4 diagonals is 1061.

What is the sum of the elements on the 4 diagonals of a 25x25x25 cube?
