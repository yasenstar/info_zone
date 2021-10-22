package main

import "fmt"

func main() {
	var msg1 string
	msg1 = "Hi there!"

	var msg2 string = "good day."

	msg3 := "Take some rest"

	fmt.Println(msg1, msg2, msg3)

	num := 100
	pi := 3.1415926535

	fmt.Printf("num: %v type:%T \n", num, num)
	fmt.Printf("pi: %v type:%T \n\n", pi, pi)
}
