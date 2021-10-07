-- defines one factorial function
function factor(n)
    if n == 0 then
        return 1
    else
        return n * factor(n-1)
    end
end

print("please input one number:")
a = io.read("*number")
print(factor(a))