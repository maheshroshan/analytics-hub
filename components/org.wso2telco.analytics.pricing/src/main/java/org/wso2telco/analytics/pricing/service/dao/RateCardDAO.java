package org.wso2telco.analytics.pricing.service.dao;

import java.sql.Date;
import java.util.List;
import org.wso2telco.analytics.pricing.AnalyticsPricingException;
import org.wso2telco.analytics.pricing.Tax;

public interface RateCardDAO {

    Object getNBRateCard (String operationId, String applicationId, String api, String category, String subCategory) throws Exception ;

    Object getSBRateCard (String operator, String operation, String applicationId,String api, String category, String subCategory) throws Exception;

    List<Tax> getValidTaxRate (List<String> taxCode, java.sql.Date taxDate) throws Exception;
}