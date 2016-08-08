import Cocoa

func input() -> NSString {
    var keyboard = NSFileHandle.fileHandleWithStandardInput()
    var inputData = keyboard.availableData
    return NSString(data: inputData, encoding:NSUTF8StringEncoding)!
}

println("esciba su nombre: ")
var cadena = input()
var resultado = "Johnny"

print("Su nombre es: \(resultado)")
