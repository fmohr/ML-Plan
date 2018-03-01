
package de.upb.crc901.mlplan.evaluablepredicates.mlplan.QuadraticDiscriminantAnalysis;
/*
    reg_param : float, optional
        Regularizes the covariance estimate as
        ``(1-reg_param)*Sigma + reg_param*np.eye(n_features)``


 */

import de.upb.crc901.mlplan.evaluablepredicates.mlplan.NumericRangeOptionPredicate;

public class OptionsFor_QuadraticDiscriminantAnalysis_reg_param extends NumericRangeOptionPredicate {
	
	@Override
	protected double getMin() {
		return 1;
	}

	@Override
	protected double getMax() {
		return 1;
	}

	@Override
	protected int getSteps() {
		return -1;
	}

	@Override
	protected boolean needsIntegers() {
		return false;
	}
}
