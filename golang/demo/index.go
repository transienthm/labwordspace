package main 

import (
    std "fmt"
)

const (
	b float64 = 1 << (iota * 10)
	kb
	mb
	gb 
)

func main() {
	std.Println(b)
	std.Println(kb)
	std.Println(mb)
	std.Println(gb)
}