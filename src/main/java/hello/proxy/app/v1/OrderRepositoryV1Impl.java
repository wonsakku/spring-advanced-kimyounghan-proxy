package hello.proxy.app.v1;

import hello.proxy.util.CommonUtil;

public class OrderRepositoryV1Impl implements OrderRepositoryV1{

	@Override
	public void save(String itemId) {
		
		if(itemId.equals("ex")) {
			throw new IllegalStateException("예외 발생!");
		}
		
		CommonUtil.sleep(1000);
	}
}











