Latest Release Notes
India	1.9	English	2020/04/08	
Xiaoqi Zhao	Fix: issue caused changing modifigation date field

India	2.0	English	2020/04/08	
Xiaoqi Zhao	Minor formatting bug fix
India	2.1	English	2020/04/08	Xiaoqi Zhao	Remove worksheet protection which causes some fields update not working
India	2.2	English	2020/04/09	Xiaoqi Zhao	
Refine input date filed as "Restructure Start Date"
Develop "Print to PDF" function
India	3.0	English	2020/04/09	Xiaoqi Zhao	
Package as released version
Hide the option of Spliting Final Payment Required
Optimize Print-to-PDF button and save-to feature
India	3.1~3.1	English	2020/04/08	India Business	Testing and revise base on business logic
India	3.4	English	2020/04/12	Xiaoqi Zhao	
Internal version analyzing business inputs from Teck:

Included GST for finance lease. I only show the rental excluding GST and the GST rate
No need to import anymore, just key in the loan agreement number and the data will be extracted
Revised the format of the print
Revised the name of the printout
Can you create a button to combine Step 2, Step 3 and the Print button? This gives the user an option to speed up
India	3.5	English	2020/04/13	Xiaoqi Zhao	
Start support both Loan and Finance Lease (have GST)
Adopt business demand, switch External File Read-in to read the List in the same tool
Combine step 2 / step 3 / print function into on single button
Add one "print again" button for user to print after 1st time without re-calculation
Formatting data sheet
Add data validation to display between Loan and FL difference
Separate "Customer Output" to one Loan and one FL sheet
Revise print-to-pdf function and export to Loan or FL automatically based on Loan Account type
India	4.0	English	2020/04/13	Xiaoqi Zhao	
Package as released version
Fine tune Print-to-PDF exporting file format
India	4.1	English	2020/04/13	Xiaoqi Zhao	Set the print area only print page one if reivsed schedule within one page
India	4.2	English	2020/04/13	Xiaoqi Zhao	
Fixing issue on when moratorium month chosen as 3 that the last period date is not showing
Extend maximum plan months from 63 months to 64 months. (business context: "We may have a problem for new customers (from April 20) with 60 months tenor, which needs 64 months of repayment.")
India	4.3.1	English	2020/04/14		
created a drop down for Restructuring start date and link terms for zero payment to it
change back the PDF exporting file name
India	4.3	English	2020/04/13	Xiaoqi Zhao	
Fix logic of "Loan End Date" from calculating with "loan start date" by formula, to read from actual Amort_Schedule, preventing the contract that changes the due date in the middle
Update logic for generating "Next Payment Date"
Change default date format from "dd-mm-yyyy" to "dd/mm/yyyy", to align with "Amort_Schedule_Report"
Revise "Standard EMI" table's logic of read "Installment Date" value
Revise exported PDF file name conversion as: Contract_ID & "_Moratorium_" & StrDate, which StrDate = Format(Now, "yyyy-MM-dd hh-mm-ss")
India	4.4	English	2020/04/14	Xiaoqi Zhao	
Review and extend support up to 64 months of contract terms length
Adopt the drop down list for Restructuring Start Date selection, adding logic to cope with the situation that Contract Start Date is after the Restructureing Start Date
Adopt back the PDF export file name
