package main

import (
	std "fmt"
)

func main() {
	var s1 = make([]int, 3, 10)
	std.Println(len(s1), cap(s1))
}
