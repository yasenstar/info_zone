# Page Setup in VBA

```
With ActiveSheet.PageSetup
    .LeftHeader = ""
    .CenterHeader = ""
    .RightHeader = ""
    .LeftFooter = ""
    .CenterFooter = ""
    .RightFooter = ""
    .LeftMargin = Application.InchesToPoints(0.708661417322835)
    .RightMargin = Application.InchesToPoints(0.708661417322835)
    .TopMargin = Application.InchesToPoints(0.748031496062992)
    .BottomMargin = Application.InchesToPoints(0.748031496062992)
    .HeaderMargin = Application.InchesToPoints(0.31496062992126)
    .FooterMargin = Application.InchesToPoints(0.31496062992126)
    .PrintHeadings = False
    .PrintGridlines = False
    .PrintComments = xlPrintNoComments
    .PrintQuality = 1200
    .CenterHorizontally = True
    .CenterVertically = False
    .Orientation = xlPortrait
    .Draft = False
    .PaperSize = xlPaperA4
    .FirstPageNumber = xlAutomatic
    .Order = xlDownThenOver
    .BlackAndWhite = False
    .Zoom = 100
    .PrintErrors = xlPrintErrorsDisplayed
    .OddAndEvenPagesHeaderFooter = False
    .DifferentFirstPageHeaderFooter = False
    .ScaleWithDocHeaderFooter = True
    .AlignMarginsHeaderFooter = True
    .EvenPage.LeftHeader.Text = ""
    .EvenPage.CenterHeader.Text = ""
    .EvenPage.RightHeader.Text = ""
    .EvenPage.LeftFooter.Text = ""
    .EvenPage.CenterFooter.Text = ""
    .EvenPage.RightFooter.Text = ""
    .FirstPage.LeftHeader.Text = ""
    .FirstPage.CenterHeader.Text = ""
    .FirstPage.RightHeader.Text = ""
    .FirstPage.LeftFooter.Text = ""
    .FirstPage.CenterFooter.Text = ""
    .FirstPage.RightFooter.Text = ""
End With
```

If you want to save Excel print area into PDF, you can use following 

```
With ActiveSheet.PageSetup
    .CenterHorizontally = True
    .Orientation = xlPortrait
    .FitToPagesWide = 1
End With
```