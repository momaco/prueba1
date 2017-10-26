package com.operaciones.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operaciones.operacionesMatematicas;

/**
 * Servlet implementation class ServletOperaciones
 */
@WebServlet("/ServletOperaciones")
public class ServletOperaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOperaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Método Get fue llamado");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Método Post fue llamado");
		operacionesMatematicas cuentitas= new operacionesMatematicas();
		
		String snumero1;
		String snumero2;
		float fnumero1;
		float fnumero2;
		//boolean isBigger=false;
		//boolean isNegative=false;
		//boolean isCalification=false;
		snumero1=request.getParameter("txtNumber1");
		snumero2=request.getParameter("txtNumber2");
		//response.getWriter().append("La suma es: "+ (snumero1+snumero2));
		
		fnumero1=Float.parseFloat(snumero1);
		fnumero2=Float.parseFloat(snumero2);
		
		cuentitas.setNumero1(fnumero1);
		cuentitas.setNumero2(fnumero2);
		
		
		response.getWriter().append("La suma es: "+ (cuentitas.sumar()+"</br>"));
		response.getWriter().append("La resta es: "+ (cuentitas.restar()+"</br>"));
		response.getWriter().append("La división es: "+ (cuentitas.dividir()+"</br>"));
		response.getWriter().append("La multiplicación es: "+ (cuentitas.multiplicar()+"</br>"));
		
		if(cuentitas.sumar()>10) {
			response.sendRedirect("mayo10.jsp");
		}
		if(cuentitas.sumar()<0) {
			response.sendRedirect("negativos.jsp");
		}
		if(cuentitas.sumar()>=0 && cuentitas.sumar()<=10) {
			response.sendRedirect("calificaciones.jsp");
		}
	}

}
