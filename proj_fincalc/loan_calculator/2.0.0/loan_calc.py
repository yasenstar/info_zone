# -*- coding: utf-8 -*-
"""
Spyder Editor

This is the first version of basic loan financial calculator
"""

"""
definition in Excel:
rate - The interest rate of loan
nper - The total number of payment for the loan taken
pv - The present value or total amount that a series of future payments is
worth now, it is also termed as the principal of a loan
fv - Future value or a cash balance we want to attain after the last payment.
type - type of day count bassis to use

等额本息还款的计算公式：
每月还本付息金额 = [本金 X 月利率 X（1+月利率）X 还款月数] / [(1 + 月利率) X 还款月数 - 1]
其中：
每月利息 = 剩余本金 X 贷款月利率
每月本金 = 每月月供额 - 每月利息
"""

print("="*83)
print("="*28, "Loan Financial Calculator", "="*28)
print("="*83)
# input necessary parameter
financing_amount = round(float(input("Please input the total financing amount(CNY): ")),2)
annual_rate = float(input("Please input the annual rate (%): "))
terms = int(input("Please input the total months of the loan: "))

# show the input value
print("="*83)
print("what you've input are:")
print("Total Financiing Amount(CNY): ", financing_amount)
monthly_rate = round(annual_rate/12,2)
print("monthly rate is: ", monthly_rate, "%")
print("Total Financing Terms are %d months" % terms)

monthly_rental = round((financing_amount * monthly_rate/100 * (1+monthly_rate/100) ** terms) / ((1 + monthly_rate/100) ** terms -1),2)

print("Monthly Rental Amount is: ", monthly_rental)

# initial payment schedule list

tenor = [i for i in range(terms+1)]
#print(tenor)

repayment_plan = [['Term', 'Beginning_Balance', 'Rental_Amount', 'Interest_Amount', 'Principal_Amount', 'Ending_Balance']]

# calculate frist tenor's payment detail
beginning_balance = financing_amount
rental_amount = monthly_rental
interest_amount = round(beginning_balance * monthly_rate / 100,2)
principal_amount = round(rental_amount - interest_amount,2)
ending_balance = round(beginning_balance - principal_amount,2)

repayment_plan.append([tenor[1], beginning_balance, rental_amount, interest_amount, principal_amount, ending_balance])

# using loop to calculate each tenor and put into the 2-dimension list
for i in range(1,terms):
    beginning_balance = ending_balance
    # rental_amount = monthly_rental
    interest_amount = round(beginning_balance * monthly_rate / 100,2)
    principal_amount = round(rental_amount - interest_amount,2)
    ending_balance = round(beginning_balance - principal_amount,2)
    
    repayment_plan.append([tenor[i+1], beginning_balance, rental_amount, interest_amount, principal_amount, ending_balance])

for i in range(terms+1):
    print(repayment_plan[i])