package blog.monitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

@Aspect
@Component
public class JSONResponseMonitor {
	

	@Around(value = "execution(@blog.annotation.JSONResponse * *(..))")
	public Object objToJSON(ProceedingJoinPoint pjp) throws Throwable {
		Object obj = pjp.proceed();
		Object resp = null;
		JSONObject jsonObject = new JSONObject(3, true);
		jsonObject.put("status", 200);

		if (obj instanceof String) {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode jsonData = mapper.readTree((String) obj);
			jsonObject.put("data", jsonData);
			jsonObject.put("msg", "OK");
			resp = serialize(jsonObject, true);
		} else {
			jsonObject.put("data", obj);
			jsonObject.put("msg", "OK");
			resp = jsonObject;
		}
		return resp;
	}
	
	public String serialize(Object obj, boolean pretty) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();

		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		if (pretty) {
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(
					obj);
		}

		return mapper.writeValueAsString(obj);
	}
}
