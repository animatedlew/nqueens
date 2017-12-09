# nQueens Solver
This toy application explores using a depth-first backtracking algorithm to solve the nQueens problem. 
For more information, please checkout [Eight Queens Puzzle](https://en.wikipedia.org/wiki/Eight_queens_puzzle]) and
[Backtracking Algorithms](https://web.archive.org/web/20070317015632/http://www.cse.ohio-state.edu/~gurari/course/cis680/cis680Ch19.html#QQ1-51-128).

# Backtracking Algorithm Notes
The efficiency of this nQueens solver comes from the `placeQueen` method. In backtracking terms, it takes on the
role of rejecting unsafe Queen positions. The recursive nature of this algorithm uses the stack as an implied
tree structure.
 
# Other Applications
Backtracking parsers can help try grammar alternatives that have similar initial paths. Memoisation and early rejection
can help the performance of these parsers.

Sudoku solvers can find solutions to puzzles by applying possible permutations to a row and backtracking early if a
solution was not found for that tree branch.