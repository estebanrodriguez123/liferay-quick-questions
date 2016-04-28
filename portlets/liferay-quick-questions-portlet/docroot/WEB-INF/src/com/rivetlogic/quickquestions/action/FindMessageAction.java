package com.rivetlogic.quickquestions.action;

import com.liferay.portal.kernel.struts.BaseStrutsAction;
import com.liferay.portal.kernel.struts.StrutsAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletURLFactoryUtil;

import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author joseross
 *
 */
public class FindMessageAction extends BaseStrutsAction {

    public static final String PORTLET_ID = "quickquestionsportlet_WAR_liferayquickquestionsportlet";
    
    public static final String PARAM_PLID = "p_l_id";
    public static final String PARAM_MESSAGE_ID = "messageId";
    public static final String PARAM_TARGET_PAGE = "targetPage";
    
    public static final String VALUE_TARGET_PAGE = "view_question";
    
    @Override
    public String execute(StrutsAction originalStrutsAction, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        
        long plid = ParamUtil.getLong(request, PARAM_PLID);
        long messageId = ParamUtil.getLong(request, PARAM_MESSAGE_ID);
        
        PortletURL portletUrl = PortletURLFactoryUtil
                .create(request, PORTLET_ID, plid, PortletRequest.RENDER_PHASE);
        
        portletUrl.setParameter(PARAM_MESSAGE_ID, Long.toString(messageId));
        portletUrl.setParameter(PARAM_TARGET_PAGE, VALUE_TARGET_PAGE);

        response.sendRedirect(portletUrl.toString());
        
        return null;
    }
    
}
