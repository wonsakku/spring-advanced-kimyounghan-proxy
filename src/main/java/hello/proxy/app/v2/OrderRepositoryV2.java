package hello.proxy.app.v2;

import hello.proxy.util.CommonUtil;

public class OrderRepositoryV2 {

	public void save(String itemId) {
		if(itemId.equals("ex")) {
			throw new IllegalStateException("예외 발생!");
		}
		CommonUtil.sleep(1000);
	}

}
