# Language: Python 3.x
# Author: Xiaoqi Zhao
# Author Email: xiaoqizhao@outlook.com

import math
import json
import ast
# import pandas as pd

def get_nested(data, *args):
    if args and data:
        element = args[0]
        if element:
            value = data.get(element)
            return value if len(args) == 1 else get_nested(value, *args[1:])

# read inputs from keyboard
print("*************************************")
print("**    Starndard Loan Calculator    **")
print("*************************************")
principal = float(input("Enter the Total Principal(RMB): "))
annual_rate = float(input("Enter the annual interest rate, if that's 9.5%, enter as 9.5: "))
annual_rate_for_calc = annual_rate / 100
term = int(input("Enter the total numbers of months for the loan, e.g. 4 years as 48 months, enter 48: "))
mth_payment = round(principal * (annual_rate_for_calc/12) * ((1+annual_rate_for_calc/12)**term) / ((1+annual_rate_for_calc/12)**term - 1),2)
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

term01_interest = round(principal * annual_rate /100 / 12, 2)
term01_principal = round(mth_payment - term01_interest,2)
term01_outstanding_rental = round(principal - term01_principal,2)

# write into the standard repayment plan
std_repayment_plan = {}
std_repayment_plan['monthly_payment'] = []
std_repayment_plan['monthly_payment'].append({
    'term': 1,
    'rental': mth_payment,
    'monthly_interest': term01_interest,
    'monthly_principal': term01_principal,
    'outstanding_rental': term01_outstanding_rental
})

last_term_outstanding_rental = term01_outstanding_rental
last_term_interest = term01_interest
last_term_principal = term01_principal

for i in range (2,term+1):
    this_term_interest = round(last_term_outstanding_rental * annual_rate / 100 /12,2)
    this_term_principal = round(mth_payment - this_term_interest,2)
    this_term_outstanding_rental = round(last_term_outstanding_rental - this_term_principal,2)
    if this_term_outstanding_rental < 0.1:
        this_term_outstanding_rental = 0.00
    std_repayment_plan['monthly_payment'].append({
    'term': i,
    'rental': mth_payment,
    'monthly_interest': this_term_interest,
    'monthly_principal': this_term_principal,
    'outstanding_rental': this_term_outstanding_rental
    })
    last_term_outstanding_rental = this_term_outstanding_rental

# print(std_repayment_plan["monthly_payment"]["term"])
# get_nested(std_repayment_plan, "monthly_payment", "term")

data = json.dumps(std_repayment_plan, indent=4)
# print(data)
# print(data["monthly_payment"])
# print(type(std_repayment_plan))

with open('std_repayment_plan.json', 'w') as outfile:
    json.dump(std_repayment_plan, outfile)

"""
val = ast.literal_eval(std_repayment_plan)
val1 = json.loads(json.dumps(val))
val2 = val1['monthly_payment'][0]['rental']
print(pd.DataFrame(val2, columns=['rental']))
print("thanks for using financial calculator, enjoy the day!")
"""