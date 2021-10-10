class tax {
    double grossIncome;
    int dependents;

    double calcStateTax() {
        TaxOptimizer tOpt = new TaxOptimizer();
        return tOpt.optimize(grossIncome, dependents);
    }

    TaxOptimizer getTaxOptimizer() {
        return new TaxOptimizer();
    }

    class TaxOptimizer {
        int taxCode;

        void setTaxCode(int tCode) {
            taxCode = tCode;
        }

        int optimize(double grossIncome, int dep) {
            // some optimization code goes here
            return 0;
        }
    }
}
