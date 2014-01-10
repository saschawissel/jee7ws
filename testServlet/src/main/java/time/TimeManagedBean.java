package time;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name="clock")
@ApplicationScoped
public class TimeManagedBean {
	public String getTime() {
		return new Date().toString();
	}
}
