# Create one Folder via VBA

Try below function:

```
Function FolderCreate(ByVal path As String) As Boolean

    FolderCreate = True
    Dim fso As New FileSystemObject
    
    If Functions.FolderExists(path) Then
        Exit Function
    Else
        On Error GoTo ErrorHandler
        fso.CreateFolder path
        Exit Function
    End If
    
ErrorHandler:
    MsgBox "A folder already exists"
    FolderCreate = False
    Exit Function
    
End Function

```
