# Check one Folder Path is Existed or Not with VBA

Try using below Function

```
Function FolderExists(ByVal path As String) As Boolean

    FolderExists = False
    Dim fso As New FileSystemObject
    
    If fso.FolderExists(path) Then FolderExists = True
    
End Function

```