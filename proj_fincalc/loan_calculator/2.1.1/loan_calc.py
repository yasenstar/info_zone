#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Aug  8 04:50:55 2020

@author: yasen
等额本息还款法: 每月月供额=〔贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1〕
每月应还利息=贷款本金×月利率×〔(1+月利率)^还款月数-(1+月利率)^(还款月序号-1)〕÷〔(1+月利率)^还款月数-1〕
"""

def rental_calc(finance_amount, monthly_rate, term):
    rental_amount = round(finance_amount * monthly_rate * (1+monthly_rate)**term / ((1+monthly_rate)**term-1),2)
    return rental_amount

finance_amount = round(float(input('Please input the financing amount: ')),2)
annual_rate = float(input('plese input the annual rate(%): '))/100
monthly_rate = annual_rate / 12
term = int(input('Please input months of the loan: '))
rental = rental_calc(finance_amount, monthly_rate, term)

repayment_plan = []
repayment_plan.append([['Term'], ['Beginning Balance', 'Rental', 'Interest', 'Pricipal', 'Ending Balance']])

# print(repayment_plan)

beginning_balance = finance_amount

for i in range(1, term+1):
    interest = round(beginning_balance * monthly_rate,2)
    principal = round(rental - interest, 2)
    ending_balance = round(beginning_balance - principal, 2)
    repayment_plan.append ( [[i],[beginning_balance, rental, interest, principal, ending_balance]] )
    beginning_balance = ending_balance

for i in range(term+1):
    print(repayment_plan[i])

# below add at 2020/08/09 as 2.1.1.1
f = open('repayment.txt', 'w')
for element in repayment_plan:
    f.write(str(element) + '\n')   # A list cannot be written into the file directly, need convert to string beforehand
f.close()

"""
2.1.1.1 (2020/08/09): add function to write repayment plan into one text file as output
2.1.1: put calculating logic into function
2.1.0: update in Python, using list structure
2.0.0: rewrite in Python
1.0.0: using HTML + JavsScript to implement loan calculator
"""