package cmu.edu.pd.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import edu.cmu.mis.iccfb.model.Quote;

public interface QuoteService extends CrudRepository<Quote, Long>, QuoteServiceCustom {

}
