Sub clear_copied_schedule_loan()

Dim delta As Integer

Worksheets("Schedule2_LN_Combined").Select

'Range("J5608:K5628").ClearContents

delta = 91

For i = 1 To 60

Range("C" & 4 + delta * i & ":G" & 7 + delta * i).ClearContents
Range("A" & 9 + delta * i & ":G" & 41 + delta * i).ClearContents
Range("C" & 50 + delta * i & ":G" & 53 + delta * i).ClearContents
Range("A" & 55 + delta * i & ":G" & 87 + delta * i).ClearContents

Next i

End Sub
