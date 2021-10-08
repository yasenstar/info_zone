N = 8

-- 检查(n,c)是否不会被攻击
function isplaceok(a, n, c)
    for i = 1, n - 1 do     -- 对于每一个已经被放置的皇后
        if (a[i] == c) or   -- 同一列？
            (a[i] - i == c - n) or      -- 同一对角线？
            (a[i] + i == c + n) then    -- 同一对角线？
            return false    -- 位置会被攻击
        end
    end
    return true     -- 不会被攻击；位置有效
end

-- 打印棋盘
function printsolution(a)
    for i = 1, N do
        for j = 1, N do
            io.write(a[i] == j and "X" or "-", " ")
        end
        io.write("\n")
    end
    io.write("\n")
end

function addqueen(a, n)
    if n > N then
        printsolution(a)
    else
        for c = 1, N do
            if isplaceok(a, n, c) then
                a[n] = c
                addqueen(a, n+1)
            end
        end
    end
end

addqueen({}, 1)