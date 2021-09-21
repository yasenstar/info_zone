#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Aug  8 04:50:55 2020

@author: yasen
等额本息还款法: 每月月供额=〔贷款本金×月利率×(1＋月利率)＾还款月数〕÷〔(1＋月利率)＾还款月数-1〕
每月应还利息=贷款本金×月利率×〔(1+月利率)^还款月数-(1+月利率)^(还款月序号-1)〕÷〔(1+月利率)^还款月数-1〕
"""

finance_amount = round(float(input('Please input the financing amount: ')),2)
annual_rate = float(input('plese input the annual rate(%): '))/100
monthly_rate = annual_rate / 12
term = int(input('Please input months of the loan: '))
rental = round( finance_amount * monthly_rate * (1+monthly_rate)**term / ((1+monthly_rate)**term-1), 2)

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