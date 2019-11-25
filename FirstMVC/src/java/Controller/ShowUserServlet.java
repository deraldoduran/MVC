/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author duran
 */
public class ShowUserServlet extends HttpServlet {

    
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher  dispatcher;//o servlet é um container e o RequestDispatcher é um framework que esconde o caminho da pagina
           
            String puser = request.getParameter("user");
            String psenha = request.getParameter("senha");
            String pmodo  = request.getParameter("modo");
            
            String pagina = "/erro.jsp";
            if(puser.equals("dd")&& psenha.equals("123")){
               
                Usuario usu = new Usuario();
                usu.setId(1010);
                usu.setNome("dd");
                usu.setSobrenome("pp");
                usu.setEmail("dd@dd.com");
               
                pagina = "/ok.jsp";
                if(pmodo.equals("html")){
                    
                    pagina = "/ok.jsp";
                    request.setAttribute("usuario", usu);
                }else{
                    Gson gson = new Gson();
                    String resultado=gson.toJson(usu);
                    request.setAttribute("resultadojson", resultado);
                    pagina="/result.jsp";
                }
            }
        
            dispatcher = getServletContext().getRequestDispatcher(pagina);  //recebe da pasta da raiz do servlet o caminho para uma página
            dispatcher.forward(request, response);
    }
}
