package fun.liwudi.graduatedesignuserinfomanage.helper;

import fun.liwudi.graduatedesignuserinfomanage.domain.JsonResponse;
import org.springframework.stereotype.Component;

/**
 * @author 李武第
 */
@Component
public class JsonResponseHelper {
    public JsonResponse getJsonResponse (String msg,int code){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setMsg(msg);
        jsonResponse.setCode(code);
        return jsonResponse;
    }
}
