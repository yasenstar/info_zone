import pgzrun
def draw():
    screen.fill('white')
    screen.draw.filled_circle((400, 300), 249, 'yellow') # face filled
    screen.draw.circle((400, 300), 250, 'black') # face outline
    screen.draw.circle((400, 300), 20, 'black')  # nose
    screen.draw.filled_circle((400, 430), 70, 'red') # mouth
    screen.draw.filled_circle((300, 200), 80, 'white') # left eye outline
    screen.draw.filled_circle((500, 200), 80, 'white') # right eye outline
    screen.draw.filled_circle((280, 200), 40, 'black') # left inner eye
    screen.draw.filled_circle((480, 200), 40, 'black') # right inner eye
pgzrun.go()