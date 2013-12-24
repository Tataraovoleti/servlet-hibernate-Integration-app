/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import com.dao.DbConn;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author TATARAO
 */
public class Integrate extends HttpServlet {
                
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String fa=request.getParameter("no");
        List l=DbConn.search(fa);
 /*       
        Session sess=new Configuration().configure().buildSessionFactory().openSession();
        Query query=sess.createQuery("from Employee e where e.salary>:fa");
        query.setParameter("fa",fa);
        
        List l=query.list(); */
        Iterator itr=l.iterator();
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
        rd.include(request,response);
        out.println("<br><br><center><table width=450 border=1 cellspacing=4><tr><td>ID</td><td>Name</td><td>Salary</td></tr>");
        while(itr.hasNext())
        {
            Employee emp=(Employee)itr.next();
            out.println("<tr>");
            out.println("<td>"+emp.getEid()+"</td><td>"+emp.getEname()+"</td><td>"+emp.getSalary()+"</td>");
            out.println("</tr>");
        }
        out.println("</table></center>");
    }

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request,response);
    }
}
