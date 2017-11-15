package mx.com.mwm.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import me.legrange.mikrotik.ApiConnection;
import me.legrange.mikrotik.MikrotikApiException;
import mx.com.mwm.dao.IpFirewallMangle;

public class IpFirewallMangleDAOImpl {
	
	public static List<IpFirewallMangle> getListIpFirewallMangle(){
		ApiConnection con;
		try {
			con = ApiConnection.connect("mercadowispmexico.dyndns.org");
			con.login("sistema","isc2017"); // log in to router
			List<Map<String, String>> rs = con.execute("/ip/firewall/mangle/print");
			/*for(Map<String,String> r:rs)
			{
				System.out.println(r);
			}*/
			List<IpFirewallMangle> listIpFirewallMangle = new ArrayList<IpFirewallMangle>();
			for(Map<String, String> map : rs) {
				IpFirewallMangle mkIpFirewallMangle = new IpFirewallMangle();
				mkIpFirewallMangle.setChain(map.get("chain") != null ? map.get("chain") : null);
				mkIpFirewallMangle.setLog(map.get("log") != null ? map.get("log") : null);
				mkIpFirewallMangle.setId(map.get(".id") != null ? map.get(".id") : null);
				mkIpFirewallMangle.setPackets(map.get("packets") != null ? map.get("packets") : null);
				mkIpFirewallMangle.setDstAddressList(map.get("dst-address-list") != null ? map.get("dst-address-list") : null);
				mkIpFirewallMangle.setNewRoutingMark(map.get("new-routing-mark")!= null ? map.get("new-routing-mark") : null);
				mkIpFirewallMangle.setLogPrefix(map.get("log-prefix")!= null ? map.get("log-prefix") : null);
				mkIpFirewallMangle.setBytes(map.get("bytes")!= null ? map.get("bytes") : null);
				mkIpFirewallMangle.setPasstrough(map.get("passthrough")!= null ? map.get("passthrough") : null);
				mkIpFirewallMangle.setInvalid(map.get("invalid")!= null ? map.get("invalid") : null);
				mkIpFirewallMangle.setAction(map.get("action")!= null ? map.get("action") : null);
				mkIpFirewallMangle.setDynamic(map.get("dynamic")!= null ? map.get("dynamic") : null);
				mkIpFirewallMangle.setDisabled(map.get("disabled")!= null ? map.get("disabled") : null);
				mkIpFirewallMangle.setSrcAddress(map.get("src-address")!= null ? map.get("src-address") : null);
				listIpFirewallMangle.add(mkIpFirewallMangle);
			} 
			con.close(); // disconnect from router
			return listIpFirewallMangle;
		} catch (MikrotikApiException e) {
			e.printStackTrace();
			return null;
		} // connect to router
	}
}
