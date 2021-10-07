-- load our assets
function love.load()
    -- load all assets here
    local myfont = love.graphics.newFont(45)
    love.graphics.setFont(myfont)
    love.graphics.setColor(0,0,0,225)
    love.graphics.setBackgroundColor(255,153,0)
end

-- update event
function love.update()
-- do the maths
end

-- draw display
function love.draw()
-- describe how you want / what to draw.
    love.graphics.print('Hello World from Yasen!', 200, 200)
end