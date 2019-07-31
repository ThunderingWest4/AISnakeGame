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


TheGrid = np.array([[0 for i in range(CellGridSize[0])] for j in range(CellGridSize[1])])

running = True

#color of snake will be white on black background
targetfps = 60

clock = pygame.time.Clock()
snakelocs = []

while (running == True):
    print("hi")
    clock.tick(targetfps)
    pygame.display.flip()
