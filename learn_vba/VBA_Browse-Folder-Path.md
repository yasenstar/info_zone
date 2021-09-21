# Browse the Folder Path using VBA

When you want to open one Browsing dialog to explore the folder path, using below function:

```
Function browseFolderPath(ByRef folderPath As String) As String

    On Error GoTo ErrorHandler
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
