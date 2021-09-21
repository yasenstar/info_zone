# VBA - Return Values from Function - Method 1

[TOC]

## Method 1: Return multiple values by using passing arguments By Reference

Passing argument By Reference is is probably the most common way to return multiple values from a function.

It uses the `ByRef` keyword to tell the compiler that the variable passed to the function is only a pointer to a memory location where the actual value of the variable is stored. This way, the code inside the function itself can modify the value of the variable. Even through the function does not explicitly return the changed value, it can be retrieved by using the same variable name within the code that calls the function.

By contrast, passing argument By Value `ByVal` instructs the function that the variable is read-only so the code inside the function can't change its value.

Note that in VBA and Visual Basic 6.0, if you do not specify `ByVal` or `ByRef` for a function or procedure argument, the default passing mechanism is `ByRef`. In Visual Basic .NET, the default behavior is passing arguments by Value.

It is a good coding practice for VBA and VB6 to include either the `ByVal` or `ByRef` keyword for each function argument (also called parameter).

Sample 1: My following sample is pop up folder picker dialog, let user to choose the destination folder, and return the folder path:

```vb
Function browseFolderPath(ByRef folderPath as String) As String
    On Error Goto ErrorHandler
    Dim fileExplorer As FileDialog
    Set fileExplorer = Application.FileDialog(msoFileDialogFolderPicker)
    
    With fileExplorer
        .Title = "Choose or Create a Folder for Save the Schedules"
        'To disable to multi select
        .AllowMultiSelect = False
        If .Show = -1 Then 'Any folder is selected
            folderPath = .SelectedItems(1)
        Else ' else dialog is calcelled
            'MsgBox "You have cancelled the folder picker"
            folderPath = "" 'when cancelled set blank as file path
        End If
    End With
    
ErrorHandler:
    Exit Function
End Function
```

Firstly, I put nothing in the argument part just as `browseFolderPath()`, it's not working, then I use `ByVal`, not working as well, only `ByRef` can really return the value needed.

Note: to utilize the function, you need to declare one global variable, like below

`Public Print_Path As String`

Then you can use `Call browseFolderPath(Print_Path)` in any Sub of the Excel coding.

Sample 2 (Online): The function below can modify its argument which is a reference pointer and it may hold a different value after the function is called. The reference pointer is defined by the `ByRef` keyword which is the default passing mechanism of VBA.

```vbscript
' Argument strWeekdayName can be changed inside the function.
Public Function IsToday(ByRef strWeekdayName As String) As Boolean
    ` If the weekday passed in is equal to today's weekday name, return True.
    	If strWeekdayName = WeekdayName(Weekday(Date)) Then
        	' Explicit return value
        	IsToday = Ture
    	Else
            ' If it does not equal to today's weekday name, return today's weekday name by assigning
            ' today's weekday name to the argument.
            strWeekdayName = WeekdayName(Weekday(Date))
            
            ' Explicit return value
            IsToday = False
        End If
End Function        
```

To test the function, we display the return values in Immediate Window by using `Debug.Print`.

In this subroutine, the function is called and returns a Boolean value as well as today's weekday name. Note that its argument strDayName is called again after the function. blnIsToday is the return value of the function, and strDayName is today's weekday name.

```vbscript
Private Sub cmbGetByRef_Click()
    Dim blnIsToday As Boolean
    Dim strDayName As String
    
    strDayName = "Monday"
    
    blnIsToday = IsToday(strDayName)
    
    Debug.Print blnIsToday
    Debug.Print strDayName
End Sub
```

------

Ref: http://www.geeksengine.com/article/vba-function-multiple-values.html, thanks!