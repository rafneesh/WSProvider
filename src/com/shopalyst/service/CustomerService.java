/**
 * 
 */
package com.shopalyst.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import com.shopalyst.exception.GenericException;
import com.shopalyst.model.*;

/**
 * @author Rafne [Email: rafneesh@gmail.com]
 * 
 */

@WebService
public interface CustomerService {

	@WebMethod(operationName = "getEntityData")
	public List<Activity> getEntityData(@WebParam(name = "id") String id)
			throws GenericException; 
}
