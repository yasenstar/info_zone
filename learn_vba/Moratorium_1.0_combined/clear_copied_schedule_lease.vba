Sub clear_copied_schedule_lease()

Dim delta As Integer

Worksheets("Schedule2_FL_Combined").Select

'Range("I46988:J4718").ClearContents

delta = 91

For i = 1 To 50

Range("C" & 4 + delta * i & ":F" & 6 + delta * i).ClearContents
Range("A" & 9 + delta * i & ":F" & 41 + delta * i).ClearContents
Range("C" & 50 + delta * i & ":F" & 52 + delta * i).ClearContents
Range("A" & 55 + delta * i & ":F" & 87 + delta * i).ClearContents

Next i

End Sub
