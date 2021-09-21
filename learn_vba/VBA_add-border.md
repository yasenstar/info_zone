# Add Borders to a Selection Range in VBA

Try below code as sample:

```
Sub add_border()

    Application.ScreenUpdating = False
    Dim lngLstCol As Long
    Dim lngLstRow As Long
    
    lngLstRow = ActiveSheet.UsedRange.Rows.Count
    lngLstCol = ActiveSheet.UsedRange.Columns.Count
    'MsgBox "ListRow " & lngLstRow
    'MsgBox "ListCol " & lngLstCol
    
    For Each rngCell In Range("A1:A" & lngLstRow)
        r = rngCell.Row
        C = rngCell.Column
        Range(Cells(r, C), Cells(r, lngLstCol)).Select
            With Selection.Borders
                .LineStyle = xlContinuous
                .Weight = xlThin
                .ColorIndex = xlAutomatic
            End With
    Next
    
    Application.ScreenUpdating = True
        
End Sub
```

From here <[https://docs.microsoft.com/en-us/office/vba/api/excel.borders](https://docs.microsoft.com/en-us/office/vba/api/excel.borders)>

Following are the properties for Borders:

- Application
- Color
- ColorIndex
- Count
- Creator
- Item
- LineStyle
- Parent
- ThemeColor
- TintAndShade
- Value
- Weight


