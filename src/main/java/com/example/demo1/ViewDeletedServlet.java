package com.example.demo1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/viewDeletedServlet")
public class ViewDeletedServlet extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        List<Employee> list = EmployeeRepository.getAllDeletedEmployees();

        for (Employee employee : list)
        {
            out.print(employee);
        }
        out.close();
    }
}
