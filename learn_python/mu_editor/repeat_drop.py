import pgzrun
y = 10
def draw():
    screen.fill('white')
    screen.draw.filled_circle((400, y), 30, 'red') 
def update():
    global y
    y = y + 5
    if y > 630: y = 0
pgzrun.go()