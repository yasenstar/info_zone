# List Directories with their Sizes in Command Prompt

In PowerShell, try below:

```PowerShell
Get-ChildItem |
Where-Object { $_.PSIsContainer } |
ForEach-Object {
  $_.Name + ": " + (
    Get-ChildItem $_ -Recurse |
    Measure-Object Length -Sum -ErrorAction SilentlyContinue
  ).Sum
}
```

The sizes are in bytes.

To formate them in some larger unit like MB, try following:

```PowerShell
Get-ChildItem |
Where-Object { $_.PSIsContainer } |
ForEach-Object {
    $_.Name + ": " + "{0:N2}" -f (
        (Get-ChildItem $_ -Recurse |
    Measure-Object Length -Sum -ErrorAction SilentlyContinue
    ).Sum / 1MB
    ) + " MB" 
}
```

If condensed to one line:

```PowerShell
Get-ChildItem | Where-Object { $_.PSIsContainer } | ForEach-Object { $_.Name + ": " + "{0:N2}" -f ((Get-ChildItem $_ -Recurse | Measure-Object Length -Sum -ErrorAction SilentlyContinue).Sum / 1MB) + " MB" }
```

More information can be found here:

https://learn.microsoft.com/en-us/previous-versions/windows/it-pro/windows-powershell-1.0/ff730945(v=technet.10)?redirectedfrom=MSDN

---

Date: 2025-08-04