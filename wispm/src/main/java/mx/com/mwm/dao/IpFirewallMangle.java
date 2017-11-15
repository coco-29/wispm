package mx.com.mwm.dao;


import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import mx.com.mwm.dao.impl.IpFirewallMangleDAOImpl;

@ManagedBean
@RequestScoped
public class IpFirewallMangle {
	
	private String id;
	private String chain;
	private String log;
	private String packets;
	private String dstAddressList;
	private String newRoutingMark;
	private String logPrefix;
	private String bytes;
	private String passtrough;
	private String invalid;
	private String action;
	private String dynamic;
	private String disabled;
	private String srcAddress;
	
	public List<IpFirewallMangle> mkIpFirewall; 
	
	public IpFirewallMangle() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getChain() {
		return chain;
	}

	public void setChain(String chain) {
		this.chain = chain;
	}

	public String getLog() {
		return log;
	}

	public void setLog(String log) {
		this.log = log;
	}

	public String getPackets() {
		return packets;
	}

	public void setPackets(String packets) {
		this.packets = packets;
	}

	public String getDstAddressList() {
		return dstAddressList;
	}

	public void setDstAddressList(String dstAddressList) {
		this.dstAddressList = dstAddressList;
	}

	public String getNewRoutingMark() {
		return newRoutingMark;
	}

	public void setNewRoutingMark(String newRoutingMark) {
		this.newRoutingMark = newRoutingMark;
	}

	public String getLogPrefix() {
		return logPrefix;
	}

	public void setLogPrefix(String logPrefix) {
		this.logPrefix = logPrefix;
	}

	public String getPasstrough() {
		return passtrough;
	}

	public void setPasstrough(String passtrough) {
		this.passtrough = passtrough;
	}

	public String getInvalid() {
		return invalid;
	}

	public void setInvalid(String invalid) {
		this.invalid = invalid;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getDynamic() {
		return dynamic;
	}

	public void setDynamic(String dynamic) {
		this.dynamic = dynamic;
	}

	public String getDisabled() {
		return disabled;
	}

	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	public String getSrcAddress() {
		return srcAddress;
	}

	public void setSrcAddress(String srcAddress) {
		this.srcAddress = srcAddress;
	}

	public String getBytes() {
		return bytes;
	}

	public void setBytes(String bytes) {
		this.bytes = bytes;
	}
	
	@PostConstruct
	public void init() {
		mkIpFirewall= IpFirewallMangleDAOImpl.getListIpFirewallMangle();
	}
	
	public List<IpFirewallMangle> listMkIpFirewallMangle() {
		return mkIpFirewall;
	}
	
}
