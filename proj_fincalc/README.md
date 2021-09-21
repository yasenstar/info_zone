# online_financial_calculator

Financial Calculator is used to calculate from standard loan to the restructure of the contract.

Multiple language implementation will be practiced.

## 关于PMT还贷函数的计算

[一个参考网站](https://zhidao.baidu.com/question/329304439.html)

PMT在Excel中作为公式实际上时“等额本息法”的计算逻辑，如下

月还款额 = 本金 * 月利率 * (1 + 月利率)^n / [(1 + 月利率)^n - 1]

式中：
* 月利率 = 年利率 / 12
* n 表示贷款月数
* ^n 表示n次方

注意：计算(1 + 月利率)^n - 1时，要先将小括号中的算式算出来，乘方后再减1.

updated: 2021-09-15