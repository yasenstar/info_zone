# VBA - Return Values from Function - Method 2

[TOC]

## Method 2: Return multiple values by using a collection object

A collection object is an ordered set of items and each item can be referred to by using an index.

Each item in the collection holds a specific index, starting from 1. Items (also can be called elements) of a collection do not have to share the same data type.

In this function, we create a collection object and assign two value to it. Then the collection object is returned by the function.

```vb
' This function returns a collection object which can hold multiple values.
Public Function GetCollection() As Collection
    Dim var As Collection
    Set var = New Collection
        'Add two items to the collection
        var .Add "John"
        var .Add "Star"
        Set GetCollection = var
End Function
```

Then we call the function from the click event cmbGetCollection_Click() to display two values. The value of each element can be retrieved by using the Item property.

```vbscript
Private Sub cmbGetCollection_Click()
    Dim Employee As Collection
    Set Employee = GetCollection()
    
    ' Use the collection's first index to retrieve the first item.
    ' This is also valid: Debug.Print Employee()
    Debug.Print Employee.Item(1)
    Debug.Print Employee.Item(2)
End Sub
```

------

Ref: http://www.geeksengine.com/article/vba-function-multiple-values.html, thanks!