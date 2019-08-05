import pygame
import numpy as np
from snake import snake as snake

#assist from morzack on github

pygame.init()
pygame.font.init()

snek = snake()

CellGridSize = (50, 50)
CellSize = (10, 10)
pad = 5
res = (CellGridSize[0] * (CellSize[0] + pad), CellGridSize[1] * (CellSize[1] + pad))

screen = pygame.display.set_mode(res)

#will rewrite array with the direction the snek is going
#       0           1       2           3           4
#   placeholder    up       down        left        right
#
#
#


MvmtGrid = np.array([[0 for i in range(CellGridSize[0])] for j in range(CellGridSize[1])])
SnekGrid = np.array([['n' for i in range(CellGridSize[0])] for j in range(CellGridSize[1])])
#in this, the letter 's' will refer to the snake body while 'h' will refer to the head and 'n' will mean "nothing"

bodylet = 's'
hedlet = 'h'
nolet = 'n'

SnekGrid[0][0] = bodylet
SnekGrid[1][0] = bodylet
SnekGrid[2][0] = hedlet

running = True

#color of snake will be white on black background
targetfps = 60

clock = pygame.time.Clock()
snakelocs = []
#starting snake length is 3 blocks

while (running == True):
    print("hi")
    colcount = 0
    for col in MvmtGrid:
        rowcount = 0
        for row in MvmtGrid:
            print("hi")


    clock.tick(targetfps)
    pygame.display.flip()
