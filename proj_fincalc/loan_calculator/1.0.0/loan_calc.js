//function to get value from input form on the webpage
function calculate()
{

	var beginpara = "<p>";
	var endpara = "</p>";
	var horiline = "<hr />"; // display one horizontal line

	//==================================================================================================
	var customer_name;	// 客户姓名，free text
	var customer_contact;	// 联系方式，can have validation rule
	var equipment_model;	// 设备型号，dropdown list
	var unit;	// 台数，mandatory
	var equipment_price;	// 购买价格，RMB Yuan, mandatory
	var down_payment_ratio;	// 首付比例，%, mandatory
	var down_payment_amount;	// 首付金额，RMB Yuan, = equipment_price x unit x down_payment_ratio
	var equipment_financial_amount;	// 设备融资金额，RMB Yuan, = equipment_price - down_payment_amount
	var financing_term;	// 融资期限，input, number of monthes
	var insurance_fee_rate;	// 年保费费率，rate is % in year basis
	var insurance_financing_option;	// 保费是否进行融资，1=yes or 0=no
	var insurance_fee_amount;	// 保费总额，RMB Yuan, = equipment_price x (insurance_fee_rate / 12 x financing_term)
	var customer_rate	// 利率，rate is % in year basis
	var handling_fee_rate	// 管理费率，rate is %
	var handling_fee_amount;	// 管理费金额，RMB Yuan, = net_financed_amount x handling_fee_rate
	var sd_rate;	// 履约保证金率，rate is in %
	var sd_amount;	// 履约保证金额，= net_financed amount x sd_rate
	var total_down_payment_amount;	// 期初付款总额
		// if insurance_financing_option = true, = down_payment_amount + insurance_fee_amount + handling_fee_amount + sd_amount
		// if insurance_financing_option = false, = down_payment_amount + handling_fee_amount + sd_amount
	var net_financed_amount;	// 净融资金额
		// if insurance_financing_option = true, = equipment_financial_amount + insurance_fee_amount
		// if insurance_financing_option = false, = equipment_financial_amount
	var end_term_amount;	// 期末尾款, by default is 0
	var pmt_type;	// default is 0
		// if 0, means payment occurs at every month's end (default)
		// if 1, means payment occurs at every month's beginning
	var monthly_payment_amount;	// 月度还款金额
		// = -PMT (customer_rate/12, financing_term, net_financed_amount, end_term_amount, pmt_type);
	//==================================================================================================
		
	function PMT(ir, np, pv, fv, type) {
		/*
		 * ir   - interest rate per month
		 * np   - number of periods (months)
		 * pv   - present value
		 * fv   - future value
		 * type - when the payments are due:
		 *        0: end of the period, e.g. end of month (default)
		 *        1: beginning of period
		 */
		var pmt, pvif;

		fv || (fv = 0);
		type || (type = 0);

		if (ir === 0)
			return -(pv + fv)/np;

		pvif = Math.pow(1 + ir, np);
		pmt = - ir * pv * (pvif + fv) / (pvif - 1);

		if (type === 1)
			pmt /= (1 + ir);

	return pmt;
	}

	/*function toPercent(data) {
		var strData = parseFloat(data)*100;
		var ret = strData.toString()+%;
		
	return ret;
	}
	*/
	//values from inputs

	var form = document.getElementById("input_form");
	
	//customer_name = form.elements[0].value;
	
	//customer_contact = form.elements(1).value;


	//calculation logic
	equipment_model = "Sample Model";
	equipment_price = 1500000;
	unit = 1;
	down_payment_ratio= 0.20;
	financing_term = 40;
	insurance_fee_rate = 0.011;
	customer_rate = 0.0649;
	sd_rate = 0.0250;
	handling_fee_rate = 0.02;
	end_term_amount = 0;
	pmt_type = 0;
	insurance_financing_option = 1;
	down_payment_amount = equipment_price * unit * down_payment_ratio;

	equipment_financial_amount = equipment_price - down_payment_amount;
	insurance_fee_amount = equipment_price * (insurance_fee_rate / 12 * financing_term);
	handling_fee_amount = net_financed_amount * handling_fee_rate;
	sd_amount = net_financed_amount * sd_rate;

	//export result
	document.write(beginpara + horiline + endpara);
	document.write(beginpara + "Input Information" + endpara);
	document.write(beginpara + "Customer Name:	" + customer_name + endpara);
	document.write(beginpara + "Customer Contact:	" + customer_contact + endpara);
	document.write(beginpara + "Equipment Model:	" + equipment_model + endpara);
	document.write(beginpara + "Unit:	" + unit + endpara);
	document.write(beginpara + "Equipment Price (RMB):	" + equipment_price.toFixed(2) + endpara);
	//document.write(beginpara + "Down Payment Amount (RMB):	" + toPercent(down_payment_ratio) + endpara);
	
	
	document.write(beginpara + horiline + endpara);
	document.write(beginpara + "Rate Information" + endpara);

	document.write(horiline);
	document.write(beginpara + "Calculation Result" + endpara);
	document.write(beginpara + "Down Payment Amount (RMB):	" + down_payment_amount.toFixed(2) + endpara);

	if (insurance_financing_option == 1)
	{
		total_down_payment_amount = down_payment_amount + insurance_fee_amount + handling_fee_amount + sd_amount;
		net_financed_amount = equipment_financial_amount + insurance_fee_amount;
	}
	
	else
	{
		total_down_payment_amount = down_payment_amount + handling_fee_amount + sd_amount;
		net_financed_amount = equipment_financial_amount;
	}
	
	monthly_payment_amount = -PMT(customer_rate/12, financing_term, net_financed_amount, end_term_amount, pmt_type);

	document.write(beginpara + "Total Insurance Fee (RMB):	" + insurance_fee_amount.toFixed(2) + endpara);

	document.write(beginpara + "Handling Fee (RMB):	" + handling_fee_amount.toFixed(2) + endpara);

	document.write(beginpara + "S/D Amount (RMB):	" + sd_amount.toFixed(2) + endpara);

	document.write(beginpara + "Total Down Payment Amount (RMB):	" + total_down_payment_amount.toFixed(2) + endpara);

	document.write(beginpara + "Net Financed Amount (RMB):	" + net_financed_amount.toFixed(2) + endpara);
	
	document.write(beginpara + "Monthly Payment Amount (RMB):	" + monthly_payment_amount.toFixed(2) + endpara);
	
	document.write(beginpara + horiline + endpara);

	document.write("this is the trial culculator for loan of construction equipments");
	document.write("<p>created by Zhao Xiaoqi</p>");
	
}
