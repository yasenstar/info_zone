import math

# read inputs from keyboard
print("*************************************")
print("**    Starndard Loan Calculator    **")
print("*************************************")
principal = float(input("Enter the Total Principal(RMB): "))
annual_rate = float(input("Enter the annual interest rate, if that's 9.5%, enter as 9.5: "))
annual_rate_for_calc = annual_rate / 100
term = int(input("Enter the total numbers of months for the loan, e.g. 4 years as 48 months, enter 48: "))
mth_payment = principal * (annual_rate_for_calc/12) * ((1+annual_rate_for_calc/12)**term) / ((1+annual_rate_for_calc/12)**term - 1)
print("=== Here is your inputs: ===")
print("Principal(RMB): %10.2f" %(principal))
print("Annual Interest Rate(percentage): %6.2f" %(annual_rate_for_calc*100))
print("Total Loan Months: %3d" %(term))
print("=== Here is is the calculation result: ===")
print("Monthly Payment: %8.2f" %(mth_payment))

# purely culculating without input
"""
principal = 200000
annual_rate = 0.09
term = 180
mth_payment = principal * (annual_rate/12) * ((1+annual_rate/12)**term) / ((1+annual_rate/12)**term - 1)
print(mth_payment)
"""
