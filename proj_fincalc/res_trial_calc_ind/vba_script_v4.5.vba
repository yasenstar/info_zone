Sub Standard_EMI()
' Step 1
' Standard_Repayment_Plan Macro
'
    'title
    Range("Q3:Y4").Select
    Selection.Copy
    Range("F3:N4").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    'content
    Range("Q5:Y68").Select
    Selection.Copy
    Range("F5:N68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
              
    Range("A1:A1").Select

End Sub

Sub EMI_from_now_on()
' Repayment_Plan starting from now on Macro
'
    'title
    Range("Q70:Y71").Select
    Selection.Copy
    Range("F3:N4").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    'tensor
    Range("Z72:Z135").Select
    Selection.Copy
    Range("F5:F68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    'content
    Range("R72:Y135").Select
    Selection.Copy
    Range("G5:N68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    Range("A1:A1").Select

End Sub

Sub New_EMI_Table()
' Step 2
' Extend_Total_Terms Macro
'
    'title
    Range("Q137:Y138").Select
    Selection.Copy
    Range("F3:N4").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    'tensor
    Range("P139:P202").Select
    Selection.Copy
    Range("F5:F68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    'content
    Range("R139:Y202").Select
    Selection.Copy
    Range("G5:N68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    Range("A1:A1").Select
    
End Sub

Sub read_and_copy()

    Dim fileopen As Office.FileDialog
    Dim fileName As String
    Dim iTotalRows_src As Integer, iTotalRows_dest As Integer
    
    ' Clear the destination table first
    
    ThisWorkbook.Activate
    
    Sheets("Amort_Schedule_Report").Select
    
        iTotalRows_dest = Range("B1:K" & Cells(Rows.Count, "K").End(xlUp).Row).Rows.Count
    
        Sheets("Amort_Schedule_Report").Range("B1:K" & iTotalRows_dest).ClearContents
    
    Sheets("Trial_Restructuring").Select
    
        Range("Q5:Q68").ClearContents
            
        Range("S5:Y68").ClearContents
    
    'clear goal content
    Range("AE203:AE203").ClearContents
        
    ' Open source workbook
    
    Set fileopen = Application.FileDialog(msoFileDialogFilePicker)
    
    With fileopen
        .AllowMultiSelect = False
        .Title = "Please select one Repayment Plan file:"
        .Filters.Clear
        .Filters.Add "", "*.xls?"
        
        If .Show = True Then
            fileName = Dir(.SelectedItems(1))
        End If
    End With
     
    Workbooks.Open fileName
    Sheets("Amort_Schedule_Report").Select
    
    ' Get the total rows from the source workbook, copy the amortization schedule content
        
    iTotalRows_src = Range("B1:K" & Cells(Rows.Count, "K").End(xlUp).Row).Rows.Count
    
    Range("B1:K" & iTotalRows_src).Select
    
    Selection.Copy
    
    ' Paste the new amortization schedule into the sheet
    
    ThisWorkbook.Activate
    
    Sheets("Amort_Schedule_Report").Select
    
    iTotalRows_dest = Range("B1:K" & Cells(Rows.Count, "K").End(xlUp).Row).Rows.Count
    
    Range("B1:K" & iTotalRows_src).Select
    
    ActiveSheet.Paste
    
    ' change the amount values format into numeric
    
    Range("O2").Select
    Selection.Copy
    Range("D4:J" & iTotalRows_src).Select
    Selection.PasteSpecial Paste:=xlPasteAll, Operation:=xlMultiply, _
    SkipBlanks:=False, Transpose:=False
    
    Range("P2").Select
    Selection.Copy
    Range("b4:b" & iTotalRows_src).Select
    Selection.PasteSpecial Paste:=xlPasteAll, Operation:=xlMultiply, _
    SkipBlanks:=False, Transpose:=False
    
    ' After paste, close the source table
    
    Workbooks(fileName).Close
    
    ' Copy from Amort_Schedule_Report to Trial_Restructuring Working Table
    
    Sheets("Amort_Schedule_Report").Select
    
    Range("B4:B" & iTotalRows_src).Select
    Selection.Copy
    
    Sheets("Trial_Restructuring").Select
    
    Range("Q5:Q" & iTotalRows_src + 1).Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    Sheets("Amort_Schedule_Report").Select
    
    Range("D4:F" & iTotalRows_src).Select
    Selection.Copy
    
    Sheets("Trial_Restructuring").Select
    
    Range("S5:U" & iTotalRows_src + 1).Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    Sheets("Amort_Schedule_Report").Select
    
    Range("H4:K" & iTotalRows_src).Select
    Selection.Copy
    
    Sheets("Trial_Restructuring").Select
    
    Range("V5:Y" & iTotalRows_src + 1).Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    ' Standard_Repayment_Plan Macro
    '
    'title
    Range("Q3:Y4").Select
    Selection.Copy
    Range("F3:N4").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    'content
    Range("Q5:Y68").Select
    Selection.Copy
    Range("F5:N68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
                     
    Range("A1").Select
    
End Sub

Sub goal_seek()

    Dim Target As Long

    Sheets("Trial_Restructuring").Select
    
    Range("C32").Value = 0
   
    Target = Range("AD139").Value
     
    With ActiveSheet
    
        .Range("AF139").GoalSeek _
        Goal:=Target, _
        ChangingCell:=Range("AE203")
    End With
    
    'content
    Range("P340:P403").Select
    Selection.Copy
    Range("F5:F68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False

    'content
    Range("R340:R403").Select
    Selection.Copy
    Range("G5:G68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
        
    Range("T340:T403").Select
    Selection.Copy
    Range("I5:I68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    

    
    Range("A1").Select
    
End Sub

Sub split_final_payment()

    Range("C32").Value = 1

    'content
    Range("P407:P470").Select
    Selection.Copy
    Range("f5:f68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False

    'content
    Range("R407:R470").Select
    Selection.Copy
    Range("g5:g68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False

    Range("U206:U269").Select
    Selection.Copy
    Range("I5:I68").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    
    Range("A1").Select

End Sub

Sub customer_output_print_to_temp_folder()

ThisWorkbook.Sheets("For_Print").Select

ActiveSheet.ExportAsFixedFormat _
        Type:=xlTypePDF, _
        fileName:="C:\temp\Amort_Schedule_Report.pdf", _
        Quality:=xlQualityStandard, _
        IncludeDocProperties:=True, _
        IgnorePrintAreas:=False, _
        OpenAfterPublish:=True

End Sub

Sub customer_output_print_to_desktop(sheetName As String)

ThisWorkbook.Sheets(sheetName).Select

Dim Path As String
Dim Contract_ID As String
Dim StrDate As String
Dim PrintRange As Range

Path = CreateObject("WScript.Shell").SpecialFolders("Desktop") & "\"

Contract_ID = ThisWorkbook.Sheets("Trial_Restructuring").Range("b6").Value

StrDate = Format(Now, "yyyy-MM-dd hh-mm-ss")

If ThisWorkbook.Sheets(sheetName).Range("A48") = "" Then
    Set PrintRange = ThisWorkbook.Sheets(sheetName).Range("A1:F40")
Else
    Set PrintRange = ThisWorkbook.Sheets(sheetName).Range("A1:F81")
End If

PrintRange.ExportAsFixedFormat _
        Type:=xlTypePDF, _
        fileName:=Path & Contract_ID & " Repayment Schedule " & StrDate, _
        Quality:=xlQualityStandard, _
        IncludeDocProperties:=True, _
        IgnorePrintAreas:=False, _
        OpenAfterPublish:=True

ThisWorkbook.Sheets("Trial_Restructuring").Select

    ActiveSheet.Range("B6").Select

End Sub

Sub Combined_Button()

    Call New_EMI_Table
    Call goal_seek
    
    ThisWorkbook.Sheets("Trial_Restructuring").Select
    
    If Left(Range("B6").Value, 2) = "FL" Then
        Call customer_output_print_to_desktop("Customer_Output_FL")
    Else
        If Left(Range("B6").Value, 2) = "LN" Then
            Call customer_output_print_to_desktop("Customer_Output_Loan")
        End If
    End If
    
End Sub

Sub Print_Again()

    'ActiveWorkbook.Save
 
    ThisWorkbook.Sheets("Trial_Restructuring").Select
    
    If Left(Range("B6").Value, 2) = "FL" Then
        Call customer_output_print_to_desktop("Customer_Output_FL")
    Else
        If Left(Range("B6").Value, 2) = "LN" Then
            Call customer_output_print_to_desktop("Customer_Output_Loan")
        End If
    End If
    
End Sub

Sub Remove_Duplicated_Loan_No()
'
' Macro1 Macro
'

    Range("B:B").Select
    Selection.Copy
    
    Worksheets("loan_no").Activate
    Range("A:A").Select
    Selection.PasteSpecial Paste:=xlPasteValues, Operation:=xlNone, SkipBlanks _
        :=False, Transpose:=False
    Application.CutCopyMode = False
    ActiveSheet.Range("$A:$A").RemoveDuplicates Columns:=1, Header:= _
        xlNo
    
    Call add_border
    
    Dim lngLstRow As Long
    
    lngLstRow = ActiveSheet.UsedRange.Rows.Count
    
    ActiveSheet.Rows(lngLstRow).EntireRow.Delete
    ActiveSheet.Rows(1).EntireRow.Delete
    
End Sub

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
        c = rngCell.Column
        Range(Cells(r, c), Cells(r, lngLstCol)).Select
            With Selection.Borders
                .LineStyle = xlContinuous
                .Weight = xlThin
                .ColorIndex = xlAutomatic
            End With
    Next
    
    Application.ScreenUpdating = True
        
End Sub
