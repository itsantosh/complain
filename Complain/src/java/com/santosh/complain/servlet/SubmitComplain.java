/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.santosh.complain.servlet;

import com.santosh.complain.entity.Client;
import com.santosh.complain.entity.Complain;
import com.santosh.complain.entity.dao.ClientDao;
import com.santosh.complain.entity.dao.ComplainDao;
import com.santosh.complain.daoimpl.ClientDaoImpl;
import com.santosh.complain.daoimpl.ComplainDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author santosh
 */
public class SubmitComplain extends HttpServlet {

    PrintWriter out = null;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        out = response.getWriter();
        out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        out = response.getWriter();
        out.println("post");
        try { 
            out.println("try");
           
            Client c=new Client();
            Complain comp=new Complain();
            ComplainDao compdao=new ComplainDaoImpl();
            ClientDao cdao=new ClientDaoImpl();
            
            
            c.setFirstName(request.getParameter("firstname"));
            
            c.setLastName(request.getParameter("lastname"));
            c.setEmail(request.getParameter("email"));
            
            int cresult=cdao.insert(c);
            
            int clientid=0;
            for( Client client:cdao.getAll())
                {
                   clientid=client.getId();
                   out.println(clientid);
                }
            
            comp.setTitle(request.getParameter("title"));
            comp.setDescription(request.getParameter("description"));
            comp.setClientId(clientid);
            
            int compresult=compdao.insert(comp);
            
            
          request.getRequestDispatcher("index.jsp").forward(request,response);
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            out.println(ex);
        }   
        
        
    }
    
        
        
    }
