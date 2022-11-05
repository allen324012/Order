package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import Dao.porderDao;
import model.porder;

public class AddPorder implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String Name=request.getParameter("name");
		int LCD=Integer.parseInt(request.getParameter("lcd"));
		int RAM=Integer.parseInt(request.getParameter("ram"));
		porder p=new porder();
		p.setName(Name);
		p.setLcd(LCD);
		p.setRam(RAM);
		
		//new porderDao().add(p);
		
		return  new ModelAndView("ok.jsp");
	}

}
