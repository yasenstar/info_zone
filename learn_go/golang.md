# Go Language Readme

## Keywords

break       default         func    interface   select
case        defer           go      map         struct
chan        else            goto    package     switch
const       fallthrough     if      range       type
continue    for             import  return      var

## Syntax for Key Components

Variable (Inferred):

```go
var variableName dataType = value
variableName := value
```

Constant: `const constantName = value`

Array: `var arrayName [nElements] dataType`

Slice: `sliceName := make([]dataType, nElements)`

Map: `mapName := make(map[ keyDataType ] valueDataType )`

Channel: `channelName := make( chan dataType )

Struct:

```go
type structName struct {
    fieldName dataType
}
```

Function:

```go
func functionName ( paramName dataType ) returnDataType {
    return returnValue
}
```

Interface:

```go
type interfaceName interface {
    methodName returnDataType
}
```

## Reasons for Choosing GoLang

- Simple Syntax
- Complied Language
- The Go Compiler
- Concurrency with gorountines and channels
- Garbage Collection
- Static Type