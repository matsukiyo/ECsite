package com.internousdev.ecsite.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dao.buyItemDAO;
import com.internousdev.ecsite.dto.buyItemDTO;

public class HomeAction extends ActionSupport implements SessionAware {
		private Map<String Object>session;

		public String execute() {
						String result = "login";
						if(session.containsKey("login_user_id")) {
							BuyItemDAO buyItemDAO = new BuyItemDAO();
							BuyItemDTO buyItemDTO =buyItemDAO.getBuyItemInfo():
								session.put("id",buyItemDTO.getID());
								session.put("buyItem_name",buyItemDTO.getItemName());
								session.put("buyItem_price",buyItemDTO.getItemPrice());
								result = SUCCESS;
						}
						return result;
						//↑「execute」メソッドの戻り値として、
						//ログイン状態の場合は「SUCCESS」ログインしていない場合は「"login"」を返します。
		}

		public Map<String,Object> getSession(){
					return this.session;
		}

		@Override
		public void setSession(Map<String,Object>session) {
				this.session = session;
		}
}
