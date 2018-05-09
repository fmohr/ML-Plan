package de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.classifier.basic.BernoulliNB;

import java.util.Arrays;
import java.util.List;

import de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.OptionsPredicate;

/*
    fit_prior : boolean, optional (default=True)
    Whether to learn class prior probabilities or not.
    If false, a uniform prior will be used.


*/
public class OptionsFor_BernoulliNB_fit_prior extends OptionsPredicate {

  private static List<Object> validValues = Arrays.asList(new Object[] { "true" });

  @Override
  protected List<? extends Object> getValidValues() {
    return validValues;
  }
}