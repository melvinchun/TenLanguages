package main
import "fmt"
import "math"
func main() {
   var num int
   fmt.Printf("Digite un numero entero : ")
   fmt.Scanf("%d\n",&num)
    if (num % 2)=0 {
        fmt.Print(num, " es par")
    } else {
        fmt.Print(num, " es impar")
    }
}
