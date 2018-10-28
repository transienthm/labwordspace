package main

import (
	std "fmt"
)

func main() {

	// if a := 1; a > 5 {
	// 	std.Println("if block:" + string(a))
	// } else {
	// 	std.Println("else block:" + string(a))
	// }
	a := 1
	switch {
	case a >= 0:
		std.Println("a >= 0")
	case a >= 1:
		std.Println("a >= 1")
	default:
		std.Println("none")

	}

	for i := 0; i < 3; i++ {
		v := 1
		std.Println(&v)
	}
}
