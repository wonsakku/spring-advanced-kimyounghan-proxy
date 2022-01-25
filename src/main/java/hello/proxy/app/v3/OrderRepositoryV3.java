package hello.proxy.app.v3;

import org.springframework.stereotype.Repository;

import hello.proxy.util.CommonUtil;

@Repository
public class OrderRepositoryV3 {

	public void save(String itemId) {
		if(itemId.equals("ex")) {
			throw new IllegalStateException("예외 발생!");
		}
		CommonUtil.sleep(1000);
	}



}
