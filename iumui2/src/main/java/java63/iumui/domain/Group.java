package java63.iumui.domain;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable{
	private static final long serialVersionUID = 1L;

	protected int 			     		gno;
	protected String	      	  name;
	protected String            intro;
	protected Date 			        expireDay;
	protected int               state;
	protected Date              start;
	protected Date              end;
	protected String            schedule;
	protected String 					  color;
	
	@Override
	public String toString() {
		return "Group [gno=" + gno + ", name=" + name + ", intro=" + intro
				+ ", expireDay=" + expireDay + ", state=" + state + ", start="
				+ start + ", end=" + end + ", schedule=" + schedule
				+ ", color=" + color + "]";
	}
	public int getGno() {
		return gno;
	}
	public void setGno(int gno) {
		this.gno = gno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}
	public Date getExpire() {
		return expireDay;
	}
	public void setExpire(Date expire) {
		this.expireDay = expire;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Date getExpireDay() {
		return expireDay;
	}
	public void setExpireDay(Date expireDay) {
		this.expireDay = expireDay;
	}
	public Date getStartday() {
		return start;
	}
	public void setStartday(Date startday) {
		this.start = startday;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date endday) {
		this.end = endday;
	}
}
