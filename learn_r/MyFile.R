n <- 30
x <- runif(n, 0, 10)
y <- 5 + 2*x + 4*x*x + rnorm(n)
plot(x,y)