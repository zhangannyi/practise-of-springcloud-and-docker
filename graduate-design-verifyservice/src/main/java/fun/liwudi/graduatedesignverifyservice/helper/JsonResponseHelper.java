package fun.liwudi.graduatedesignverifyservice.helper;

import fun.liwudi.graduatedesignverifyservice.domain.JsonResponse;
import org.springframework.stereotype.Component;

/**
 * @author 李武第
 */
@Component
public class JsonResponseHelper<T> {
    public JsonResponse getJsonResponse(int code,String msg, T data){
        JsonResponse jsonResponse = new JsonResponse();
        jsonResponse.setCode(code);
        jsonResponse.setMsg(msg);
        jsonResponse.setData(data);
        return jsonResponse;
    }
}
