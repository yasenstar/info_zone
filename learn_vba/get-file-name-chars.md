# How to auto get postfix of excel file name

I've one Excel tool named as abc_calculator_v0.5.xlsm, when I upgrade that to v0.6, I wish in the excel file's one cell, can auto show `Ver 0.x`.

Thanks for formula, you can use below:

```
="Ver "&LEFT(RIGHT(SUBSTITUTE(LEFT(CELL("filename",A1),FIND("]",CELL("filename",A1))-1),"[",""),8),3)
```

note, "8" means from the right side you have 8 chars, further need to auto identify the "v" then chunk the necessary chars, e.g. when I'll have 0.11, 0.12, then that should be "9".

enjoy.
