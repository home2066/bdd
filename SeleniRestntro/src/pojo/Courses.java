package pojo;

import java.util.List;

public class Courses {

	private List<Webautomation> webauto;
	private List<Api> appium;
	private List<Mobile> mobil;

	public List<Webautomation> getWebauto() {
		return webauto;
	}
	public void setWebauto(List<Webautomation> webauto) {
		this.webauto = webauto;
	}
	public List<Api> getAppium() {
		return appium;
	}
	public void setAppium(List<Api> appium) {
		this.appium = appium;
	}
	public List<Mobile> getMobil() {
		return mobil;
	}
	public void setMobil(List<Mobile> mobil) {
		this.mobil = mobil;
	}

}
