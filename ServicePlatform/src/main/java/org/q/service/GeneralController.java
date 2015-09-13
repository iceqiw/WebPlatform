package org.q.service;


import java.util.HashMap;
import java.util.Map;



import org.q.utils.HttpUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GeneralController {

	/*
	 * 增加和更新用户
	 * 
	 * @ResponseBody 返回的数据自动封装成Json
	 */
	@RequestMapping(value = "/tests.htm", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> test2(@RequestParam("uid") String uid) throws Exception {
		// spring会利用jackson自动将返回值封装成JSON对象，比struts2方便了很多
		Map<String, String> map = new HashMap<String, String>();
		try {
			Map<String, String> p = new HashMap<String, String>();
			p.put("uid", "说的");
			String URL1="http://127.0.0.1:9998/DataPlatform/testd.ds";
			String msg = HttpUtils.httpPost(URL1, p, null);
			map.put("mes", msg);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("mes", "操作失败");
			throw e;
		}
		return map;
	}

}
