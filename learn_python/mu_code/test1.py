# Write your code here :-)
import pgzrun
r = 1
def draw():
    screen.fill('white')
    screen.draw.filled_circle((400,300), r, 'blue')
def update():
    global r
    r = r + 1
pgzrun.go()
