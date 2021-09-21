# Export Excel Range into a PDF File

Following are the code dealing with Selection Range:

```
Selection.ExportAsFixedFormat _
        Type:=xlTypePDF, _
        fileName:=Print_Default_Path & Customer_Name & "_" & Application_Number & "_" & StrDate, _
        Quality:=xlQualityStandard, _
        IncludeDocProperties:=True, _
        IgnorePrintAreas:=False, _
        OpenAfterPublish:=True
```

Note: the fileName is the variable and can be connected by multiple strings or variables.