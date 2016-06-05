package org.ofbiz.havefun;

import java.util.Locale;
import java.util.Map;

import org.ofbiz.base.util.Debug;
import org.ofbiz.entity.Delegator;
import org.ofbiz.service.DispatchContext;
import org.ofbiz.service.LocalDispatcher;
import org.ofbiz.service.ServiceUtil;

public class HaveFunServices {

	private static final String module = HaveFunServices.class.getName();

	public static Map<String, Object> haveFun(DispatchContext dctx, Map<String, ?> context) {

		Delegator delegator = dctx.getDelegator();
		Locale locale = (Locale) context.get("locale");
		LocalDispatcher localDispatcher = dctx.getDispatcher();
		Map<String, Object> serviceReturnSuccessMap = ServiceUtil.returnSuccess();

		try {

		} catch (Exception e) {
			e.printStackTrace();
			Debug.logError(e.toString(), module);
		}

		return serviceReturnSuccessMap;
	}
}
