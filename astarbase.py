import pygame
import random
import time
#https://www.geeksforgeeks.org/a-search-algorithm/

pygame.init()
pygame.font.init()

res = (450, 450)

MAX = 20
Goal = ()
def GoalInit():
    return (random.randint(0, (MAX - 1)), random.randint(0, (MAX - 1)))

Goal = GoalInit()
print(Goal)

screen = pygame.display.set_mode(res)

Grid = [[("s" if((i == 0) and (j == 0)) else "e" if ((i == Goal[0]) and (j == Goal[1])) else "n") for i in range(20)] for j in range(20)]

#Grid = start()
#begin()

#pygame.draw.rect(screen, color, pygame.Rect(XCoord, YCoord, Length, Width))


Start = (0, 0)
Startcol = (0, 0, 255)
GoalCol = (255, 215, 0)
Other = (0, 255, 0)
run = True
#only one max val bc its a square

#Manhattan Distance –

#It is nothing but the sum of absolute values of differences in the goal’s x and y coordinates and the current cell’s x and y coordinates respectively, i.e.,
# h = abs (current_cell.x – goal.x) + 
#     abs (current_cell.y – goal.y) 

targetfps = 60
 
clock = pygame.time.Clock()
curr = Start

time.sleep(5)

while(run == True):
    #curr = ()
    goal = Goal
    c = 0
    for col in Grid:
        v = 0
        for o in col:
            if(o == "s"):
                pygame.draw.rect(screen, Startcol, pygame.Rect((c*21), (v*21), 20, 20))
                #curr = (c, v)
            elif(o == "e"):
                pygame.draw.rect(screen, GoalCol, pygame.Rect((c*21), (v*21), 20, 20))
            else:
                pygame.draw.rect(screen, Other, pygame.Rect((c*21), (v*21), 20, 20))



            v += 1

        c += 1
    if(not (curr == Goal)):
        #basically if we're not at the goal
        CurrH = abs(curr[0] - goal[0]) + abs(curr[1] - goal[1])
        print(CurrH)
        adjoining = []
        #fix the weird 'this if that' in adjoining.append bc python no like that
        #URGENT ^^^
        if((curr[1] + 1) < MAX): adjoining.append((curr[0], curr[1] + 1)) #the block *above*
        if((curr[1] - 1) >= 0): adjoining.append((curr[0], curr[1] - 1)) #the block *below*
        if((curr[0] + 1) < MAX): adjoining.append((curr[0] + 1, curr[1])) #the block to the *right*
        if((curr[0] - 1) >= 0):adjoining.append((curr[0] - 1, curr[1])) #the block to the *left*
        HDict = {}
        for obj in adjoining:
            HDict[obj] = (abs(obj[0] - goal[0]) + abs(obj[1] - goal[1]))
        #sort Heuristic Array by val
        #thanks @ https://www.saltycrane.com/blog/2007/09/how-to-sort-python-dictionary-by-keys/
        getH = 0
        SmallestH = ()
        for key, value in sorted(HDict.items(), key=lambda item: item[1]):
            print("%s: %s" % (key, value))
            if(getH == 0):
                #SmallestH = HDict[i]
                SmallestH = key
            getH += 1

        #print(HDict)

        print(SmallestH)
        
        
        #get the smallest value bc the dict was sorted by the items so now the smallest H val is now @ front

        #getH = 0
        #SmallestH = ()
        #for i in HDict:
        #    if(getH == 0):
        #        #SmallestH = HDict[i]
        #        SmallestH = i
        #    getH += 1

        #SmallestH is now the idealplace
        Grid[SmallestH[1]][SmallestH[0]] = 's'
        curr = SmallestH
    else:
        print("Algorithm Completed")
        Goal = GoalInit()
        #Grid = start()
        #begin()
        a = [[("s" if((f == curr[0]) and (j == cur[1])) else "e" if ((f == Goal[0]) and (j == Goal[1])) else "n") for f in range(20)] for j in range(20)]
        Grid = a
        #curr = Start
        
        #time.sleep(3)
        #time.sleep(100)
                
    clock.tick(targetfps)
    pygame.display.flip()
