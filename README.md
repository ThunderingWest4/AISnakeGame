# AISnakeGame
Intially built with a version of the A* Algorithm. 

# Resources 
(that I can remember)
https://medium.com/@nicholas.w.swift/easy-a-star-pathfinding-7e6689c7f7b2

# Done
Working A* version with some bugs like the snake cornering itself in its body or border, but that's to be expected. 
It's really not that smart

# Future
Build with a Neural Network (keras/scikit-learn)

Input: 9 Neurons. 8 are the cells around it (N, NW, W, SW, S, SE, E, NE -> 0 = no cell, 1 = body, 2 = goal) and 9th is a heuristic/A* calculation

Output: 4 Neurons (Left, Right, Up/Forward, Back/Down)

Hidden Layers: 2 Layers, 10 Neurons each. 

Activation: Relu

Fitness/Score is judged by Apples eaten and time alive. More details TBD
