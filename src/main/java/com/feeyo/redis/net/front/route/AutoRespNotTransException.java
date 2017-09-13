package com.feeyo.redis.net.front.route;

import java.util.List;

import com.feeyo.redis.engine.codec.RedisRequest;
import com.feeyo.redis.engine.codec.RedisRequestPolicy;

/**
 * 自动响应
 * 
 * @author zhuam
 *
 */
public class AutoRespNotTransException extends Exception {

	private static final long serialVersionUID = -7389705871040422092L;
	
	private List<RedisRequest> requests;
	private List<RedisRequestPolicy> requestPolicys;
	
	public AutoRespNotTransException(String message, 
			List<RedisRequest> requests, List<RedisRequestPolicy> requestPolicys) {
		super(message);
		this.requests = requests;
		this.requestPolicys = requestPolicys;
	}

	public AutoRespNotTransException(String message, Throwable cause, 
			List<RedisRequest> requests, List<RedisRequestPolicy> requestPolicys) {
		super(message, cause);
		this.requests = requests;
		this.requestPolicys = requestPolicys;
	}

	public List<RedisRequest> getRequests() {
		return requests;
	}

	public List<RedisRequestPolicy> getRequestPolicys() {
		return requestPolicys;
	}


}
