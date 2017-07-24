# ScoreBoard
Maintains a sequence of high scores. A scoreboard is limited to a number of high scores that can be saved. Once that limit is reached, a new score is added only if it is strictly higher than the lowest `high score` on the board.


## Assumption
Since this is a list of high score, there will be an assumption that the list is stored in a sorted order of the score.

## Operations

* Add