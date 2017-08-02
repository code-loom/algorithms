# ScoreBoard
Maintains a score board. A scoreboard is limited to a max number of high scores that can be saved. Once that limit is reached, a new score is added only if it is strictly higher than the lowest `high score` on the board.


## Assumption

* Since this is a list of high score, there will be an assumption that the list is stored in a sorted order of the score.
* Once an entry is done on a score board, it cannot be taken off


## Operations

* Add